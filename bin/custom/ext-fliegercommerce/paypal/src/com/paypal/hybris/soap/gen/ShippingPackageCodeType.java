
package com.paypal.hybris.soap.gen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingPackageCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingPackageCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Letter"/>
 *     &lt;enumeration value="LargeEnvelope"/>
 *     &lt;enumeration value="USPSLargePack"/>
 *     &lt;enumeration value="VeryLargePack"/>
 *     &lt;enumeration value="UPSLetter"/>
 *     &lt;enumeration value="USPSFlatRateEnvelope"/>
 *     &lt;enumeration value="PackageThickEnvelope"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingPackageCodeType")
@XmlEnum
public enum ShippingPackageCodeType {


    /**
     * 
     * 						    None.
     * 					
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * 
     * 						   Letter.
     * 					
     * 
     */
    @XmlEnumValue("Letter")
    LETTER("Letter"),

    /**
     * 
     * 						   LargeEnvelope
     * 					
     * 
     */
    @XmlEnumValue("LargeEnvelope")
    LARGE_ENVELOPE("LargeEnvelope"),

    /**
     * 
     * 						   USPS Large Package/Oversize 1
     * 					
     * 
     */
    @XmlEnumValue("USPSLargePack")
    USPS_LARGE_PACK("USPSLargePack"),

    /**
     * 
     * 						   Very Large Package/Oversize 2
     * 					
     * 
     */
    @XmlEnumValue("VeryLargePack")
    VERY_LARGE_PACK("VeryLargePack"),

    /**
     * 
     * 						   UPS Letter
     * 					
     * 
     */
    @XmlEnumValue("UPSLetter")
    UPS_LETTER("UPSLetter"),

    /**
     * 
     * 						   USPS Flat Rate Envelope
     * 					
     * 
     */
    @XmlEnumValue("USPSFlatRateEnvelope")
    USPS_FLAT_RATE_ENVELOPE("USPSFlatRateEnvelope"),

    /**
     * 
     * 						    Package/thick envelope
     * 					
     * 
     */
    @XmlEnumValue("PackageThickEnvelope")
    PACKAGE_THICK_ENVELOPE("PackageThickEnvelope"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingPackageCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingPackageCodeType fromValue(String v) {
        for (ShippingPackageCodeType c: ShippingPackageCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
