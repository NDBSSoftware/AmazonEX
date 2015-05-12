
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManageRecurringPaymentsProfileStatusRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManageRecurringPaymentsProfileStatusRequestType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ebay:apis:eBLBaseComponents}AbstractRequestType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:apis:eBLBaseComponents}ManageRecurringPaymentsProfileStatusRequestDetails"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManageRecurringPaymentsProfileStatusRequestType", namespace = "urn:ebay:api:PayPalAPI", propOrder = {
    "manageRecurringPaymentsProfileStatusRequestDetails"
})
public class ManageRecurringPaymentsProfileStatusRequestType
    extends AbstractRequestType
{

    @XmlElement(name = "ManageRecurringPaymentsProfileStatusRequestDetails", namespace = "urn:ebay:apis:eBLBaseComponents", required = true)
    protected ManageRecurringPaymentsProfileStatusRequestDetailsType manageRecurringPaymentsProfileStatusRequestDetails;

    /**
     * Gets the value of the manageRecurringPaymentsProfileStatusRequestDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ManageRecurringPaymentsProfileStatusRequestDetailsType }
     *     
     */
    public ManageRecurringPaymentsProfileStatusRequestDetailsType getManageRecurringPaymentsProfileStatusRequestDetails() {
        return manageRecurringPaymentsProfileStatusRequestDetails;
    }

    /**
     * Sets the value of the manageRecurringPaymentsProfileStatusRequestDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManageRecurringPaymentsProfileStatusRequestDetailsType }
     *     
     */
    public void setManageRecurringPaymentsProfileStatusRequestDetails(ManageRecurringPaymentsProfileStatusRequestDetailsType value) {
        this.manageRecurringPaymentsProfileStatusRequestDetails = value;
    }

}
