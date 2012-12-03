
package com.techiekernel.ws.jaxws.rpc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "FooBarImpl", targetNamespace = "http://rpc.jaxws.ws.techiekernel.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface FooBarImpl {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String callFooBar1(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}