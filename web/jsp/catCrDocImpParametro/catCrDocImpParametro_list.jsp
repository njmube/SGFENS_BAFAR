<%-- 
    Document   : catCrDocImpParametro_list
    Created on : 30/06/2016, 12:55:48 PM
    Author     : ISCesar
--%>


<%@page import="com.tsp.sct.bo.CrDocImprimibleBO"%>
<%@page import="com.tsp.sct.dao.dto.CrDocImprimible"%>
<%@page import="com.tsp.sct.util.DateManage"%>
<%@page import="com.tsp.sct.util.StringManage"%>
<%@page import="com.tsp.sgfens.report.ReportBO"%>
<%@page import="com.tsp.sct.bo.RolAutorizacionBO"%>
<%@page import="com.tsp.sct.bo.ParametrosBO"%>
<%@page import="com.tsp.sct.dao.dto.CrDocImpParametro"%>
<%@page import="com.tsp.sct.bo.CrDocImpParametroBO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="session" class="com.tsp.sct.bo.UsuarioBO"/>

<%
//Verifica si el usuario tiene acceso a este topico
if (user == null || !user.permissionToTopicByURL(request.getRequestURI().replace(request.getContextPath(), ""))) {
    response.sendRedirect("../../jsp/inicio/login.jsp?action=loginRequired&urlSource=" + request.getRequestURI() + "?" + request.getQueryString());
    response.flushBuffer();
} else {
    
    String buscar = request.getParameter("q")!=null? new String(request.getParameter("q").getBytes("ISO-8859-1"),"UTF-8") :"";
    String buscar_isMostrarSoloActivos = request.getParameter("inactivos")!=null?request.getParameter("inactivos"):"0";
    
    String filtroBusqueda = "";
    if (!buscar.trim().equals(""))
        filtroBusqueda += " AND (parametro_clave LIKE '%" + buscar + "%' OR descripcion LIKE '%" + buscar + "%')";
    
    if (buscar_isMostrarSoloActivos.trim().equals("1")){
        filtroBusqueda += " AND ID_ESTATUS != 1 ";
    }else{
        filtroBusqueda += " AND ID_ESTATUS = 1 ";
    }
    
    int idCrDocImpParametro = -1;
    try{ idCrDocImpParametro = Integer.parseInt(request.getParameter("idCrDocImpParametro")); }catch(NumberFormatException e){}
    
    int idCrDocImprimible = -1;
    try{ idCrDocImprimible = Integer.parseInt(request.getParameter("idCrDocImprimible")); }catch(NumberFormatException e){}
    
    if (idCrDocImprimible>0){
        filtroBusqueda += " AND id_doc_imprimible=" + idCrDocImprimible;
    }
    
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
    
    CrDocImpParametroBO crDocImpParametroBO = new CrDocImpParametroBO(user.getConn());
    crDocImpParametroBO.setOrderBy(" ORDER BY id_doc_imprimible DESC, id_doc_imp_parametro ASC ");
    CrDocImpParametro[] crDocImpParametroDto = new CrDocImpParametro[0];
    try{
        limiteRegistros = crDocImpParametroBO.findCantidadCrDocImpParametros(idCrDocImpParametro, idEmpresa , 0, 0, filtroBusqueda);

        if (!buscar.trim().equals(""))
            registrosPagina = limiteRegistros;

        paginasTotales = (int)Math.ceil(limiteRegistros / registrosPagina);

        if(paginaActual<0)
            paginaActual = 1;
        else if(paginaActual>paginasTotales)
            paginaActual = paginasTotales;

        crDocImpParametroDto = crDocImpParametroBO.findCrDocImpParametros(idCrDocImpParametro, idEmpresa,
               ((paginaActual - 1) * (int)registrosPagina), (int)registrosPagina,
               filtroBusqueda);

    }catch(Exception ex){
        ex.printStackTrace();
    }
     
     /*
    * Datos de catálogo
    */
    String urlTo = "../catCrDocImpParametro/catCrDocImpParametro_form.jsp";
    String paramName = "idCrDocImpParametro";
    String parametrosPaginacion="q="+buscar+"&inactivos="+buscar_isMostrarSoloActivos+"&idCrDocImprimible="+idCrDocImprimible;
    String filtroBusquedaEncoded = java.net.URLEncoder.encode(filtroBusqueda, "UTF-8");
    
    
    CrDocImprimible crDocImprimible = null;
    CrDocImprimibleBO crDocImprimibleBO = new CrDocImprimibleBO(user.getConn());
    if (idCrDocImprimible>0){
        crDocImprimibleBO = new CrDocImprimibleBO(idCrDocImprimible, user.getConn());
        crDocImprimible = crDocImprimibleBO.getCrDocImprimible();
    }
    
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="../include/keyWordSEO.jsp" />

        <title><jsp:include page="../include/titleApp.jsp" /></title>

        <jsp:include page="../include/skinCSS.jsp" />

        <jsp:include page="../include/jsFunctions2.jsp"/>
        
        <script type="text/javascript">
            
            function inactiv(){               
                if($("#inactivos").attr("checked")){
                    $("#inactivos").val("1");
                }else{
                     $("#inactivos").val("0");
                }
            }
            
        </script>

    </head>
    <body>
        <div class="content_wrapper">

            <jsp:include page="../include/header.jsp" flush="true"/>

            <jsp:include page="../include/leftContent.jsp"/>

            <!-- Inicio de Contenido -->
            <div id="content">

                <div class="inner">
                    <h1>Documentos Imprimibles</h1>
                    
                    <div id="ajax_loading" class="alert_info" style="display: none;"></div>
                    <div id="ajax_message" class="alert_warning" style="display: none;"></div>

                    <div class="onecolumn">
                        <div class="header">
                            <span>
                                Busqueda Avanzada &dArr;
                            </span>
                        </div>
                        <br class="clear"/>
                        <div class="content" style="display: none;">
                            <form action="catCrDocImpParametro_list.jsp" id="search_form_advance" name="search_form_advance" method="post">                                  
                                <p>
                                    <select id="idCrDocImprimible" name="idCrDocImprimible">
                                        <option value="-1">-Filtrar por Documento Imprimible-</option>
                                        <%= crDocImprimibleBO.getCrDocImprimiblesByIdHTMLCombo(idEmpresa, idCrDocImprimible, 0, 0, "") %>
                                    </select>
                                </p>
                                <br/>
                                
                                <p>
                                    <input type="checkbox" class="checkbox" id="inactivos" name="inactivos" value="1"  onchange="inactiv();" > <label for="inactivos">Mostrar Inactivos</label>                                   
                                </p>
                                <br/>
                            
                                <div id="action_buttons">
                                    <p>
                                        <input type="button" id="buscar" value="Buscar" onclick="$('#search_form_advance').submit();"/>
                                    </p>
                                </div>
                                
                            </form>
                        </div>
                    </div>
                    
                    <div class="onecolumn">
                        <div class="header">
                            <span>
                                <img src="../../images/icon_crDocImprimible.png" alt="icon"/>
                                Catálogo de Parámetros de Imprimible <%= crDocImprimible!=null ? "'" + crDocImprimible.getNombre() + "'": "" %>
                            </span>
                            <div class="switch" style="width:500px">
                                <table width="500px" cellpadding="0" cellspacing="0">
                                    <tbody>
                                        <tr>
                                            <td>
                                                <div id="search">
                                                <form action="catCrDocImpParametro_list.jsp" id="search_form" name="search_form" method="get">
                                                    <input type="hidden" name="idCrDocImprimible" value="<%= idCrDocImprimible %>"/>
                                                    <input type="text" id="q" name="q" title="Buscar por Parametro/Descripcion" class="" style="width: 300px; float: left; "
                                                           value="<%=buscar%>"/>
                                                    <input type="image" src="../../images/Search-32_2.png" id="buscar" name="buscar"  value="" style="cursor: pointer; width: 30px; height: 25px; float: left"/>
                                                </form>
                                                </div>
                                            </td>
                                            <td class="clear">&nbsp;&nbsp;&nbsp;</td>
                                            <%if(RolAutorizacionBO.permisoNuevoElemento(user.getUser().getIdRoles())){%>
                                            <td>
                                                <input type="button" id="nuevo" name="nuevo" class="right_switch" value="Crear Nuevo" 
                                                       style="float: right; width: 100px;" onclick="location.href='<%=urlTo%>?idCrDocImprimible=<%=idCrDocImprimible%>'"/>
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
                                            <th>Parametro</th>
                                            <th>Descripcion</th>                                            
                                            <th>Valor Defecto</th>
                                            <th>Variable Form. Asociada</th>
                                            <th>Estatus</th>
                                            <th>Acciones</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <% 
                                            for (CrDocImpParametro item : crDocImpParametroDto){
                                                try{
                                        %>
                                        <tr <%=(item.getIdEstatus()!=1)?"class='inactive'":""%>>
                                            <!--<td><input type="checkbox"/></td>-->
                                            <td><%= item.getIdDocImpParametro()%></td>
                                            <td><%= StringManage.getValidString(item.getParametroClave()) %></td>
                                            <td><%= StringManage.getValidString(item.getDescripcion()) %></td>
                                            <td><%= StringManage.getValidString(item.getValorDefecto()) %></td>
                                            <td><%= StringManage.getValidString(item.getAsociaVariableFormula()) %></td>
                                            <td><%= (item.getIdEstatus()==1)?"Activo":"Inactivo" %></td>
                                            <td>
                                                <%if(RolAutorizacionBO.permisoAccionesElemento(user.getUser().getIdRoles())){%>
                                                <a href="<%=urlTo%>?<%=paramName%>=<%=item.getIdDocImpParametro()%>&acc=1&pagina=<%=paginaActual%>&idCrDocImprimible=<%= idCrDocImprimible %>"><img src="../../images/icon_edit.png" alt="editar" class="help" title="Editar"/></a>
                                                &nbsp;&nbsp;
                                                <%}%>
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
                                <jsp:param name="idReport" value="<%= ReportBO.CR_DOC_IMP_PARAMETRO_REPORT %>" />
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

        <script>
            $("select.flexselect").flexselect();
        </script>
    </body>
</html>
<%}%>