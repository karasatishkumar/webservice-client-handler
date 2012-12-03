package com.techiekernel.ws.jaxws.handler;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class CredentialProvider implements SOAPHandler<SOAPMessageContext> {

	private static final String USER_NAME = "foo";
	private static final String PASSWORD = "bar";
	
	public boolean handleMessage(SOAPMessageContext context) {

		System.out.println("handleMessage() called.");

		Boolean isRequest = (Boolean) context
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		// if this is a request, true for outbound messages, false for inbound
		if (isRequest) {

			try {
				SOAPMessage soapMsg = context.getMessage();
				SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapEnv.getHeader();

				// if no header, add one
				if (soapHeader == null) {
					soapHeader = soapEnv.addHeader();
				}

				// add a soap header, username
				QName qnameUser = new QName("http://document.jaxws.ws.techiekernel.com/", "userName");
				SOAPHeaderElement soapHeaderElementUser = soapHeader
						.addHeaderElement(qnameUser);

				soapHeaderElementUser.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
				soapHeaderElementUser.addTextNode(USER_NAME);
				
				// add a soap header, username
				QName qnamePassword = new QName("http://document.jaxws.ws.techiekernel.com/", "password");
				SOAPHeaderElement soapHeaderElementPassword = soapHeader
						.addHeaderElement(qnamePassword);

				soapHeaderElementPassword.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
				soapHeaderElementPassword.addTextNode(PASSWORD);
				
				soapMsg.saveChanges();

				// tracking
				soapMsg.writeTo(System.out);

			} catch (SOAPException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}

		}

		// continue other handler chain
		return true;
	}

	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("handleFault() called.");
		return true;
	}

	public void close(MessageContext context) {
		System.out.println("close() called");
	}

	public Set<QName> getHeaders() {
		System.out.println("getHeaders() called.");
		return null;
	}
}
