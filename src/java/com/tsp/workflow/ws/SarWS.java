
package com.tsp.workflow.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SarWS", targetNamespace = "http://ws.workflow.tsp.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SarWS {


    /**
     * 
     * @param accesoRequest
     * @param consultaComprobanteRequest
     * @return
     *     returns com.tsp.workflow.ws.ConsultaComprobanteResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComprobantes", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.GetComprobantes")
    @ResponseWrapper(localName = "getComprobantesResponse", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.GetComprobantesResponse")
    @Action(input = "http://ws.workflow.tsp.com/SarWS/getComprobantesRequest", output = "http://ws.workflow.tsp.com/SarWS/getComprobantesResponse")
    public ConsultaComprobanteResponse getComprobantes(
        @WebParam(name = "accesoRequest", targetNamespace = "")
        AccesoRequest accesoRequest,
        @WebParam(name = "consultaComprobanteRequest", targetNamespace = "")
        ConsultaComprobanteRequest consultaComprobanteRequest);

    /**
     * 
     * @param accesoRequest
     * @param consultaComprobanteRequest
     * @return
     *     returns com.tsp.workflow.ws.ConsultaFlujoComprobanteResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getFlujoComprobantes", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.GetFlujoComprobantes")
    @ResponseWrapper(localName = "getFlujoComprobantesResponse", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.GetFlujoComprobantesResponse")
    @Action(input = "http://ws.workflow.tsp.com/SarWS/getFlujoComprobantesRequest", output = "http://ws.workflow.tsp.com/SarWS/getFlujoComprobantesResponse")
    public ConsultaFlujoComprobanteResponse getFlujoComprobantes(
        @WebParam(name = "accesoRequest", targetNamespace = "")
        AccesoRequest accesoRequest,
        @WebParam(name = "consultaComprobanteRequest", targetNamespace = "")
        ConsultaComprobanteRequest consultaComprobanteRequest);

    /**
     * 
     * @param accesoRequest
     * @return
     *     returns com.tsp.workflow.ws.ConsultaDatosGralProveedorResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDatosGeneralProveedor", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.GetDatosGeneralProveedor")
    @ResponseWrapper(localName = "getDatosGeneralProveedorResponse", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.GetDatosGeneralProveedorResponse")
    @Action(input = "http://ws.workflow.tsp.com/SarWS/getDatosGeneralProveedorRequest", output = "http://ws.workflow.tsp.com/SarWS/getDatosGeneralProveedorResponse")
    public ConsultaDatosGralProveedorResponse getDatosGeneralProveedor(
        @WebParam(name = "accesoRequest", targetNamespace = "")
        AccesoRequest accesoRequest);

    /**
     * 
     * @param accesoRequest
     * @param registraComprobanteRequest
     * @return
     *     returns com.tsp.workflow.ws.RegistraComprobanteResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setComprobante", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.SetComprobante")
    @ResponseWrapper(localName = "setComprobanteResponse", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.SetComprobanteResponse")
    @Action(input = "http://ws.workflow.tsp.com/SarWS/setComprobanteRequest", output = "http://ws.workflow.tsp.com/SarWS/setComprobanteResponse")
    public RegistraComprobanteResponse setComprobante(
        @WebParam(name = "accesoRequest", targetNamespace = "")
        AccesoRequest accesoRequest,
        @WebParam(name = "registraComprobanteRequest", targetNamespace = "")
        RegistraComprobanteRequest registraComprobanteRequest);

    /**
     * 
     * @param editaComprobanteRequest
     * @param accesoRequest
     * @return
     *     returns com.tsp.workflow.ws.RegistraComprobanteResponse
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "editComprobante", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.EditComprobante")
    @ResponseWrapper(localName = "editComprobanteResponse", targetNamespace = "http://ws.workflow.tsp.com/", className = "com.tsp.workflow.ws.EditComprobanteResponse")
    @Action(input = "http://ws.workflow.tsp.com/SarWS/editComprobanteRequest", output = "http://ws.workflow.tsp.com/SarWS/editComprobanteResponse")
    public RegistraComprobanteResponse editComprobante(
        @WebParam(name = "accesoRequest", targetNamespace = "")
        AccesoRequest accesoRequest,
        @WebParam(name = "editaComprobanteRequest", targetNamespace = "")
        EditaComprobanteRequest editaComprobanteRequest);

}
