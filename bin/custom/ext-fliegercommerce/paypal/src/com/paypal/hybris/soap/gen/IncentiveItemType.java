
package com.paypal.hybris.soap.gen;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IncentiveItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncentiveItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PurchaseTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ItemCategoryList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ItemPrice" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="ItemQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncentiveItemType", propOrder = {
    "itemId",
    "purchaseTime",
    "itemCategoryList",
    "itemPrice",
    "itemQuantity"
})
public class IncentiveItemType {

    @XmlElement(name = "ItemId")
    protected String itemId;
    @XmlElement(name = "PurchaseTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar purchaseTime;
    @XmlElement(name = "ItemCategoryList")
    protected String itemCategoryList;
    @XmlElement(name = "ItemPrice")
    protected BasicAmountType itemPrice;
    @XmlElement(name = "ItemQuantity")
    protected BigInteger itemQuantity;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the purchaseTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPurchaseTime() {
        return purchaseTime;
    }

    /**
     * Sets the value of the purchaseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPurchaseTime(XMLGregorianCalendar value) {
        this.purchaseTime = value;
    }

    /**
     * Gets the value of the itemCategoryList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCategoryList() {
        return itemCategoryList;
    }

    /**
     * Sets the value of the itemCategoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCategoryList(String value) {
        this.itemCategoryList = value;
    }

    /**
     * Gets the value of the itemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the value of the itemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setItemPrice(BasicAmountType value) {
        this.itemPrice = value;
    }

    /**
     * Gets the value of the itemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemQuantity(BigInteger value) {
        this.itemQuantity = value;
    }

}
