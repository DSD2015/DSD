
package serviceImpl.UtilServiceImpl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for solicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solicitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codcli" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="codsolicitud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="desperfil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desproyecto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estsolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feFin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="feInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fecCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solicitud", propOrder = {
    "codcli",
    "codsolicitud",
    "desperfil",
    "desproyecto",
    "estsolicitud",
    "feFin",
    "feInicio",
    "fecCreacion"
})
public class Solicitud {

    protected Integer codcli;
    protected Integer codsolicitud;
    protected String desperfil;
    protected String desproyecto;
    protected String estsolicitud;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar feFin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar feInicio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecCreacion;

    /**
     * Gets the value of the codcli property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodcli() {
        return codcli;
    }

    /**
     * Sets the value of the codcli property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodcli(Integer value) {
        this.codcli = value;
    }

    /**
     * Gets the value of the codsolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodsolicitud() {
        return codsolicitud;
    }

    /**
     * Sets the value of the codsolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodsolicitud(Integer value) {
        this.codsolicitud = value;
    }

    /**
     * Gets the value of the desperfil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesperfil() {
        return desperfil;
    }

    /**
     * Sets the value of the desperfil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesperfil(String value) {
        this.desperfil = value;
    }

    /**
     * Gets the value of the desproyecto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesproyecto() {
        return desproyecto;
    }

    /**
     * Sets the value of the desproyecto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesproyecto(String value) {
        this.desproyecto = value;
    }

    /**
     * Gets the value of the estsolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstsolicitud() {
        return estsolicitud;
    }

    /**
     * Sets the value of the estsolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstsolicitud(String value) {
        this.estsolicitud = value;
    }

    /**
     * Gets the value of the feFin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFeFin() {
        return feFin;
    }

    /**
     * Sets the value of the feFin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFeFin(XMLGregorianCalendar value) {
        this.feFin = value;
    }

    /**
     * Gets the value of the feInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFeInicio() {
        return feInicio;
    }

    /**
     * Sets the value of the feInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFeInicio(XMLGregorianCalendar value) {
        this.feInicio = value;
    }

    /**
     * Gets the value of the fecCreacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecCreacion() {
        return fecCreacion;
    }

    /**
     * Sets the value of the fecCreacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecCreacion(XMLGregorianCalendar value) {
        this.fecCreacion = value;
    }

}
