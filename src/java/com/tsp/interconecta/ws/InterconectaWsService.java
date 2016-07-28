
package com.tsp.interconecta.ws;

import com.tsp.sct.config.Configuration;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "InterconectaWsService", targetNamespace = "http://ws.interconecta.tsp.com/", wsdlLocation = "http://sctmixcoac.from-la.net:8083/CMM_Pruebas/InterconectaWs?wsdl")
public class InterconectaWsService
    extends Service
{

    private final static URL INTERCONECTAWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException INTERCONECTAWSSERVICE_EXCEPTION;
    private final static QName INTERCONECTAWSSERVICE_QNAME = new QName("http://ws.interconecta.tsp.com/", "InterconectaWsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            Configuration appConfig = new Configuration();
            //url = new URL("http://localhost:8084/CMM/InterconectaWs?wsdl");
            url = new URL(appConfig.getPac_ws_timbrado_url());
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INTERCONECTAWSSERVICE_WSDL_LOCATION = url;
        INTERCONECTAWSSERVICE_EXCEPTION = e;
    }

    public InterconectaWsService() {
        super(__getWsdlLocation(), INTERCONECTAWSSERVICE_QNAME);
    }

    public InterconectaWsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INTERCONECTAWSSERVICE_QNAME, features);
    }

    public InterconectaWsService(URL wsdlLocation) {
        super(wsdlLocation, INTERCONECTAWSSERVICE_QNAME);
    }

    public InterconectaWsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INTERCONECTAWSSERVICE_QNAME, features);
    }

    public InterconectaWsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InterconectaWsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns InterconectaWs
     */
    @WebEndpoint(name = "InterconectaWsPort")
    public InterconectaWs getInterconectaWsPort() {
        return super.getPort(new QName("http://ws.interconecta.tsp.com/", "InterconectaWsPort"), InterconectaWs.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InterconectaWs
     */
    @WebEndpoint(name = "InterconectaWsPort")
    public InterconectaWs getInterconectaWsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.interconecta.tsp.com/", "InterconectaWsPort"), InterconectaWs.class, features);
    }

    private static URL __getWsdlLocation() {
        if (INTERCONECTAWSSERVICE_EXCEPTION!= null) {
            throw INTERCONECTAWSSERVICE_EXCEPTION;
        }
        return INTERCONECTAWSSERVICE_WSDL_LOCATION;
    }

}
