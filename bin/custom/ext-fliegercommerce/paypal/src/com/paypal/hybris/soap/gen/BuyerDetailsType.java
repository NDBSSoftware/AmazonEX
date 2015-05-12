
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * 				Details about the buyer's account passed in by the merchant or partner.
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:apis:eBLBaseComponents" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 				Optional.
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns="http://www.w3.org/2001/XMLSchema" xmlns:cc="urn:ebay:apis:CoreComponentTypes" xmlns:ed="urn:ebay:apis:EnhancedDataTypes" xmlns:ns="urn:ebay:apis:eBLBaseComponents" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BuyerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BuyerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BuyerRegistrationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TaxIdDetails" type="{urn:ebay:apis:eBLBaseComponents}TaxIdDetailsType" minOccurs="0"/>
 *         &lt;element name="IdentificationInfo" type="{urn:ebay:apis:eBLBaseComponents}IdentificationInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerDetailsType", propOrder = {
    "buyerId",
    "buyerUserName",
    "buyerRegistrationDate",
    "taxIdDetails",
    "identificationInfo"
})
public class BuyerDetailsType {

    @XmlElement(name = "BuyerId")
    protected String buyerId;
    @XmlElement(name = "BuyerUserName")
    protected String buyerUserName;
    @XmlElement(name = "BuyerRegistrationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar buyerRegistrationDate;
    @XmlElement(name = "TaxIdDetails")
    protected TaxIdDetailsType taxIdDetails;
    @XmlElement(name = "IdentificationInfo")
    protected IdentificationInfoType identificationInfo;

    /**
     * Gets the value of the buyerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerId() {
        return buyerId;
    }

    /**
     * Sets the value of the buyerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerId(String value) {
        this.buyerId = value;
    }

    /**
     * Gets the value of the buyerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerUserName() {
        return buyerUserName;
    }

    /**
     * Sets the value of the buyerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerUserName(String value) {
        this.buyerUserName = value;
    }

    /**
     * Gets the value of the buyerRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuyerRegistrationDate() {
        return buyerRegistrationDate;
    }

    /**
     * Sets the value of the buyerRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuyerRegistrationDate(XMLGregorianCalendar value) {
        this.buyerRegistrationDate = value;
    }

    /**
     * Gets the value of the taxIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxIdDetailsType }
     *     
     */
    public TaxIdDetailsType getTaxIdDetails() {
        return taxIdDetails;
    }

    /**
     * Sets the value of the taxIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxIdDetailsType }
     *     
     */
    public void setTaxIdDetails(TaxIdDetailsType value) {
        this.taxIdDetails = value;
    }

    /**
     * Gets the value of the identificationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInfoType }
     *     
     */
    public IdentificationInfoType getIdentificationInfo() {
        return identificationInfo;
    }

    /**
     * Sets the value of the identificationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInfoType }
     *     
     */
    public void setIdentificationInfo(IdentificationInfoType value) {
        this.identificationInfo = value;
    }

}
