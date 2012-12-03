
package com.techiekernel.ws.jaxws.document;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "FooBarImpl", targetNamespace = "http://document.jaxws.ws.techiekernel.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FooBarImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "callFooBar", targetNamespace = "http://document.jaxws.ws.techiekernel.com/", className = "com.techiekernel.ws.jaxws.document.CallFooBar")
    @ResponseWrapper(localName = "callFooBarResponse", targetNamespace = "http://document.jaxws.ws.techiekernel.com/", className = "com.techiekernel.ws.jaxws.document.CallFooBarResponse")
    public String callFooBar(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns com.techiekernel.ws.jaxws.document.Server
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getServerDetail", targetNamespace = "http://document.jaxws.ws.techiekernel.com/", className = "com.techiekernel.ws.jaxws.document.GetServerDetail")
    @ResponseWrapper(localName = "getServerDetailResponse", targetNamespace = "http://document.jaxws.ws.techiekernel.com/", className = "com.techiekernel.ws.jaxws.document.GetServerDetailResponse")
    public Server getServerDetail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
