//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.05 at 03:44:45 PM EDT 
//


package C13.jabx;

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
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodeFigure_Category" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name_Category" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CodeFigure_Subcategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name_Subcategory" minOccurs="0">
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
    "codeFigureCategory",
    "nameCategory",
    "codeFigureSubcategory",
    "nameSubcategory",
    "status"
})
@XmlRootElement(name = "Exporting_CommonCodeTableC13_E")
public class ExportingCommonCodeTableC13E {

    @XmlElement(name = "No")
    protected Integer no;
    @XmlElement(name = "CodeFigure_Category")
    protected String codeFigureCategory;
    @XmlElement(name = "Name_Category")
    protected String nameCategory;
    @XmlElement(name = "CodeFigure_Subcategory")
    protected String codeFigureSubcategory;
    @XmlElement(name = "Name_Subcategory")
    protected String nameSubcategory;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo(Integer value) {
        this.no = value;
    }

    /**
     * Gets the value of the codeFigureCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeFigureCategory() {
        return codeFigureCategory;
    }

    /**
     * Sets the value of the codeFigureCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeFigureCategory(String value) {
        this.codeFigureCategory = value;
    }

    /**
     * Gets the value of the nameCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameCategory() {
        return nameCategory;
    }

    /**
     * Sets the value of the nameCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameCategory(String value) {
        this.nameCategory = value;
    }

    /**
     * Gets the value of the codeFigureSubcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeFigureSubcategory() {
        return codeFigureSubcategory;
    }

    /**
     * Sets the value of the codeFigureSubcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeFigureSubcategory(String value) {
        this.codeFigureSubcategory = value;
    }

    /**
     * Gets the value of the nameSubcategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameSubcategory() {
        return nameSubcategory;
    }

    /**
     * Sets the value of the nameSubcategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameSubcategory(String value) {
        this.nameSubcategory = value;
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
