
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoCancelRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoCancelRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element name="CancelMsgSubID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="APIType" type="{urn:ebay:apis:eBLBaseComponents}APIType"/>
 *         &lt;element name="MsgSubID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoCancelRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "cancelMsgSubID",
    "apiType",
    "msgSubID"
})
public class DoCancelRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "CancelMsgSubID", required = true)
    protected String cancelMsgSubID;
    @XmlElement(name = "APIType", required = true)
    protected APIType apiType;
    @XmlElement(name = "MsgSubID")
    protected String msgSubID;

    /**
     * Gets the value of the cancelMsgSubID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelMsgSubID() {
        return cancelMsgSubID;
    }

    /**
     * Sets the value of the cancelMsgSubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelMsgSubID(String value) {
        this.cancelMsgSubID = value;
    }

    /**
     * Gets the value of the apiType property.
     * 
     * @return
     *     possible object is
     *     {@link APIType }
     *     
     */
    public APIType getAPIType() {
        return apiType;
    }

    /**
     * Sets the value of the apiType property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIType }
     *     
     */
    public void setAPIType(APIType value) {
        this.apiType = value;
    }

    /**
     * Gets the value of the msgSubID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSubID() {
        return msgSubID;
    }

    /**
     * Sets the value of the msgSubID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSubID(String value) {
        this.msgSubID = value;
    }

}
