//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.28 at 03:28:48 PM GMT-05:00 
//


package TableB25.jabx;

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
 *         &lt;element name="ClassNo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClassName_en" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FXY" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ElementName_en" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
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
 *         &lt;element name="BUFR_Unit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUFR_Scale" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUFR_ReferenceValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUFR_DataWidth_Bits" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREX_Unit" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREX_Scale" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CREX_DataWidth_Char" minOccurs="0">
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
    "classNo",
    "classNameEn",
    "fxy",
    "elementNameEn",
    "noteEn",
    "bufrUnit",
    "bufrScale",
    "bufrReferenceValue",
    "bufrDataWidthBits",
    "crexUnit",
    "crexScale",
    "crexDataWidthChar",
    "status"
})
@XmlRootElement(name = "BUFRCREX_25_0_0_TableB_en")
public class BUFRCREX2500TableBEn {

    @XmlElement(name = "No")
    protected Float no;
    @XmlElement(name = "ClassNo")
    protected String classNo;
    @XmlElement(name = "ClassName_en")
    protected String classNameEn;
    @XmlElement(name = "FXY")
    protected String fxy;
    @XmlElement(name = "ElementName_en")
    protected String elementNameEn;
    @XmlElement(name = "Note_en")
    protected String noteEn;
    @XmlElement(name = "BUFR_Unit")
    protected String bufrUnit;
    @XmlElement(name = "BUFR_Scale")
    protected String bufrScale;
    @XmlElement(name = "BUFR_ReferenceValue")
    protected String bufrReferenceValue;
    @XmlElement(name = "BUFR_DataWidth_Bits")
    protected String bufrDataWidthBits;
    @XmlElement(name = "CREX_Unit")
    protected String crexUnit;
    @XmlElement(name = "CREX_Scale")
    protected String crexScale;
    @XmlElement(name = "CREX_DataWidth_Char")
    protected String crexDataWidthChar;
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
     * Gets the value of the classNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassNo() {
        return classNo;
    }

    /**
     * Sets the value of the classNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassNo(String value) {
        this.classNo = value;
    }

    /**
     * Gets the value of the classNameEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassNameEn() {
        return classNameEn;
    }

    /**
     * Sets the value of the classNameEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassNameEn(String value) {
        this.classNameEn = value;
    }

    /**
     * Gets the value of the fxy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFXY() {
        return fxy;
    }

    /**
     * Sets the value of the fxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFXY(String value) {
        this.fxy = value;
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
     * Gets the value of the bufrUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUFRUnit() {
        return bufrUnit;
    }

    /**
     * Sets the value of the bufrUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUFRUnit(String value) {
        this.bufrUnit = value;
    }

    /**
     * Gets the value of the bufrScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUFRScale() {
        return bufrScale;
    }

    /**
     * Sets the value of the bufrScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUFRScale(String value) {
        this.bufrScale = value;
    }

    /**
     * Gets the value of the bufrReferenceValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUFRReferenceValue() {
        return bufrReferenceValue;
    }

    /**
     * Sets the value of the bufrReferenceValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUFRReferenceValue(String value) {
        this.bufrReferenceValue = value;
    }

    /**
     * Gets the value of the bufrDataWidthBits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUFRDataWidthBits() {
        return bufrDataWidthBits;
    }

    /**
     * Sets the value of the bufrDataWidthBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUFRDataWidthBits(String value) {
        this.bufrDataWidthBits = value;
    }

    /**
     * Gets the value of the crexUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREXUnit() {
        return crexUnit;
    }

    /**
     * Sets the value of the crexUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREXUnit(String value) {
        this.crexUnit = value;
    }

    /**
     * Gets the value of the crexScale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREXScale() {
        return crexScale;
    }

    /**
     * Sets the value of the crexScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREXScale(String value) {
        this.crexScale = value;
    }

    /**
     * Gets the value of the crexDataWidthChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCREXDataWidthChar() {
        return crexDataWidthChar;
    }

    /**
     * Sets the value of the crexDataWidthChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCREXDataWidthChar(String value) {
        this.crexDataWidthChar = value;
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
