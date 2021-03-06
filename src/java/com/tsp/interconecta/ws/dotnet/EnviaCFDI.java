
package com.tsp.interconecta.ws.dotnet;

import com.tsp.sct.config.Configuration;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.*;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-740-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "enviaCFDI", targetNamespace = "http://net.ws.facturacionelectronica.tspsoftware.com/", wsdlLocation = "http://187.141.47.2:8576/enviaCFDI.asmx?wsdl")
public class EnviaCFDI
    extends Service
{

    private final static URL ENVIACFDI_WSDL_LOCATION;
    private final static WebServiceException ENVIACFDI_EXCEPTION;
    private final static QName ENVIACFDI_QNAME = new QName("http://net.ws.facturacionelectronica.tspsoftware.com/", "enviaCFDI");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            /**
             * Recuperamos los datos de configuracion de la
             * aplicación definidos en archivo .properties
             */
            Configuration appConfig = new Configuration();
            url = new URL("");
            //url = new URL(appConfig.getWs_uri());

            //Pruebas Mixcoac
            //url = new URL("http://187.141.47.2:8576/enviaCFDI.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ENVIACFDI_WSDL_LOCATION = url;
        ENVIACFDI_EXCEPTION = e;
    }

    public EnviaCFDI() {
        super(__getWsdlLocation(), ENVIACFDI_QNAME);
    }

    public EnviaCFDI(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns EnviaCFDISoap
     */
    @WebEndpoint(name = "enviaCFDISoap")
    public EnviaCFDISoap getEnviaCFDISoap() {
        return super.getPort(new QName("http://net.ws.facturacionelectronica.tspsoftware.com/", "enviaCFDISoap"), EnviaCFDISoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EnviaCFDISoap
     */
    @WebEndpoint(name = "enviaCFDISoap")
    public EnviaCFDISoap getEnviaCFDISoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://net.ws.facturacionelectronica.tspsoftware.com/", "enviaCFDISoap"), EnviaCFDISoap.class, features);
    }

    /**
     * 
     * @return
     *     returns EnviaCFDISoap
     */
    @WebEndpoint(name = "enviaCFDISoap12")
    public EnviaCFDISoap getEnviaCFDISoap12() {
        return super.getPort(new QName("http://net.ws.facturacionelectronica.tspsoftware.com/", "enviaCFDISoap12"), EnviaCFDISoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EnviaCFDISoap
     */
    @WebEndpoint(name = "enviaCFDISoap12")
    public EnviaCFDISoap getEnviaCFDISoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://net.ws.facturacionelectronica.tspsoftware.com/", "enviaCFDISoap12"), EnviaCFDISoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ENVIACFDI_EXCEPTION!= null) {
            throw ENVIACFDI_EXCEPTION;
        }
        return ENVIACFDI_WSDL_LOCATION;
    }

}
