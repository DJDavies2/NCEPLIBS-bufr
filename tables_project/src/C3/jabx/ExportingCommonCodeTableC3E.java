//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.12 at 04:47:50 PM EDT 
//


package C3.jabx;

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
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IXIIXIX" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUFR" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Instrument_x0020_make_x0020_and_x0020_type" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EquationCoefficients_a" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EquationCoefficients_b" minOccurs="0">
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
    "ixiixix",
    "bufr",
    "instrumentX0020MakeX0020AndX0020Type",
    "equationCoefficientsA",
    "equationCoefficientsB",
    "status"
})
@XmlRootElement(name = "Exporting_CommonCodeTableC3_E")
public class ExportingCommonCodeTableC3E {

    @XmlElement(name = "No")
    protected Double no;
    @XmlElement(name = "IXIIXIX")
    protected String ixiixix;
    @XmlElement(name = "BUFR")
    protected String bufr;
    @XmlElement(name = "Instrument_x0020_make_x0020_and_x0020_type")
    protected String instrumentX0020MakeX0020AndX0020Type;
    @XmlElement(name = "EquationCoefficients_a")
    protected String equationCoefficientsA;
    @XmlElement(name = "EquationCoefficients_b")
    protected String equationCoefficientsB;
    @XmlElement(name = "Status")
    protected String status;

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNo(Double value) {
        this.no = value;
    }

    /**
     * Gets the value of the ixiixix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIXIIXIX() {
        return ixiixix;
    }

    /**
     * Sets the value of the ixiixix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIXIIXIX(String value) {
        this.ixiixix = value;
    }

    /**
     * Gets the value of the bufr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUFR() {
        return bufr;
    }

    /**
     * Sets the value of the bufr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUFR(String value) {
        this.bufr = value;
    }

    /**
     * Gets the value of the instrumentX0020MakeX0020AndX0020Type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrumentX0020MakeX0020AndX0020Type() {
        return instrumentX0020MakeX0020AndX0020Type;
    }

    /**
     * Sets the value of the instrumentX0020MakeX0020AndX0020Type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrumentX0020MakeX0020AndX0020Type(String value) {
        this.instrumentX0020MakeX0020AndX0020Type = value;
    }

    /**
     * Gets the value of the equationCoefficientsA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquationCoefficientsA() {
        return equationCoefficientsA;
    }

    /**
     * Sets the value of the equationCoefficientsA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquationCoefficientsA(String value) {
        this.equationCoefficientsA = value;
    }

    /**
     * Gets the value of the equationCoefficientsB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquationCoefficientsB() {
        return equationCoefficientsB;
    }

    /**
     * Sets the value of the equationCoefficientsB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquationCoefficientsB(String value) {
        this.equationCoefficientsB = value;
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
