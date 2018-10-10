
package com.chris.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "JavaWSHelloImplService", targetNamespace = "http://ws.chris.com/", wsdlLocation = "http://localhost:8181/WS/JavaWSHello?wsdl")
public class JavaWSHelloImplService
    extends Service
{

    private final static URL JAVAWSHELLOIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException JAVAWSHELLOIMPLSERVICE_EXCEPTION;
    private final static QName JAVAWSHELLOIMPLSERVICE_QNAME = new QName("http://ws.chris.com/", "JavaWSHelloImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8181/WS/JavaWSHello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        JAVAWSHELLOIMPLSERVICE_WSDL_LOCATION = url;
        JAVAWSHELLOIMPLSERVICE_EXCEPTION = e;
    }

    public JavaWSHelloImplService() {
        super(__getWsdlLocation(), JAVAWSHELLOIMPLSERVICE_QNAME);
    }

    public JavaWSHelloImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), JAVAWSHELLOIMPLSERVICE_QNAME, features);
    }

    public JavaWSHelloImplService(URL wsdlLocation) {
        super(wsdlLocation, JAVAWSHELLOIMPLSERVICE_QNAME);
    }

    public JavaWSHelloImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, JAVAWSHELLOIMPLSERVICE_QNAME, features);
    }

    public JavaWSHelloImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JavaWSHelloImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns JavaWSHello
     */
    @WebEndpoint(name = "JavaWSHelloImplPort")
    public JavaWSHello getJavaWSHelloImplPort() {
        return super.getPort(new QName("http://ws.chris.com/", "JavaWSHelloImplPort"), JavaWSHello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JavaWSHello
     */
    @WebEndpoint(name = "JavaWSHelloImplPort")
    public JavaWSHello getJavaWSHelloImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.chris.com/", "JavaWSHelloImplPort"), JavaWSHello.class, features);
    }

    private static URL __getWsdlLocation() {
        if (JAVAWSHELLOIMPLSERVICE_EXCEPTION!= null) {
            throw JAVAWSHELLOIMPLSERVICE_EXCEPTION;
        }
        return JAVAWSHELLOIMPLSERVICE_WSDL_LOCATION;
    }

}