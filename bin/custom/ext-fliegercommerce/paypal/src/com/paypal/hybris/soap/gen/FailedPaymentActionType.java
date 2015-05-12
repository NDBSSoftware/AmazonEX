
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FailedPaymentActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FailedPaymentActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CancelOnFailure"/>
 *     &lt;enumeration value="ContinueOnFailure"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FailedPaymentActionType")
@XmlEnum
public enum FailedPaymentActionType {

    @XmlEnumValue("CancelOnFailure")
    CANCEL_ON_FAILURE("CancelOnFailure"),
    @XmlEnumValue("ContinueOnFailure")
    CONTINUE_ON_FAILURE("ContinueOnFailure");
    private final String value;

    FailedPaymentActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FailedPaymentActionType fromValue(String v) {
        for (FailedPaymentActionType c: FailedPaymentActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
