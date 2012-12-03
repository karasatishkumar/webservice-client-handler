
package com.techiekernel.ws.jaxws.rpc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "FooBarImplService", targetNamespace = "http://rpc.jaxws.ws.techiekernel.com/", wsdlLocation = "http://localhost:8080/webservice-JAX-WS-handler/foobarRPC?wsdl")
public class FooBarImplService
    extends Service
{

    private final static URL FOOBARIMPLSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.techiekernel.ws.jaxws.rpc.FooBarImplService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.techiekernel.ws.jaxws.rpc.FooBarImplService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/webservice-JAX-WS-handler/foobarRPC?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/webservice-JAX-WS-handler/foobarRPC?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        FOOBARIMPLSERVICE_WSDL_LOCATION = url;
    }

    public FooBarImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FooBarImplService() {
        super(FOOBARIMPLSERVICE_WSDL_LOCATION, new QName("http://rpc.jaxws.ws.techiekernel.com/", "FooBarImplService"));
    }

    /**
     * 
     * @return
     *     returns FooBarImpl
     */
    @WebEndpoint(name = "FooBarImplPort")
    public FooBarImpl getFooBarImplPort() {
        return super.getPort(new QName("http://rpc.jaxws.ws.techiekernel.com/", "FooBarImplPort"), FooBarImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FooBarImpl
     */
    @WebEndpoint(name = "FooBarImplPort")
    public FooBarImpl getFooBarImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://rpc.jaxws.ws.techiekernel.com/", "FooBarImplPort"), FooBarImpl.class, features);
    }

}
