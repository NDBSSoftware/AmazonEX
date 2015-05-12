
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 3DS remaining fields.
 *             
 * 
 * <p>Java class for ThreeDSecureResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThreeDSecureResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vpas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EciSubmitted3DS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThreeDSecureResponseType", propOrder = {
    "vpas",
    "eciSubmitted3DS"
})
public class ThreeDSecureResponseType {

    @XmlElement(name = "Vpas")
    protected String vpas;
    @XmlElement(name = "EciSubmitted3DS")
    protected String eciSubmitted3DS;

    /**
     * Gets the value of the vpas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVpas() {
        return vpas;
    }

    /**
     * Sets the value of the vpas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVpas(String value) {
        this.vpas = value;
    }

    /**
     * Gets the value of the eciSubmitted3DS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEciSubmitted3DS() {
        return eciSubmitted3DS;
    }

    /**
     * Sets the value of the eciSubmitted3DS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEciSubmitted3DS(String value) {
        this.eciSubmitted3DS = value;
    }

}
