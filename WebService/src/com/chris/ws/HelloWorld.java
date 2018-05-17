/**
 * 
 */
package com.chris.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
/**
 * @author Chris
 *
 */

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorld {
	@WebMethod 
	 String sayHelloWorld(String name);

}
