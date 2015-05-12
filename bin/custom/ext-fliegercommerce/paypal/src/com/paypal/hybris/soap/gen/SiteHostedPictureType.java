
package com.paypal.hybris.soap.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiteHostedPictureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteHostedPictureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="6" minOccurs="0"/>
 *         &lt;element name="PhotoDisplay" type="{urn:ebay:apis:eBLBaseComponents}PhotoDisplayCodeType" minOccurs="0"/>
 *         &lt;element name="GalleryType" type="{urn:ebay:apis:eBLBaseComponents}GalleryTypeCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteHostedPictureType", propOrder = {
    "pictureURL",
    "photoDisplay",
    "galleryType"
})
public class SiteHostedPictureType {

    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> pictureURL;
    @XmlElement(name = "PhotoDisplay")
    protected PhotoDisplayCodeType photoDisplay;
    @XmlElement(name = "GalleryType")
    protected GalleryTypeCodeType galleryType;

    /**
     * Gets the value of the pictureURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictureURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictureURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPictureURL() {
        if (pictureURL == null) {
            pictureURL = new ArrayList<String>();
        }
        return this.pictureURL;
    }

    /**
     * Gets the value of the photoDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoDisplayCodeType }
     *     
     */
    public PhotoDisplayCodeType getPhotoDisplay() {
        return photoDisplay;
    }

    /**
     * Sets the value of the photoDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoDisplayCodeType }
     *     
     */
    public void setPhotoDisplay(PhotoDisplayCodeType value) {
        this.photoDisplay = value;
    }

    /**
     * Gets the value of the galleryType property.
     * 
     * @return
     *     possible object is
     *     {@link GalleryTypeCodeType }
     *     
     */
    public GalleryTypeCodeType getGalleryType() {
        return galleryType;
    }

    /**
     * Sets the value of the galleryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GalleryTypeCodeType }
     *     
     */
    public void setGalleryType(GalleryTypeCodeType value) {
        this.galleryType = value;
    }

}
