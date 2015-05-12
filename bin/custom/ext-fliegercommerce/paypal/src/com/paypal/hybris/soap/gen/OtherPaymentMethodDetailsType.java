
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Lists the Payment Methods (other than PayPal) that the use can pay with e.g. Money Order. 
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
 * <p>Java class for OtherPaymentMethodDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherPaymentMethodDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherPaymentMethodId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPaymentMethodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPaymentMethodLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPaymentMethodLabelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPaymentMethodLongDescriptionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPaymentMethodLongDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPaymentMethodIcon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherPaymentMethodHideLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPaymentMethodDetailsType", propOrder = {
    "otherPaymentMethodId",
    "otherPaymentMethodType",
    "otherPaymentMethodLabel",
    "otherPaymentMethodLabelDescription",
    "otherPaymentMethodLongDescriptionTitle",
    "otherPaymentMethodLongDescription",
    "otherPaymentMethodIcon",
    "otherPaymentMethodHideLabel"
})
public class OtherPaymentMethodDetailsType {

    @XmlElement(name = "OtherPaymentMethodId")
    protected String otherPaymentMethodId;
    @XmlElement(name = "OtherPaymentMethodType")
    protected String otherPaymentMethodType;
    @XmlElement(name = "OtherPaymentMethodLabel")
    protected String otherPaymentMethodLabel;
    @XmlElement(name = "OtherPaymentMethodLabelDescription")
    protected String otherPaymentMethodLabelDescription;
    @XmlElement(name = "OtherPaymentMethodLongDescriptionTitle")
    protected String otherPaymentMethodLongDescriptionTitle;
    @XmlElement(name = "OtherPaymentMethodLongDescription")
    protected String otherPaymentMethodLongDescription;
    @XmlElement(name = "OtherPaymentMethodIcon")
    protected String otherPaymentMethodIcon;
    @XmlElement(name = "OtherPaymentMethodHideLabel")
    protected Boolean otherPaymentMethodHideLabel;

    /**
     * Gets the value of the otherPaymentMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPaymentMethodId() {
        return otherPaymentMethodId;
    }

    /**
     * Sets the value of the otherPaymentMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPaymentMethodId(String value) {
        this.otherPaymentMethodId = value;
    }

    /**
     * Gets the value of the otherPaymentMethodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPaymentMethodType() {
        return otherPaymentMethodType;
    }

    /**
     * Sets the value of the otherPaymentMethodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPaymentMethodType(String value) {
        this.otherPaymentMethodType = value;
    }

    /**
     * Gets the value of the otherPaymentMethodLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPaymentMethodLabel() {
        return otherPaymentMethodLabel;
    }

    /**
     * Sets the value of the otherPaymentMethodLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPaymentMethodLabel(String value) {
        this.otherPaymentMethodLabel = value;
    }

    /**
     * Gets the value of the otherPaymentMethodLabelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPaymentMethodLabelDescription() {
        return otherPaymentMethodLabelDescription;
    }

    /**
     * Sets the value of the otherPaymentMethodLabelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPaymentMethodLabelDescription(String value) {
        this.otherPaymentMethodLabelDescription = value;
    }

    /**
     * Gets the value of the otherPaymentMethodLongDescriptionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPaymentMethodLongDescriptionTitle() {
        return otherPaymentMethodLongDescriptionTitle;
    }

    /**
     * Sets the value of the otherPaymentMethodLongDescriptionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPaymentMethodLongDescriptionTitle(String value) {
        this.otherPaymentMethodLongDescriptionTitle = value;
    }

    /**
     * Gets the value of the otherPaymentMethodLongDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPaymentMethodLongDescription() {
        return otherPaymentMethodLongDescription;
    }

    /**
     * Sets the value of the otherPaymentMethodLongDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPaymentMethodLongDescription(String value) {
        this.otherPaymentMethodLongDescription = value;
    }

    /**
     * Gets the value of the otherPaymentMethodIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPaymentMethodIcon() {
        return otherPaymentMethodIcon;
    }

    /**
     * Sets the value of the otherPaymentMethodIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPaymentMethodIcon(String value) {
        this.otherPaymentMethodIcon = value;
    }

    /**
     * Gets the value of the otherPaymentMethodHideLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherPaymentMethodHideLabel() {
        return otherPaymentMethodHideLabel;
    }

    /**
     * Sets the value of the otherPaymentMethodHideLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherPaymentMethodHideLabel(Boolean value) {
        this.otherPaymentMethodHideLabel = value;
    }

}
