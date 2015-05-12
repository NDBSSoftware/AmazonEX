/**
 * FundTransferRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.adyen.services.payment;

public class FundTransferRequest  implements java.io.Serializable {
    private com.adyen.services.payment.AnyType2AnyTypeMapEntry[] additionalData;

    private java.lang.String authorisationCode;

    private java.lang.String merchantAccount;

    private com.adyen.services.common.Amount modificationAmount;

    private java.lang.String originalReference;

    private java.lang.String reference;

    private java.lang.String shopperEmail;

    private java.lang.String shopperStatement;

    public FundTransferRequest() {
    }

    public FundTransferRequest(
           com.adyen.services.payment.AnyType2AnyTypeMapEntry[] additionalData,
           java.lang.String authorisationCode,
           java.lang.String merchantAccount,
           com.adyen.services.common.Amount modificationAmount,
           java.lang.String originalReference,
           java.lang.String reference,
           java.lang.String shopperEmail,
           java.lang.String shopperStatement) {
           this.additionalData = additionalData;
           this.authorisationCode = authorisationCode;
           this.merchantAccount = merchantAccount;
           this.modificationAmount = modificationAmount;
           this.originalReference = originalReference;
           this.reference = reference;
           this.shopperEmail = shopperEmail;
           this.shopperStatement = shopperStatement;
    }


    /**
     * Gets the additionalData value for this FundTransferRequest.
     * 
     * @return additionalData
     */
    public com.adyen.services.payment.AnyType2AnyTypeMapEntry[] getAdditionalData() {
        return additionalData;
    }


    /**
     * Sets the additionalData value for this FundTransferRequest.
     * 
     * @param additionalData
     */
    public void setAdditionalData(com.adyen.services.payment.AnyType2AnyTypeMapEntry[] additionalData) {
        this.additionalData = additionalData;
    }


    /**
     * Gets the authorisationCode value for this FundTransferRequest.
     * 
     * @return authorisationCode
     */
    public java.lang.String getAuthorisationCode() {
        return authorisationCode;
    }


    /**
     * Sets the authorisationCode value for this FundTransferRequest.
     * 
     * @param authorisationCode
     */
    public void setAuthorisationCode(java.lang.String authorisationCode) {
        this.authorisationCode = authorisationCode;
    }


    /**
     * Gets the merchantAccount value for this FundTransferRequest.
     * 
     * @return merchantAccount
     */
    public java.lang.String getMerchantAccount() {
        return merchantAccount;
    }


    /**
     * Sets the merchantAccount value for this FundTransferRequest.
     * 
     * @param merchantAccount
     */
    public void setMerchantAccount(java.lang.String merchantAccount) {
        this.merchantAccount = merchantAccount;
    }


    /**
     * Gets the modificationAmount value for this FundTransferRequest.
     * 
     * @return modificationAmount
     */
    public com.adyen.services.common.Amount getModificationAmount() {
        return modificationAmount;
    }


    /**
     * Sets the modificationAmount value for this FundTransferRequest.
     * 
     * @param modificationAmount
     */
    public void setModificationAmount(com.adyen.services.common.Amount modificationAmount) {
        this.modificationAmount = modificationAmount;
    }


    /**
     * Gets the originalReference value for this FundTransferRequest.
     * 
     * @return originalReference
     */
    public java.lang.String getOriginalReference() {
        return originalReference;
    }


    /**
     * Sets the originalReference value for this FundTransferRequest.
     * 
     * @param originalReference
     */
    public void setOriginalReference(java.lang.String originalReference) {
        this.originalReference = originalReference;
    }


    /**
     * Gets the reference value for this FundTransferRequest.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this FundTransferRequest.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the shopperEmail value for this FundTransferRequest.
     * 
     * @return shopperEmail
     */
    public java.lang.String getShopperEmail() {
        return shopperEmail;
    }


    /**
     * Sets the shopperEmail value for this FundTransferRequest.
     * 
     * @param shopperEmail
     */
    public void setShopperEmail(java.lang.String shopperEmail) {
        this.shopperEmail = shopperEmail;
    }


    /**
     * Gets the shopperStatement value for this FundTransferRequest.
     * 
     * @return shopperStatement
     */
    public java.lang.String getShopperStatement() {
        return shopperStatement;
    }


    /**
     * Sets the shopperStatement value for this FundTransferRequest.
     * 
     * @param shopperStatement
     */
    public void setShopperStatement(java.lang.String shopperStatement) {
        this.shopperStatement = shopperStatement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundTransferRequest)) return false;
        FundTransferRequest other = (FundTransferRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.additionalData==null && other.getAdditionalData()==null) || 
             (this.additionalData!=null &&
              java.util.Arrays.equals(this.additionalData, other.getAdditionalData()))) &&
            ((this.authorisationCode==null && other.getAuthorisationCode()==null) || 
             (this.authorisationCode!=null &&
              this.authorisationCode.equals(other.getAuthorisationCode()))) &&
            ((this.merchantAccount==null && other.getMerchantAccount()==null) || 
             (this.merchantAccount!=null &&
              this.merchantAccount.equals(other.getMerchantAccount()))) &&
            ((this.modificationAmount==null && other.getModificationAmount()==null) || 
             (this.modificationAmount!=null &&
              this.modificationAmount.equals(other.getModificationAmount()))) &&
            ((this.originalReference==null && other.getOriginalReference()==null) || 
             (this.originalReference!=null &&
              this.originalReference.equals(other.getOriginalReference()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.shopperEmail==null && other.getShopperEmail()==null) || 
             (this.shopperEmail!=null &&
              this.shopperEmail.equals(other.getShopperEmail()))) &&
            ((this.shopperStatement==null && other.getShopperStatement()==null) || 
             (this.shopperStatement!=null &&
              this.shopperStatement.equals(other.getShopperStatement())));
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
        if (getAdditionalData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorisationCode() != null) {
            _hashCode += getAuthorisationCode().hashCode();
        }
        if (getMerchantAccount() != null) {
            _hashCode += getMerchantAccount().hashCode();
        }
        if (getModificationAmount() != null) {
            _hashCode += getModificationAmount().hashCode();
        }
        if (getOriginalReference() != null) {
            _hashCode += getOriginalReference().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getShopperEmail() != null) {
            _hashCode += getShopperEmail().hashCode();
        }
        if (getShopperStatement() != null) {
            _hashCode += getShopperStatement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FundTransferRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://payment.services.adyen.com", "FundTransferRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "additionalData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://payment.services.adyen.com", ">anyType2anyTypeMap>entry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorisationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "authorisationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "merchantAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modificationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "modificationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.services.adyen.com", "Amount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originalReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "originalReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "shopperEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperStatement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://payment.services.adyen.com", "shopperStatement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
