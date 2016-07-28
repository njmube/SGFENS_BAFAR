<%-- 
    Document   : catCategoriaProveedor_ajax
    Created on : 11/08/2015, 04:34:19 PM
    Author     : leonardo
--%>

<%@page import="com.tsp.sct.util.test.qryAlmacenProductos"%>
<%@page import="java.util.regex.Matcher"%>
<%@page import="com.tsp.sct.bo.SGProveedorCategoriaBO"%>
<%@page import="com.tsp.sct.mail.TspMailBO"%>
<%@page import="com.tsp.sct.util.Encrypter"%>
<%@page import="com.tsp.sct.dao.jdbc.LdapDaoImpl"%>
<%@page import="com.tsp.sct.dao.dto.Ldap"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="com.tsp.sct.dao.jdbc.SgfensProveedorCategoriaDaoImpl"%>
<%@page import="com.tsp.sct.dao.dto.SgfensProveedorCategoria"%>
<%@page import="com.tsp.sct.util.GenericValidator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" scope="session" class="com.tsp.sct.bo.UsuarioBO"/>
<%
    String mode = "";
    
    int idEmpresa = user.getUser().getIdEmpresa();
    
    /*
    * Parámetros
    */
    int idSgfensProveedorCategoria = -1;
    String nombreSgfensProveedorCategoria ="";
    String descripcion ="";  
    int estatus = 2;//deshabilitado
    
    /*
    * Recepción de valores
    */
    mode = request.getParameter("mode")!=null?request.getParameter("mode"):"";
    try{
        idSgfensProveedorCategoria = Integer.parseInt(request.getParameter("idSgfensProveedorCategoria"));
    }catch(NumberFormatException ex){}
    nombreSgfensProveedorCategoria = request.getParameter("nombreSgfensProveedorCategoria")!=null?new String(request.getParameter("nombreSgfensProveedorCategoria").getBytes("ISO-8859-1"),"UTF-8"):"";
    descripcion = request.getParameter("descripcion")!=null?new String(request.getParameter("descripcion").getBytes("ISO-8859-1"),"UTF-8"):"";    
    try{
        estatus = Integer.parseInt(request.getParameter("estatus"));
    }catch(NumberFormatException ex){}   
    
    /*
    * Validaciones del servidor
    */
    String msgError = "";
    GenericValidator gc = new GenericValidator();    
    if(!gc.isValidString(nombreSgfensProveedorCategoria, 1, 30))
        msgError += "<ul>El dato 'nombre' es requerido.";
    if(!gc.isValidString(descripcion, 1, 100))
        msgError += "<ul>El dato 'descripción' es requerido";   
    if(idSgfensProveedorCategoria <= 0 && (!mode.equals("")))
        msgError += "<ul>El dato ID 'SgfensProveedorCategoria' es requerido";
    /*
    if(idVendedor<=0)
        msgError += "<ul>El dato 'Vendedor' es requerido";
 * */

    if(msgError.equals("")){
        if(idSgfensProveedorCategoria>0){
            if (mode.equals("1")){
            /*
            * Editar
            */
                SGProveedorCategoriaBO sgfensProveedorCategoriaBO = new SGProveedorCategoriaBO(idSgfensProveedorCategoria,user.getConn());
                SgfensProveedorCategoria sgfensProveedorCategoriaDto = sgfensProveedorCategoriaBO.getSgfensProveedorCategoria();
                
                sgfensProveedorCategoriaDto.setIdEstatus(estatus);
                sgfensProveedorCategoriaDto.setNombre(nombreSgfensProveedorCategoria);
                sgfensProveedorCategoriaDto.setDescripcion(descripcion);
               
                
                try{
                    new SgfensProveedorCategoriaDaoImpl(user.getConn()).update(sgfensProveedorCategoriaDto.createPk(), sgfensProveedorCategoriaDto);

                    out.print("<!--EXITO-->Registro actualizado satisfactoriamente");
                }catch(Exception ex){
                    out.print("<!--ERROR-->No se pudo actualizar el registro. Informe del error al administrador del sistema: " + ex.toString());
                    ex.printStackTrace();
                }
                
            }else{
                out.print("<!--ERROR-->Acción no válida.");
            }
        }else{
            /*
            *  Nuevo
            */
            
            try {                
                
                // Peligro!!!
                // No quitar comentario , esto se ejecutara solamente una vez
                //cuando se libere lo de almacenes, posteriormente se elmininara    02/07/2015
                
                //qryAlmacenProductos.queryprods();
                
                //------------------------------------
                
                
                /**
                 * Creamos el registro de Cliente
                 */
                SgfensProveedorCategoria sgfensProveedorCategoriaDto = new SgfensProveedorCategoria();
                SgfensProveedorCategoriaDaoImpl sgfensProveedorCategoriasDaoImpl = new SgfensProveedorCategoriaDaoImpl(user.getConn());
                
                sgfensProveedorCategoriaDto.setIdEstatus(estatus);
                sgfensProveedorCategoriaDto.setNombre(nombreSgfensProveedorCategoria);
                sgfensProveedorCategoriaDto.setDescripcion(descripcion);                              
                sgfensProveedorCategoriaDto.setIdEmpresa(idEmpresa);

                /**
                 * Realizamos el insert
                 */
                sgfensProveedorCategoriasDaoImpl.insert(sgfensProveedorCategoriaDto);

                out.print("<!--EXITO-->Registro creado satisfactoriamente.<br/>");
            
            }catch(Exception e){
                e.printStackTrace();
                msgError += "Ocurrio un error al guardar el registro: " + e.toString() ;
            }
        }
    }else{
        out.print("<!--ERROR-->"+msgError);
    }

%>