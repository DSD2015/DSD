
package serviceImpl.UtilServiceImpl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serviceImpl.UtilServiceImpl package. 
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

    private final static QName _RegistrarSolicitudResponse_QNAME = new QName("http://serviceImpl/", "registrarSolicitudResponse");
    private final static QName _ListarClientesResponse_QNAME = new QName("http://serviceImpl/", "listarClientesResponse");
    private final static QName _ListarClientes_QNAME = new QName("http://serviceImpl/", "listarClientes");
    private final static QName _RegistrarSolicitud_QNAME = new QName("http://serviceImpl/", "registrarSolicitud");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serviceImpl.UtilServiceImpl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Solicitud }
     * 
     */
    public Solicitud createSolicitud() {
        return new Solicitud();
    }

    /**
     * Create an instance of {@link RegistrarSolicitudResponse }
     * 
     */
    public RegistrarSolicitudResponse createRegistrarSolicitudResponse() {
        return new RegistrarSolicitudResponse();
    }

    /**
     * Create an instance of {@link ListarClientesResponse }
     * 
     */
    public ListarClientesResponse createListarClientesResponse() {
        return new ListarClientesResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link ListarClientes }
     * 
     */
    public ListarClientes createListarClientes() {
        return new ListarClientes();
    }

    /**
     * Create an instance of {@link RegistrarSolicitud }
     * 
     */
    public RegistrarSolicitud createRegistrarSolicitud() {
        return new RegistrarSolicitud();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarSolicitudResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceImpl/", name = "registrarSolicitudResponse")
    public JAXBElement<RegistrarSolicitudResponse> createRegistrarSolicitudResponse(RegistrarSolicitudResponse value) {
        return new JAXBElement<RegistrarSolicitudResponse>(_RegistrarSolicitudResponse_QNAME, RegistrarSolicitudResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceImpl/", name = "listarClientesResponse")
    public JAXBElement<ListarClientesResponse> createListarClientesResponse(ListarClientesResponse value) {
        return new JAXBElement<ListarClientesResponse>(_ListarClientesResponse_QNAME, ListarClientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarClientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceImpl/", name = "listarClientes")
    public JAXBElement<ListarClientes> createListarClientes(ListarClientes value) {
        return new JAXBElement<ListarClientes>(_ListarClientes_QNAME, ListarClientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarSolicitud }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serviceImpl/", name = "registrarSolicitud")
    public JAXBElement<RegistrarSolicitud> createRegistrarSolicitud(RegistrarSolicitud value) {
        return new JAXBElement<RegistrarSolicitud>(_RegistrarSolicitud_QNAME, RegistrarSolicitud.class, null, value);
    }

}
