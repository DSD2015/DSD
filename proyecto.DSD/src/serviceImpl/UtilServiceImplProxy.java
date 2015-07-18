package serviceImpl;

public class UtilServiceImplProxy implements serviceImpl.UtilServiceImpl {
  private String _endpoint = null;
  private serviceImpl.UtilServiceImpl utilServiceImpl = null;
  
  public UtilServiceImplProxy() {
    _initUtilServiceImplProxy();
  }
  
  public UtilServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initUtilServiceImplProxy();
  }
  
  private void _initUtilServiceImplProxy() {
    try {
      utilServiceImpl = (new serviceImpl.UtilServiceImplServiceLocator()).getUtilServiceImplPort();
      if (utilServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)utilServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)utilServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (utilServiceImpl != null)
      ((javax.xml.rpc.Stub)utilServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public serviceImpl.UtilServiceImpl getUtilServiceImpl() {
    if (utilServiceImpl == null)
      _initUtilServiceImplProxy();
    return utilServiceImpl;
  }
  
  public java.lang.Integer registrarSolicitud(serviceImpl.Solicitud arg0) throws java.rmi.RemoteException{
    if (utilServiceImpl == null)
      _initUtilServiceImplProxy();
    return utilServiceImpl.registrarSolicitud(arg0);
  }
  
  public serviceImpl.Cliente[] listarClientes() throws java.rmi.RemoteException{
    if (utilServiceImpl == null)
      _initUtilServiceImplProxy();
    return utilServiceImpl.listarClientes();
  }
  
  
}