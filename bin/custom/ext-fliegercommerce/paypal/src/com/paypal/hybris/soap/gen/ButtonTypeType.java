
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ButtonTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ButtonTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BUYNOW"/>
 *     &lt;enumeration value="CART"/>
 *     &lt;enumeration value="GIFTCERTIFICATE"/>
 *     &lt;enumeration value="SUBSCRIBE"/>
 *     &lt;enumeration value="DONATE"/>
 *     &lt;enumeration value="UNSUBSCRIBE"/>
 *     &lt;enumeration value="VIEWCART"/>
 *     &lt;enumeration value="PAYMENTPLAN"/>
 *     &lt;enumeration value="AUTOBILLING"/>
 *     &lt;enumeration value="PAYMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ButtonTypeType")
@XmlEnum
public enum ButtonTypeType {


    /**
     *   button type is BUYNOW
     * 
     */
    BUYNOW,

    /**
     *   button type is CART
     * 
     */
    CART,

    /**
     *   button type is GIFTCERTIFICATE
     * 
     */
    GIFTCERTIFICATE,

    /**
     *   button type is SUBSCRIBE
     * 
     */
    SUBSCRIBE,

    /**
     *   button type is DONATE
     * 
     */
    DONATE,

    /**
     *   button type is UNSUBSCRIBE
     * 
     */
    UNSUBSCRIBE,

    /**
     *  button type is VIEWCART
     * 
     */
    VIEWCART,

    /**
     *  button type is PAYMENTPLAN
     * 
     */
    PAYMENTPLAN,

    /**
     *  button type is AUTOBILLING
     * 
     */
    AUTOBILLING,

    /**
     *   button type is PAYMENT
     * 
     */
    PAYMENT;

    public String value() {
        return name();
    }

    public static ButtonTypeType fromValue(String v) {
        return valueOf(v);
    }

}
