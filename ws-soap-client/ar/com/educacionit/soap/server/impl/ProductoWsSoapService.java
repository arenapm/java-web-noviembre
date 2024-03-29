
package ar.com.educacionit.soap.server.impl;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import ar.com.educacionit.soap.server.CreateProductoDTO;
import ar.com.educacionit.soap.server.ObjectFactory;
import ar.com.educacionit.soap.server.Producto;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductoWsSoapService", targetNamespace = "http://server.soap.educacionit.com.ar/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductoWsSoapService {


    /**
     * 
     * @param arg0
     * @return
     *     returns ar.com.educacionit.soap.server.Producto
     * @throws WSSoapException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getProductoByCodigo", targetNamespace = "http://server.soap.educacionit.com.ar/", className = "ar.com.educacionit.soap.server.GetProductoByCodigo")
    @ResponseWrapper(localName = "getProductoByCodigoResponse", targetNamespace = "http://server.soap.educacionit.com.ar/", className = "ar.com.educacionit.soap.server.GetProductoByCodigoResponse")
    @Action(input = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/getProductoByCodigoRequest", output = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/getProductoByCodigoResponse", fault = {
        @FaultAction(className = WSSoapException.class, value = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/getProductoByCodigo/Fault/WSSoapException")
    })
    public Producto getProductoByCodigo(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws WSSoapException
    ;

    /**
     * 
     * @return
     *     returns java.util.List<ar.com.educacionit.soap.server.Producto>
     * @throws WSSoapException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listAll", targetNamespace = "http://server.soap.educacionit.com.ar/", className = "ar.com.educacionit.soap.server.ListAll")
    @ResponseWrapper(localName = "listAllResponse", targetNamespace = "http://server.soap.educacionit.com.ar/", className = "ar.com.educacionit.soap.server.ListAllResponse")
    @Action(input = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/listAllRequest", output = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/listAllResponse", fault = {
        @FaultAction(className = WSSoapException.class, value = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/listAll/Fault/WSSoapException")
    })
    public List<Producto> listAll()
        throws WSSoapException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns ar.com.educacionit.soap.server.Producto
     * @throws WSSoapException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "eliminarProducto", targetNamespace = "http://server.soap.educacionit.com.ar/", className = "ar.com.educacionit.soap.server.EliminarProducto")
    @ResponseWrapper(localName = "eliminarProductoResponse", targetNamespace = "http://server.soap.educacionit.com.ar/", className = "ar.com.educacionit.soap.server.EliminarProductoResponse")
    @Action(input = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/eliminarProductoRequest", output = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/eliminarProductoResponse", fault = {
        @FaultAction(className = WSSoapException.class, value = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/eliminarProducto/Fault/WSSoapException")
    })
    public Producto eliminarProducto(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0)
        throws WSSoapException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns ar.com.educacionit.soap.server.Producto
     * @throws DuplicatesSoapException
     * @throws WSSoapException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createProducto", targetNamespace = "http://server.soap.educacionit.com.ar/", className = "ar.com.educacionit.soap.server.CreateProducto")
    @ResponseWrapper(localName = "createProductoResponse", targetNamespace = "http://server.soap.educacionit.com.ar/", className = "ar.com.educacionit.soap.server.CreateProductoResponse")
    @Action(input = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/createProductoRequest", output = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/createProductoResponse", fault = {
        @FaultAction(className = DuplicatesSoapException.class, value = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/createProducto/Fault/DuplicatesSoapException"),
        @FaultAction(className = WSSoapException.class, value = "http://server.soap.educacionit.com.ar/ProductoWsSoapService/createProducto/Fault/WSSoapException")
    })
    public Producto createProducto(
        @WebParam(name = "arg0", targetNamespace = "")
        CreateProductoDTO arg0)
        throws DuplicatesSoapException, WSSoapException
    ;

}
