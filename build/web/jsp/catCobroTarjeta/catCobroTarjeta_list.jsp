<%-- 
    Document   : catCobroTarjeta_list
    Created on : 2/04/2013, 02:19:42 PM
    Author     : Leonardo
--%>

<%@page import="com.tsp.sct.bo.ParametrosBO"%>
<%@page import="com.tsp.sct.bo.RolAutorizacionBO"%>
<%@page import="com.tsp.sgfens.report.ReportBO"%>
<%@page import="com.tsp.sct.dao.dto.BancoOperacion"%>
<%@page import="com.tsp.sct.bo.BancoOperacionBO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="session" class="com.tsp.sct.bo.UsuarioBO"/>

<%
//Verifica si el usuario tiene acceso a este topico
if (user == null || !user.permissionToTopicByURL(request.getRequestURI().replace(request.getContextPath(), ""))) {
    response.sendRedirect("../../jsp/inicio/login.jsp?action=loginRequired&urlSource=" + request.getRequestURI() + "?" + request.getQueryString());
    response.flushBuffer();
} else {
    
    String buscar = request.getParameter("q")!=null? new String(request.getParameter("q").getBytes("ISO-8859-1"),"UTF-8") :"";
    String filtroBusqueda = "";
    if (!buscar.trim().equals(""))
        filtroBusqueda = " AND (NO_TARJETA LIKE '%" + buscar + "%' OR NOMBRE_TITULAR LIKE '%" +buscar+"%')";
    
    int idBancoOperacion = -1;
    try{ idBancoOperacion = Integer.parseInt(request.getParameter("idBancoOperacion")); }catch(NumberFormatException e){}
    
    int idEmpresa = user.getUser().getIdEmpresa();
    
    /*
    * Paginación
    */
    int paginaActual = 1;
    double registrosPagina = new ParametrosBO(user.getConn()).getParametroDouble("app.preto.paginacion.registrosPorPagina"); //10;
    double limiteRegistros = 0;
    int paginasTotales = 0;
    int numeroPaginasAMostrar = 5;

    try{
        paginaActual = Integer.parseInt(request.getParameter("pagina"));
    }catch(Exception e){}

    try{
        registrosPagina = Integer.parseInt(request.getParameter("registros_pagina"));
    }catch(Exception e){}
    
     BancoOperacionBO bancoOperacionBO = new BancoOperacionBO(user.getConn());
     BancoOperacion[] bancoOperacionsDto = new BancoOperacion[0];
     try{
         limiteRegistros = bancoOperacionBO.findBancoOperaciones(idBancoOperacion, idEmpresa , 0, 0, filtroBusqueda).length;
         
         if (!buscar.trim().equals(""))
             registrosPagina = limiteRegistros;
         
         paginasTotales = (int)Math.ceil(limiteRegistros / registrosPagina);

        if(paginaActual<0)
            paginaActual = 1;
        else if(paginaActual>paginasTotales)
            paginaActual = paginasTotales;

        bancoOperacionsDto = bancoOperacionBO.findBancoOperaciones(idBancoOperacion, idEmpresa,
                ((paginaActual - 1) * (int)registrosPagina), (int)registrosPagina,
                filtroBusqueda);

     }catch(Exception ex){
         ex.printStackTrace();
     }
     
     /*
    * Datos de catálogo
    */
    String urlTo = "../catCobroTarjeta/catCobroTarjeta_form.jsp";
    String urlTo2 = "../catCobroTarjeta/catCobroTarjeta_ticket.jsp";
    String urlTo3 = "../catCobroTarjetaToken/catCobroTarjetaToken_list.jsp";
    String urlTo4 = "../catCobroTarjetaBanwire/catCobroTarjetaBanwire_form.jsp";
    String paramName = "idBancoOperacion";
    String parametrosPaginacion="";// "idEmpresa="+idEmpresa;
    String filtroBusquedaEncoded = java.net.URLEncoder.encode(filtroBusqueda, "UTF-8");
    
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="../include/keyWordSEO.jsp" />

        <title><jsp:include page="../include/titleApp.jsp" /></title>

        <jsp:include page="../include/skinCSS.jsp" />

        <jsp:include page="../include/jsFunctions.jsp"/>
        
        <script type="text/javascript">
            
        </script>

    </head>
    <body>
        <div class="content_wrapper">

            <jsp:include page="../include/header.jsp" flush="true"/>

            <jsp:include page="../include/leftContent.jsp"/>

            <!-- Inicio de Contenido -->
            <div id="content">

                <div class="inner">
                    <h1>Pago con Tarjeta</h1>
                    
                    <div id="ajax_loading" class="alert_info" style="display: none;"></div>
                    <div id="ajax_message" class="alert_warning" style="display: none;"></div>

                    <div class="onecolumn">
                        <div class="header">
                            <span>
                                <img src="../../images/icon_tarjetas.png" alt="icon"/>
                                Pagos con Tarjeta
                            </span>
                            <div class="switch" style="width:500px">
                                <table width="500px" cellpadding="0" cellspacing="0">
                                    <tbody>
                                            <tr>
                                                <td>
                                                    <div id="search">
                                                        <form action="catCobroTarjeta_list.jsp" id="search_form" name="search_form" method="get">
                                                            <input type="text" id="q" name="q" title="Buscar por # de Tarjeta / Titular" class="" style="width: 215px; float: left; "
                                                                    value="<%=buscar%>"/>
                                                            <input type="image" src="../../images/Search-32_2.png" id="buscar" name="buscar"  value="" style="cursor: pointer; width: 30px; height: 25px; float: left"/>
                                                    </form>
                                                    </div>
                                                </td>
                                                <td class="clear">&nbsp;&nbsp;&nbsp;</td>
                                                <%if(RolAutorizacionBO.permisoNuevoElemento(user.getUser().getIdRoles())){%>
                                                
                                                <!--<td>
                                                    <input type="button" id="nuevo" name="nuevo" class="right_switch" value="Nuevo Pago" 
                                                            style="float: right; width: 100px;" onclick="location.href='<%=urlTo%>'"/>
                                                </td>-->
                                                <!--<td>
                                                    <input type="button" id="token" name="token" class="right_switch" value="Token's"
                                                            style="float: right; width: 100px;" onclick="location.href='<%=urlTo3%>'"/>
                                                </td>-->
                                                <td>
                                                    <input type="button" id="token" name="token" class="right_switch" value="Nuevo Pago"
                                                            style="float: right; width: 100px;" onclick="location.href='<%=urlTo4%>'"/>
                                                </td>
                                                <%}%>
                                            </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <br class="clear"/>
                        <div class="content">
                            <form id="form_data" name="form_data" action="" method="post">
                                <table class="data" width="100%" cellpadding="0" cellspacing="0">
                                    <thead>
                                        <tr>
                                            <th>ID</th>
                                            <th>No Tarjeta</th>
                                            <th>Titular</th>
                                            <th>Monto</th>
                                            <th>Order ID</th>
                                            <th>Fecha Operación</th>                                            
                                            <th>Estatus</th>
                                            <th>Acciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% 
                                            for (BancoOperacion item:bancoOperacionsDto){
                                                try{
                                        %>
                                        <tr <%=(item.getIdEstatus()==2)?"class='inactive'":""%>>
                                            <!--<td><input type="checkbox"/></td>-->
                                            <td><%=item.getIdOperacionBancaria()%></td>
                                            <td><%=item.getNoTarjeta() %></td>
                                            <td><%=item.getNombreTitular()%></td>
                                            <td><%=item.getMonto()%></td>
                                            <td><%=item.getBancoOrderId()%></td>
                                            <td><%=item.getBancoOperFecha()%></td>
                                            <td><%=(item.getIdEstatus() == 1 && item.getBancoAuth().equals("Pendiente Pago Oxxo")) ? item.getBancoAuth() : (item.getIdEstatus() == 1 ? "Pagado" : item.getIdEstatus() == 2 ? "Cancelado" : item.getIdEstatus() == 3 ? "Pendiente Pago Oxxo" : item.getIdEstatus() == 4 ? "Pagado Oxxo" : "")%></td>
                                            
                                            <td>
                                                <%if(RolAutorizacionBO.permisoAccionesElemento(user.getUser().getIdRoles())){%>
                                                <%if(item.getIdEstatus() == 1){%>
                                                    <!--<a href="<%=urlTo%>?<%=paramName%>=<%=item.getIdOperacionBancaria()%>&acc=1"><img src="../../images/icon_delete.png" alt="cancelar" class="help" title="Cancelar"/></a>-->
                                                <%}%>
                                                <%}%>
                                                <a href="<%=urlTo2%>?<%=paramName%>=<%=item.getIdOperacionBancaria()%>&acc=ticketImprime"><img src="../../images/icon_pdf.png" alt="tiketImprime" class="help" title="Recibo"/></a>
                                                <a href="<%=urlTo2%>?<%=paramName%>=<%=item.getIdOperacionBancaria()%>&acc=ticketImprime&copia=1"><img src="../../images/icon_pdf.png" alt="tiketImprime" class="help" title="Recibo Copia"/></a>
                                                &nbsp;&nbsp;
                                                <!--<a href=""><img src="images/icon_delete.png" alt="delete" class="help" title="Delete"/></a>-->
                                            </td>                                            
                                        </tr>
                                        <%      }catch(Exception ex){
                                                    ex.printStackTrace();
                                                }
                                            } 
                                        %>
                                    </tbody>
                                </table>
                            </form>

                            <!-- INCLUDE OPCIONES DE EXPORTACIÓN-->
                            <jsp:include page="../include/reportExportOptions.jsp" flush="true">
                                <jsp:param name="idReport" value="<%= ReportBO.PAGOS_TARJETA_REPORT %>" />
                                <jsp:param name="parametrosCustom" value="<%= filtroBusquedaEncoded %>" />
                            </jsp:include>
                            <!-- FIN INCLUDE OPCIONES DE EXPORTACIÓN-->
                                    
                            <jsp:include page="../include/listPagination.jsp">
                                <jsp:param name="paginaActual" value="<%=paginaActual%>" />
                                <jsp:param name="numeroPaginasAMostrar" value="<%=numeroPaginasAMostrar%>" />
                                <jsp:param name="paginasTotales" value="<%=paginasTotales%>" />
                                <jsp:param name="url" value="<%=request.getRequestURI() %>" />
                                <jsp:param name="parametrosAdicionales" value="<%=parametrosPaginacion%>" />
                            </jsp:include>
                            
                        </div>
                    </div>

                </div>

                <jsp:include page="../include/footer.jsp"/>
            </div>
            <!-- Fin de Contenido-->
        </div>


    </body>
</html>
<%}%>