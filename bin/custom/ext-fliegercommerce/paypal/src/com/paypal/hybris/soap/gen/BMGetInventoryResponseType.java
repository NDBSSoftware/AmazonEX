
package com.paypal.hybris.soap.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BMGetInventoryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BMGetInventoryResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="HostedButtonID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrackInv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TrackPnl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ItemTrackingDetails" minOccurs="0"/>
 *         &lt;element name="OptionIndex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}OptionTrackingDetails" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="SoldoutURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DigitalDownloadKeys" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="1000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BMGetInventoryResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "hostedButtonID",
    "trackInv",
    "trackPnl",
    "itemTrackingDetails",
    "optionIndex",
    "optionName",
    "optionTrackingDetails",
    "soldoutURL",
    "digitalDownloadKeys"
})
public class BMGetInventoryResponseType
    extends AbstractResponseType
{

    @XmlElement(name = "HostedButtonID", required = true)
    protected String hostedButtonID;
    @XmlElement(name = "TrackInv", required = true)
    protected String trackInv;
    @XmlElement(name = "TrackPnl", required = true)
    protected String trackPnl;
    @XmlElement(name = "ItemTrackingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected ItemTrackingDetailsType itemTrackingDetails;
    @XmlElement(name = "OptionIndex")
    protected String optionIndex;
    @XmlElement(name = "OptionName")
    protected String optionName;
    @XmlElement(name = "OptionTrackingDetails", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected List<OptionTrackingDetailsType> optionTrackingDetails;
    @XmlElement(name = "SoldoutURL")
    protected String soldoutURL;
    @XmlElement(name = "DigitalDownloadKeys")
    protected List<String> digitalDownloadKeys;

    /**
     * Gets the value of the hostedButtonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostedButtonID() {
        return hostedButtonID;
    }

    /**
     * Sets the value of the hostedButtonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostedButtonID(String value) {
        this.hostedButtonID = value;
    }

    /**
     * Gets the value of the trackInv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackInv() {
        return trackInv;
    }

    /**
     * Sets the value of the trackInv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackInv(String value) {
        this.trackInv = value;
    }

    /**
     * Gets the value of the trackPnl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackPnl() {
        return trackPnl;
    }

    /**
     * Sets the value of the trackPnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackPnl(String value) {
        this.trackPnl = value;
    }

    /**
     * Gets the value of the itemTrackingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ItemTrackingDetailsType }
     *     
     */
    public ItemTrackingDetailsType getItemTrackingDetails() {
        return itemTrackingDetails;
    }

    /**
     * Sets the value of the itemTrackingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemTrackingDetailsType }
     *     
     */
    public void setItemTrackingDetails(ItemTrackingDetailsType value) {
        this.itemTrackingDetails = value;
    }

    /**
     * Gets the value of the optionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionIndex() {
        return optionIndex;
    }

    /**
     * Sets the value of the optionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionIndex(String value) {
        this.optionIndex = value;
    }

    /**
     * Gets the value of the optionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * Sets the value of the optionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionName(String value) {
        this.optionName = value;
    }

    /**
     * Gets the value of the optionTrackingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionTrackingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionTrackingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionTrackingDetailsType }
     * 
     * 
     */
    public List<OptionTrackingDetailsType> getOptionTrackingDetails() {
        if (optionTrackingDetails == null) {
            optionTrackingDetails = new ArrayList<OptionTrackingDetailsType>();
        }
        return this.optionTrackingDetails;
    }

    /**
     * Gets the value of the soldoutURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoldoutURL() {
        return soldoutURL;
    }

    /**
     * Sets the value of the soldoutURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoldoutURL(String value) {
        this.soldoutURL = value;
    }

    /**
     * Gets the value of the digitalDownloadKeys property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the digitalDownloadKeys property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDigitalDownloadKeys().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDigitalDownloadKeys() {
        if (digitalDownloadKeys == null) {
            digitalDownloadKeys = new ArrayList<String>();
        }
        return this.digitalDownloadKeys;
    }

}
