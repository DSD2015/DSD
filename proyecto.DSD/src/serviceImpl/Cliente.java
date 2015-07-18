/**
 * Cliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package serviceImpl;

public class Cliente  implements java.io.Serializable {
    private java.lang.Integer codcliete;

    private java.lang.String estado;

    private java.lang.String razonsocial;

    public Cliente() {
    }

    public Cliente(
           java.lang.Integer codcliete,
           java.lang.String estado,
           java.lang.String razonsocial) {
           this.codcliete = codcliete;
           this.estado = estado;
           this.razonsocial = razonsocial;
    }


    /**
     * Gets the codcliete value for this Cliente.
     * 
     * @return codcliete
     */
    public java.lang.Integer getCodcliete() {
        return codcliete;
    }


    /**
     * Sets the codcliete value for this Cliente.
     * 
     * @param codcliete
     */
    public void setCodcliete(java.lang.Integer codcliete) {
        this.codcliete = codcliete;
    }


    /**
     * Gets the estado value for this Cliente.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Cliente.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the razonsocial value for this Cliente.
     * 
     * @return razonsocial
     */
    public java.lang.String getRazonsocial() {
        return razonsocial;
    }


    /**
     * Sets the razonsocial value for this Cliente.
     * 
     * @param razonsocial
     */
    public void setRazonsocial(java.lang.String razonsocial) {
        this.razonsocial = razonsocial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cliente)) return false;
        Cliente other = (Cliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codcliete==null && other.getCodcliete()==null) || 
             (this.codcliete!=null &&
              this.codcliete.equals(other.getCodcliete()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.razonsocial==null && other.getRazonsocial()==null) || 
             (this.razonsocial!=null &&
              this.razonsocial.equals(other.getRazonsocial())));
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
        if (getCodcliete() != null) {
            _hashCode += getCodcliete().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getRazonsocial() != null) {
            _hashCode += getRazonsocial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://serviceImpl/", "cliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codcliete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codcliete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razonsocial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "razonsocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
