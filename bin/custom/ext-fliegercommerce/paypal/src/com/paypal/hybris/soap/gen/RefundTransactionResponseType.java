
package com.paypal.hybris.soap.gen;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundTransactionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundTransactionResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractResponseType">
 *       &lt;sequence>
 *         &lt;element name="RefundTransactionID" type="{urn:ebay:apis:eBLBaseComponents}TransactionId" minOccurs="0"/>
 *         &lt;element name="NetRefundAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="FeeRefundAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="GrossRefundAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element name="TotalRefundedAmount" type="{urn:ebay:apis:CoreComponentTypes}BasicAmountType" minOccurs="0"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}RefundInfo" minOccurs="0"/>
 *         &lt;element name="ReceiptData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "RefundTransactionResponseType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "refundTransactionID",
    "netRefundAmount",
    "feeRefundAmount",
    "grossRefundAmount",
    "totalRefundedAmount",
    "refundInfo",
    "receiptData",
    "msgSubID"
})
public class RefundTransactionResponseType
    extends AbstractResponseType
{

    @XmlElementRef(name = "RefundTransactionID", namespace = "urn:ebay:api:PayPalAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> refundTransactionID;
    @XmlElement(name = "NetRefundAmount")
    protected BasicAmountType netRefundAmount;
    @XmlElement(name = "FeeRefundAmount")
    protected BasicAmountType feeRefundAmount;
    @XmlElement(name = "GrossRefundAmount")
    protected BasicAmountType grossRefundAmount;
    @XmlElement(name = "TotalRefundedAmount")
    protected BasicAmountType totalRefundedAmount;
    @XmlElement(name = "RefundInfo", namespace = "urn:ebay:apis:eBLBaseComponents")
    protected RefundInfoType refundInfo;
    @XmlElement(name = "ReceiptData")
    protected String receiptData;
    @XmlElement(name = "MsgSubID")
    protected String msgSubID;

    /**
     * Gets the value of the refundTransactionID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefundTransactionID() {
        return refundTransactionID;
    }

    /**
     * Sets the value of the refundTransactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefundTransactionID(JAXBElement<String> value) {
        this.refundTransactionID = value;
    }

    /**
     * Gets the value of the netRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getNetRefundAmount() {
        return netRefundAmount;
    }

    /**
     * Sets the value of the netRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setNetRefundAmount(BasicAmountType value) {
        this.netRefundAmount = value;
    }

    /**
     * Gets the value of the feeRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getFeeRefundAmount() {
        return feeRefundAmount;
    }

    /**
     * Sets the value of the feeRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setFeeRefundAmount(BasicAmountType value) {
        this.feeRefundAmount = value;
    }

    /**
     * Gets the value of the grossRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getGrossRefundAmount() {
        return grossRefundAmount;
    }

    /**
     * Sets the value of the grossRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setGrossRefundAmount(BasicAmountType value) {
        this.grossRefundAmount = value;
    }

    /**
     * Gets the value of the totalRefundedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BasicAmountType }
     *     
     */
    public BasicAmountType getTotalRefundedAmount() {
        return totalRefundedAmount;
    }

    /**
     * Sets the value of the totalRefundedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasicAmountType }
     *     
     */
    public void setTotalRefundedAmount(BasicAmountType value) {
        this.totalRefundedAmount = value;
    }

    /**
     * Contains Refund Payment status information.
     * 
     * @return
     *     possible object is
     *     {@link RefundInfoType }
     *     
     */
    public RefundInfoType getRefundInfo() {
        return refundInfo;
    }

    /**
     * Sets the value of the refundInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundInfoType }
     *     
     */
    public void setRefundInfo(RefundInfoType value) {
        this.refundInfo = value;
    }

    /**
     * Gets the value of the receiptData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptData() {
        return receiptData;
    }

    /**
     * Sets the value of the receiptData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptData(String value) {
        this.receiptData = value;
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
