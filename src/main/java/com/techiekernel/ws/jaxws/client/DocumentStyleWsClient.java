package com.techiekernel.ws.jaxws.client;

import com.techiekernel.ws.jaxws.document.FooBarImpl;
import com.techiekernel.ws.jaxws.document.FooBarImplService;

public class DocumentStyleWsClient {
	public static void main(String[] args) {
		FooBarImplService fooBarImplService = new FooBarImplService();
		FooBarImpl fooBarImpl = fooBarImplService.getFooBarImplPort();
		System.out.println(fooBarImpl.callFooBar("Satish"));
	}
}
