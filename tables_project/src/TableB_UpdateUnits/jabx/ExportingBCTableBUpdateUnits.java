//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.11.09 at 12:52:14 PM EST 
//


package TableB_UpdateUnits.jabx;

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
 *         &lt;element name="BUFR_Unit_Old">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BUFR_Unit_New">
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
    "bufrUnitOld",
    "bufrUnitNew"
})
@XmlRootElement(name = "Exporting_BCTableB_UpdateUnits")
public class ExportingBCTableBUpdateUnits {

    @XmlElement(name = "BUFR_Unit_Old", required = true)
    protected String bufrUnitOld;
    @XmlElement(name = "BUFR_Unit_New", required = true)
    protected String bufrUnitNew;

    /**
     * Gets the value of the bufrUnitOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUFRUnitOld() {
        return bufrUnitOld;
    }

    /**
     * Sets the value of the bufrUnitOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUFRUnitOld(String value) {
        this.bufrUnitOld = value;
    }

    /**
     * Gets the value of the bufrUnitNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUFRUnitNew() {
        return bufrUnitNew;
    }

    /**
     * Sets the value of the bufrUnitNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUFRUnitNew(String value) {
        this.bufrUnitNew = value;
    }

}
