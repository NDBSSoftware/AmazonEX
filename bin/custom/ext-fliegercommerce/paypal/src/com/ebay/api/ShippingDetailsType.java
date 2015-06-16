
package com.ebay.api;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  
 *                        Specifies the shipping payment details.
 *                    
 * 
 * <p>Java class for ShippingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllowPaymentEdit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CalculatedShippingRate" type="{urn:ebay:apis:eBLBaseComponents}CalculatedShippingRateType" minOccurs="0"/>
 *         &lt;element name="ChangePaymentInstructions" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FlatShippingRate" type="{urn:ebay:apis:eBLBaseComponents}FlatShippingRateType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InsuranceTotal" type="{urn:ebay:apis:CoreComponentTypes}AmountType" minOccurs="0"/>
 *         &lt;element name="InsuranceWanted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PaymentInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesTax" type="{urn:ebay:apis:eBLBaseComponents}SalesTaxType" minOccurs="0"/>
 *         &lt;element name="SellerPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingDetailsType", propOrder = {
    "allowPaymentEdit",
    "calculatedShippingRate",
    "changePaymentInstructions",
    "flatShippingRate",
    "insuranceTotal",
    "insuranceWanted",
    "paymentInstructions",
    "salesTax",
    "sellerPostalCode"
})
public class ShippingDetailsType {

    @XmlElement(name = "AllowPaymentEdit")
    protected Boolean allowPaymentEdit;
    @XmlElement(name = "CalculatedShippingRate")
    protected CalculatedShippingRateType calculatedShippingRate;
    @XmlElement(name = "ChangePaymentInstructions")
    protected Boolean changePaymentInstructions;
    @XmlElement(name = "FlatShippingRate")
    protected List<FlatShippingRateType> flatShippingRate;
    @XmlElement(name = "InsuranceTotal")
    protected AmountType insuranceTotal;
    @XmlElement(name = "InsuranceWanted")
    protected Boolean insuranceWanted;
    @XmlElement(name = "PaymentInstructions")
    protected String paymentInstructions;
    @XmlElement(name = "SalesTax")
    protected SalesTaxType salesTax;
    @XmlElement(name = "SellerPostalCode")
    protected String sellerPostalCode;

    /**
     * Gets the value of the allowPaymentEdit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPaymentEdit() {
        return allowPaymentEdit;
    }

    /**
     * Sets the value of the allowPaymentEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPaymentEdit(Boolean value) {
        this.allowPaymentEdit = value;
    }

    /**
     * Gets the value of the calculatedShippingRate property.
     * 
     * @return
     *     possible object is
     *     {@link CalculatedShippingRateType }
     *     
     */
    public CalculatedShippingRateType getCalculatedShippingRate() {
        return calculatedShippingRate;
    }

    /**
     * Sets the value of the calculatedShippingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculatedShippingRateType }
     *     
     */
    public void setCalculatedShippingRate(CalculatedShippingRateType value) {
        this.calculatedShippingRate = value;
    }

    /**
     * Gets the value of the changePaymentInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangePaymentInstructions() {
        return changePaymentInstructions;
    }

    /**
     * Sets the value of the changePaymentInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangePaymentInstructions(Boolean value) {
        this.changePaymentInstructions = value;
    }

    /**
     * Gets the value of the flatShippingRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flatShippingRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlatShippingRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlatShippingRateType }
     * 
     * 
     */
    public List<FlatShippingRateType> getFlatShippingRate() {
        if (flatShippingRate == null) {
            flatShippingRate = new ArrayList<FlatShippingRateType>();
        }
        return this.flatShippingRate;
    }

    /**
     * Gets the value of the insuranceTotal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getInsuranceTotal() {
        return insuranceTotal;
    }

    /**
     * Sets the value of the insuranceTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setInsuranceTotal(AmountType value) {
        this.insuranceTotal = value;
    }

    /**
     * Gets the value of the insuranceWanted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsuranceWanted() {
        return insuranceWanted;
    }

    /**
     * Sets the value of the insuranceWanted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsuranceWanted(Boolean value) {
        this.insuranceWanted = value;
    }

    /**
     * Gets the value of the paymentInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInstructions() {
        return paymentInstructions;
    }

    /**
     * Sets the value of the paymentInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInstructions(String value) {
        this.paymentInstructions = value;
    }

    /**
     * Gets the value of the salesTax property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxType }
     *     
     */
    public SalesTaxType getSalesTax() {
        return salesTax;
    }

    /**
     * Sets the value of the salesTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxType }
     *     
     */
    public void setSalesTax(SalesTaxType value) {
        this.salesTax = value;
    }

    /**
     * Gets the value of the sellerPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerPostalCode() {
        return sellerPostalCode;
    }

    /**
     * Sets the value of the sellerPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerPostalCode(String value) {
        this.sellerPostalCode = value;
    }

}