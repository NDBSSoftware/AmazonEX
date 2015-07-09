//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/com.pixi.webservices.jaxb/jaxb">http://java.sun.com/com.pixi.webservices.jaxb/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.30 at 04:30:02 PM CEST 
//


package com.pixi.webservices.jaxb.stock.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import java.util.Date;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pixi.webservices.jaxb.stock.response package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SessionID_QNAME = new QName("", "sessionID");
    private final static QName _DESCRIPTION_QNAME = new QName("", "DESCRIPTION");
    private final static QName _EXPORTDATE_QNAME = new QName("", "EXPORT_DATE");
    private final static QName _STATUS_QNAME = new QName("", "STATUS");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pixi.webservices.jaxb.stock.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImportProductStockResponse }
     * 
     */
    public ImportProductStockResponse createANSWER() {
        return new ImportProductStockResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sessionID")
    public JAXBElement<String> createSessionID(String value) {
        return new JAXBElement<String>(_SessionID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DESCRIPTION")
    public JAXBElement<String> createDESCRIPTION(String value) {
        return new JAXBElement<String>(_DESCRIPTION_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Date }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EXPORT_DATE")
    public JAXBElement<Date> createEXPORTDATE(Date value) {
        return new JAXBElement<Date>(_EXPORTDATE_QNAME, Date.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "STATUS")
    public JAXBElement<String> createSTATUS(String value) {
        return new JAXBElement<String>(_STATUS_QNAME, String.class, null, value);
    }

}