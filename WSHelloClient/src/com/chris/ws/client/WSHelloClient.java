package com.chris.ws.client;

import com.chris.ws.JavaWSHello;
import com.chris.ws.JavaWSHelloImplService;

public class WSHelloClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			 JavaWSHelloImplService service = new JavaWSHelloImplService();
			  JavaWSHello serviceHello = service.getJavaWSHelloImplPort();
			  System.out.println("***************Call Started*******************");
			  System.out.println(serviceHello.sayHello("Chris"));
			  System.out.println("***************Call Ended*********************");
		


	}

}
