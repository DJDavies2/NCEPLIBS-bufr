//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.28 at 03:29:39 PM GMT-05:00 
//


package TableD25.jabx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="Category" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CategoryOfSequences_en" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FXY1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Title_en" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubTitle_en" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FXY2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ElementName_en" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="536870910"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ElementDescription_en" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="536870910"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Note_en" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "no",
    "category",
    "categoryOfSequencesEn",
    "fxy1",
    "titleEn",
    "subTitleEn",
    "fxy2",
    "elementNameEn",
    "elementDescriptionEn",
    "noteEn",
    "status"
})
@XmlRootElement(name = "BUFR_25_0_0_TableD_en")
public class BUFR2500TableDEn {

    @XmlElement(name = "No")
    protected Float no;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "CategoryOfSequences_en")
    protected String categoryOfSequencesEn;
    @XmlElement(name = "FXY1")
    protected String fxy1;
    @XmlElement(name = "Title_en")
    protected String titleEn;
    @XmlElement(name = "SubTitle_en")
    protected String subTitleEn;
    @XmlElement(name = "FXY2")
    protected String fxy2;
    @XmlElement(name = "ElementName_en")
    protected String elementNameEn;
    @XmlElement(name = "ElementDescription_en")
    protected String elementDescriptionEn;
    @XmlElement(name = "Note_en")
    protected String noteEn;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNo(Float value) {
        this.no = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryOfSequencesEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOfSequencesEn() {
        return categoryOfSequencesEn;
    }

    /**
     * Sets the value of the categoryOfSequencesEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOfSequencesEn(String value) {
        this.categoryOfSequencesEn = value;
    }

    /**
     * Gets the value of the fxy1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFXY1() {
        return fxy1;
    }

    /**
     * Sets the value of the fxy1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFXY1(String value) {
        this.fxy1 = value;
    }

    /**
     * Gets the value of the titleEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleEn() {
        return titleEn;
    }

    /**
     * Sets the value of the titleEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleEn(String value) {
        this.titleEn = value;
    }

    /**
     * Gets the value of the subTitleEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTitleEn() {
        return subTitleEn;
    }

    /**
     * Sets the value of the subTitleEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTitleEn(String value) {
        this.subTitleEn = value;
    }

    /**
     * Gets the value of the fxy2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFXY2() {
        return fxy2;
    }

    /**
     * Sets the value of the fxy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFXY2(String value) {
        this.fxy2 = value;
    }

    /**
     * Gets the value of the elementNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementNameEn() {
        return elementNameEn;
    }

    /**
     * Sets the value of the elementNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementNameEn(String value) {
        this.elementNameEn = value;
    }

    /**
     * Gets the value of the elementDescriptionEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementDescriptionEn() {
        return elementDescriptionEn;
    }

    /**
     * Sets the value of the elementDescriptionEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementDescriptionEn(String value) {
        this.elementDescriptionEn = value;
    }

    /**
     * Gets the value of the noteEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteEn() {
        return noteEn;
    }

    /**
     * Sets the value of the noteEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteEn(String value) {
        this.noteEn = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
