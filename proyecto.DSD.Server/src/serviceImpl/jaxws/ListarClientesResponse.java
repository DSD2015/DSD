
package serviceImpl.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "listarClientesResponse", namespace = "http://serviceImpl/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listarClientesResponse", namespace = "http://serviceImpl/")
public class ListarClientesResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<serviceImpl.Cliente> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Cliente>
     */
    public ArrayList<serviceImpl.Cliente> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<serviceImpl.Cliente> _return) {
        this._return = _return;
    }

}
