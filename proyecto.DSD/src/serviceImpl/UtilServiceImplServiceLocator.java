/**
 * UtilServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceImpl;

public class UtilServiceImplServiceLocator extends org.apache.axis.client.Service implements serviceImpl.UtilServiceImplService {

    public UtilServiceImplServiceLocator() {
    }


    public UtilServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UtilServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UtilServiceImplPort
    private java.lang.String UtilServiceImplPort_address = "http://localhost:8088/proyecto.DSD.Server/";

    public java.lang.String getUtilServiceImplPortAddress() {
        return UtilServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UtilServiceImplPortWSDDServiceName = "UtilServiceImplPort";

    public java.lang.String getUtilServiceImplPortWSDDServiceName() {
        return UtilServiceImplPortWSDDServiceName;
    }

    public void setUtilServiceImplPortWSDDServiceName(java.lang.String name) {
        UtilServiceImplPortWSDDServiceName = name;
    }

    public serviceImpl.UtilServiceImpl getUtilServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UtilServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUtilServiceImplPort(endpoint);
    }

    public serviceImpl.UtilServiceImpl getUtilServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            serviceImpl.UtilServiceImplPortBindingStub _stub = new serviceImpl.UtilServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getUtilServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUtilServiceImplPortEndpointAddress(java.lang.String address) {
        UtilServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (serviceImpl.UtilServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                serviceImpl.UtilServiceImplPortBindingStub _stub = new serviceImpl.UtilServiceImplPortBindingStub(new java.net.URL(UtilServiceImplPort_address), this);
                _stub.setPortName(getUtilServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UtilServiceImplPort".equals(inputPortName)) {
            return getUtilServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://serviceImpl/", "UtilServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://serviceImpl/", "UtilServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UtilServiceImplPort".equals(portName)) {
            setUtilServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
