
package com.sap.bafar.ws.creacontrato;

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
@WebServiceClient(name = "zws_crea_inter", targetNamespace = "urn:sap-com:document:sap:soap:functions:mc-style", wsdlLocation = "http://svecdap1.grupobafar.com:8000/sap/bc/srt/wsdl/flv_10002A111AD1/srvc_url/sap/bc/srt/rfc/sap/zws_crea_inter/400/zws_crea_inter/z_bin_inter?sap-client=400")
public class ZwsCreaInter_Service
    extends Service
{

    private final static URL ZWSCREAINTER_WSDL_LOCATION;
    private final static WebServiceException ZWSCREAINTER_EXCEPTION;
    private final static QName ZWSCREAINTER_QNAME = new QName("urn:sap-com:document:sap:soap:functions:mc-style", "zws_crea_inter");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            Configuration appConfiguration = new Configuration();
            url = new URL(appConfiguration.getSapWsBafarUrlCreaInterlocutor());
            //url = new URL("http://svecdap1.grupobafar.com:8000/sap/bc/srt/wsdl/flv_10002A111AD1/srvc_url/sap/bc/srt/rfc/sap/zws_crea_inter/400/zws_crea_inter/z_bin_inter?sap-client=400");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ZWSCREAINTER_WSDL_LOCATION = url;
        ZWSCREAINTER_EXCEPTION = e;
    }
    
    /**
     * Autenticacion al hacer handshake con servidor SAP y obtener el WSDL
     */
    static {
        java.net.Authenticator.setDefault(new java.net.Authenticator() {

            @Override
            protected java.net.PasswordAuthentication getPasswordAuthentication() {
                Configuration appConfiguration = new Configuration();
                return new java.net.PasswordAuthentication(appConfiguration.getSapWsBafarUser(), appConfiguration.getSapWsBafarPass().toCharArray());
            }
        });
    }

    public ZwsCreaInter_Service() {
        super(__getWsdlLocation(), ZWSCREAINTER_QNAME);
    }

    public ZwsCreaInter_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), ZWSCREAINTER_QNAME, features);
    }

    public ZwsCreaInter_Service(URL wsdlLocation) {
        super(wsdlLocation, ZWSCREAINTER_QNAME);
    }

    public ZwsCreaInter_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ZWSCREAINTER_QNAME, features);
    }

    public ZwsCreaInter_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ZwsCreaInter_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ZwsCreaInter
     */
    @WebEndpoint(name = "z_bin_inter")
    public ZwsCreaInter getZBinInter() {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "z_bin_inter"), ZwsCreaInter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZwsCreaInter
     */
    @WebEndpoint(name = "z_bin_inter")
    public ZwsCreaInter getZBinInter(WebServiceFeature... features) {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "z_bin_inter"), ZwsCreaInter.class, features);
    }

    /**
     * 
     * @return
     *     returns ZwsCreaInter
     */
    @WebEndpoint(name = "z_bin_inter_soap12")
    public ZwsCreaInter getZBinInterSoap12() {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "z_bin_inter_soap12"), ZwsCreaInter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ZwsCreaInter
     */
    @WebEndpoint(name = "z_bin_inter_soap12")
    public ZwsCreaInter getZBinInterSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("urn:sap-com:document:sap:soap:functions:mc-style", "z_bin_inter_soap12"), ZwsCreaInter.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ZWSCREAINTER_EXCEPTION!= null) {
            throw ZWSCREAINTER_EXCEPTION;
        }
        return ZWSCREAINTER_WSDL_LOCATION;
    }

}
