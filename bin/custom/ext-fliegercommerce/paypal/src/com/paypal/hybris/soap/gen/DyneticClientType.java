
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DyneticClientType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DyneticClientType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="WAP"/>
 *     &lt;enumeration value="J2MEClient"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DyneticClientType")
@XmlEnum
public enum DyneticClientType {

    @XmlEnumValue("none")
    NONE("none"),
    WAP("WAP"),
    @XmlEnumValue("J2MEClient")
    J_2_ME_CLIENT("J2MEClient");
    private final String value;

    DyneticClientType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DyneticClientType fromValue(String v) {
        for (DyneticClientType c: DyneticClientType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
