
package com.paypal.hybris.soap.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateRecurringPaymentsProfileRequestDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateRecurringPaymentsProfileRequestDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditCard" type="{urn:ebay:apis:eBLBaseComponents}CreditCardDetailsType" minOccurs="0"/>
 *         &lt;element name="RecurringPaymentsProfileDetails" type="{urn:ebay:apis:eBLBaseComponents}RecurringPaymentsProfileDetailsType"/>
 *         &lt;element name="ScheduleDetails" type="{urn:ebay:apis:eBLBaseComponents}ScheduleDetailsType"/>
 *         &lt;element name="PaymentDetailsItem" type="{urn:ebay:apis:eBLBaseComponents}PaymentDetailsItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRecurringPaymentsProfileRequestDetailsType", propOrder = {
    "token",
    "creditCard",
    "recurringPaymentsProfileDetails",
    "scheduleDetails",
    "paymentDetailsItem"
})
public class CreateRecurringPaymentsProfileRequestDetailsType {

    @XmlElement(name = "Token")
    protected String token;
    @XmlElement(name = "CreditCard")
    protected CreditCardDetailsType creditCard;
    @XmlElement(name = "RecurringPaymentsProfileDetails", required = true)
    protected RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails;
    @XmlElement(name = "ScheduleDetails", required = true)
    protected ScheduleDetailsType scheduleDetails;
    @XmlElement(name = "PaymentDetailsItem")
    protected List<PaymentDetailsItemType> paymentDetailsItem;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDetailsType }
     *     
     */
    public CreditCardDetailsType getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDetailsType }
     *     
     */
    public void setCreditCard(CreditCardDetailsType value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the recurringPaymentsProfileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RecurringPaymentsProfileDetailsType }
     *     
     */
    public RecurringPaymentsProfileDetailsType getRecurringPaymentsProfileDetails() {
        return recurringPaymentsProfileDetails;
    }

    /**
     * Sets the value of the recurringPaymentsProfileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurringPaymentsProfileDetailsType }
     *     
     */
    public void setRecurringPaymentsProfileDetails(RecurringPaymentsProfileDetailsType value) {
        this.recurringPaymentsProfileDetails = value;
    }

    /**
     * Gets the value of the scheduleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleDetailsType }
     *     
     */
    public ScheduleDetailsType getScheduleDetails() {
        return scheduleDetails;
    }

    /**
     * Sets the value of the scheduleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleDetailsType }
     *     
     */
    public void setScheduleDetails(ScheduleDetailsType value) {
        this.scheduleDetails = value;
    }

    /**
     * Gets the value of the paymentDetailsItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentDetailsItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentDetailsItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentDetailsItemType }
     * 
     * 
     */
    public List<PaymentDetailsItemType> getPaymentDetailsItem() {
        if (paymentDetailsItem == null) {
            paymentDetailsItem = new ArrayList<PaymentDetailsItemType>();
        }
        return this.paymentDetailsItem;
    }

}
