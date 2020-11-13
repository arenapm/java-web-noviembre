
package ar.com.educacionit.soap.server.impl;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "WSSoapException", targetNamespace = "http://server.soap.educacionit.com.ar/")
public class WSSoapException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ar.com.educacionit.soap.server.WSSoapException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public WSSoapException(String message, ar.com.educacionit.soap.server.WSSoapException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public WSSoapException(String message, ar.com.educacionit.soap.server.WSSoapException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ar.com.educacionit.soap.server.WSSoapException
     */
    public ar.com.educacionit.soap.server.WSSoapException getFaultInfo() {
        return faultInfo;
    }

}