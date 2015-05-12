
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}Balance"/>
 *         &lt;element name="Credit" type="{urn:ebay:apis:CoreComponentTypes}AmountType"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Debit" type="{urn:ebay:apis:CoreComponentTypes}AmountType"/>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ItemID"/>
 *         &lt;element name="Memo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RefNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AccountEntryDetailsType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountEntryType", propOrder = {
    "balance",
    "credit",
    "date",
    "debit",
    "itemID",
    "memo",
    "refNumber",
    "accountEntryDetailsType"
})
public class AccountEntryType {

    @XmlElement(name = "Balance", required = true)
    protected AmountType balance;
    @XmlElement(name = "Credit", required = true)
    protected AmountType credit;
    @XmlElement(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Debit", required = true)
    protected AmountType debit;
    @XmlElement(name = "ItemID", required = true)
    protected String itemID;
    @XmlElement(name = "Memo", required = true)
    protected String memo;
    @XmlElement(name = "RefNumber")
    protected int refNumber;
    @XmlElement(name = "AccountEntryDetailsType")
    protected int accountEntryDetailsType;

    /**
     * 
     * 			          Balance as of a given entry, can be 0.00.
     * 			       
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBalance(AmountType value) {
        this.balance = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setCredit(AmountType value) {
        this.credit = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the debit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDebit() {
        return debit;
    }

    /**
     * Sets the value of the debit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDebit(AmountType value) {
        this.debit = value;
    }

    /**
     * 
     * 			           Item number if transaction is associated with an auction or 0 
     * 			           if no item is associated with an account entry.      
     * 			       
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemID(String value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     */
    public int getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     */
    public void setRefNumber(int value) {
        this.refNumber = value;
    }

    /**
     * Gets the value of the accountEntryDetailsType property.
     * 
     */
    public int getAccountEntryDetailsType() {
        return accountEntryDetailsType;
    }

    /**
     * Sets the value of the accountEntryDetailsType property.
     * 
     */
    public void setAccountEntryDetailsType(int value) {
        this.accountEntryDetailsType = value;
    }

}
