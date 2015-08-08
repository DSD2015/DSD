
package serviceImpl.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "registrarSolicitud", namespace = "http://serviceImpl/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrarSolicitud", namespace = "http://serviceImpl/")
public class RegistrarSolicitud {

    @XmlElement(name = "arg0", namespace = "")
    private bean.Solicitud arg0;

    /**
     * 
     * @return
     *     returns Solicitud
     */
    public bean.Solicitud getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(bean.Solicitud arg0) {
        this.arg0 = arg0;
    }

}
