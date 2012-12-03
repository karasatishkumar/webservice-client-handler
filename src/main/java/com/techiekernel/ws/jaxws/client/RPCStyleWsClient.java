package com.techiekernel.ws.jaxws.client;

import com.techiekernel.ws.jaxws.rpc.FooBarImpl;
import com.techiekernel.ws.jaxws.rpc.FooBarImplService;

public class RPCStyleWsClient {
	public static void main(String[] args) {
		FooBarImplService fooBarImplService = new FooBarImplService();
		FooBarImpl fooBarImpl = fooBarImplService.getFooBarImplPort();
		System.out.println(fooBarImpl.callFooBar1("Satish"));
	}
}
