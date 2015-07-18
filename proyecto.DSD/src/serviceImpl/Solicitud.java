/**
 * Solicitud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceImpl;

public class Solicitud  implements java.io.Serializable {
    private java.lang.Integer codcli;

    private java.lang.Integer codsolicitud;

    private java.lang.String desperfil;

    private java.lang.String desproyecto;

    private java.lang.String estsolicitud;

    private java.util.Calendar feFin;

    private java.util.Calendar feInicio;

    private java.util.Calendar fecCreacion;

    public Solicitud() {
    }

    public Solicitud(
           java.lang.Integer codcli,
           java.lang.Integer codsolicitud,
           java.lang.String desperfil,
           java.lang.String desproyecto,
           java.lang.String estsolicitud,
           java.util.Calendar feFin,
           java.util.Calendar feInicio,
           java.util.Calendar fecCreacion) {
           this.codcli = codcli;
           this.codsolicitud = codsolicitud;
           this.desperfil = desperfil;
           this.desproyecto = desproyecto;
           this.estsolicitud = estsolicitud;
           this.feFin = feFin;
           this.feInicio = feInicio;
           this.fecCreacion = fecCreacion;
    }


    /**
     * Gets the codcli value for this Solicitud.
     * 
     * @return codcli
     */
    public java.lang.Integer getCodcli() {
        return codcli;
    }


    /**
     * Sets the codcli value for this Solicitud.
     * 
     * @param codcli
     */
    public void setCodcli(java.lang.Integer codcli) {
        this.codcli = codcli;
    }


    /**
     * Gets the codsolicitud value for this Solicitud.
     * 
     * @return codsolicitud
     */
    public java.lang.Integer getCodsolicitud() {
        return codsolicitud;
    }


    /**
     * Sets the codsolicitud value for this Solicitud.
     * 
     * @param codsolicitud
     */
    public void setCodsolicitud(java.lang.Integer codsolicitud) {
        this.codsolicitud = codsolicitud;
    }


    /**
     * Gets the desperfil value for this Solicitud.
     * 
     * @return desperfil
     */
    public java.lang.String getDesperfil() {
        return desperfil;
    }


    /**
     * Sets the desperfil value for this Solicitud.
     * 
     * @param desperfil
     */
    public void setDesperfil(java.lang.String desperfil) {
        this.desperfil = desperfil;
    }


    /**
     * Gets the desproyecto value for this Solicitud.
     * 
     * @return desproyecto
     */
    public java.lang.String getDesproyecto() {
        return desproyecto;
    }


    /**
     * Sets the desproyecto value for this Solicitud.
     * 
     * @param desproyecto
     */
    public void setDesproyecto(java.lang.String desproyecto) {
        this.desproyecto = desproyecto;
    }


    /**
     * Gets the estsolicitud value for this Solicitud.
     * 
     * @return estsolicitud
     */
    public java.lang.String getEstsolicitud() {
        return estsolicitud;
    }


    /**
     * Sets the estsolicitud value for this Solicitud.
     * 
     * @param estsolicitud
     */
    public void setEstsolicitud(java.lang.String estsolicitud) {
        this.estsolicitud = estsolicitud;
    }


    /**
     * Gets the feFin value for this Solicitud.
     * 
     * @return feFin
     */
    public java.util.Calendar getFeFin() {
        return feFin;
    }


    /**
     * Sets the feFin value for this Solicitud.
     * 
     * @param feFin
     */
    public void setFeFin(java.util.Calendar feFin) {
        this.feFin = feFin;
    }


    /**
     * Gets the feInicio value for this Solicitud.
     * 
     * @return feInicio
     */
    public java.util.Calendar getFeInicio() {
        return feInicio;
    }


    /**
     * Sets the feInicio value for this Solicitud.
     * 
     * @param feInicio
     */
    public void setFeInicio(java.util.Calendar feInicio) {
        this.feInicio = feInicio;
    }


    /**
     * Gets the fecCreacion value for this Solicitud.
     * 
     * @return fecCreacion
     */
    public java.util.Calendar getFecCreacion() {
        return fecCreacion;
    }


    /**
     * Sets the fecCreacion value for this Solicitud.
     * 
     * @param fecCreacion
     */
    public void setFecCreacion(java.util.Calendar fecCreacion) {
        this.fecCreacion = fecCreacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Solicitud)) return false;
        Solicitud other = (Solicitud) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codcli==null && other.getCodcli()==null) || 
             (this.codcli!=null &&
              this.codcli.equals(other.getCodcli()))) &&
            ((this.codsolicitud==null && other.getCodsolicitud()==null) || 
             (this.codsolicitud!=null &&
              this.codsolicitud.equals(other.getCodsolicitud()))) &&
            ((this.desperfil==null && other.getDesperfil()==null) || 
             (this.desperfil!=null &&
              this.desperfil.equals(other.getDesperfil()))) &&
            ((this.desproyecto==null && other.getDesproyecto()==null) || 
             (this.desproyecto!=null &&
              this.desproyecto.equals(other.getDesproyecto()))) &&
            ((this.estsolicitud==null && other.getEstsolicitud()==null) || 
             (this.estsolicitud!=null &&
              this.estsolicitud.equals(other.getEstsolicitud()))) &&
            ((this.feFin==null && other.getFeFin()==null) || 
             (this.feFin!=null &&
              this.feFin.equals(other.getFeFin()))) &&
            ((this.feInicio==null && other.getFeInicio()==null) || 
             (this.feInicio!=null &&
              this.feInicio.equals(other.getFeInicio()))) &&
            ((this.fecCreacion==null && other.getFecCreacion()==null) || 
             (this.fecCreacion!=null &&
              this.fecCreacion.equals(other.getFecCreacion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodcli() != null) {
            _hashCode += getCodcli().hashCode();
        }
        if (getCodsolicitud() != null) {
            _hashCode += getCodsolicitud().hashCode();
        }
        if (getDesperfil() != null) {
            _hashCode += getDesperfil().hashCode();
        }
        if (getDesproyecto() != null) {
            _hashCode += getDesproyecto().hashCode();
        }
        if (getEstsolicitud() != null) {
            _hashCode += getEstsolicitud().hashCode();
        }
        if (getFeFin() != null) {
            _hashCode += getFeFin().hashCode();
        }
        if (getFeInicio() != null) {
            _hashCode += getFeInicio().hashCode();
        }
        if (getFecCreacion() != null) {
            _hashCode += getFecCreacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Solicitud.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviceImpl/", "solicitud"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codcli");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codcli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codsolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codsolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desperfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desperfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desproyecto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desproyecto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estsolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estsolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feFin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feFin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feInicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feInicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fecCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fecCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
