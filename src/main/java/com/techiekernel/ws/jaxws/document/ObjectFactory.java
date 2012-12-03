
package com.techiekernel.ws.jaxws.document;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.techiekernel.ws.jaxws.document package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetServerDetail_QNAME = new QName("http://document.jaxws.ws.techiekernel.com/", "getServerDetail");
    private final static QName _CallFooBarResponse_QNAME = new QName("http://document.jaxws.ws.techiekernel.com/", "callFooBarResponse");
    private final static QName _CallFooBar_QNAME = new QName("http://document.jaxws.ws.techiekernel.com/", "callFooBar");
    private final static QName _GetServerDetailResponse_QNAME = new QName("http://document.jaxws.ws.techiekernel.com/", "getServerDetailResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.techiekernel.ws.jaxws.document
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Server }
     * 
     */
    public Server createServer() {
        return new Server();
    }

    /**
     * Create an instance of {@link GetServerDetail }
     * 
     */
    public GetServerDetail createGetServerDetail() {
        return new GetServerDetail();
    }

    /**
     * Create an instance of {@link GetServerDetailResponse }
     * 
     */
    public GetServerDetailResponse createGetServerDetailResponse() {
        return new GetServerDetailResponse();
    }

    /**
     * Create an instance of {@link CallFooBarResponse }
     * 
     */
    public CallFooBarResponse createCallFooBarResponse() {
        return new CallFooBarResponse();
    }

    /**
     * Create an instance of {@link CallFooBar }
     * 
     */
    public CallFooBar createCallFooBar() {
        return new CallFooBar();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.jaxws.ws.techiekernel.com/", name = "getServerDetail")
    public JAXBElement<GetServerDetail> createGetServerDetail(GetServerDetail value) {
        return new JAXBElement<GetServerDetail>(_GetServerDetail_QNAME, GetServerDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallFooBarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.jaxws.ws.techiekernel.com/", name = "callFooBarResponse")
    public JAXBElement<CallFooBarResponse> createCallFooBarResponse(CallFooBarResponse value) {
        return new JAXBElement<CallFooBarResponse>(_CallFooBarResponse_QNAME, CallFooBarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallFooBar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.jaxws.ws.techiekernel.com/", name = "callFooBar")
    public JAXBElement<CallFooBar> createCallFooBar(CallFooBar value) {
        return new JAXBElement<CallFooBar>(_CallFooBar_QNAME, CallFooBar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServerDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://document.jaxws.ws.techiekernel.com/", name = "getServerDetailResponse")
    public JAXBElement<GetServerDetailResponse> createGetServerDetailResponse(GetServerDetailResponse value) {
        return new JAXBElement<GetServerDetailResponse>(_GetServerDetailResponse_QNAME, GetServerDetailResponse.class, null, value);
    }

}
