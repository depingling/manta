//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.21 at 11:35:30 AM MSK 
//


package com.espendwise.tools.gencode.dbxml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for fkeyref complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fkeyref">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="fkColumnName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pkColumnName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fkeyref", propOrder = {
    "value"
})
public class FKeyRef {

    @XmlValue
    protected String value;
    @XmlAttribute
    protected String fkColumnName;
    @XmlAttribute
    protected String pkColumnName;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the fkColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkColumnName() {
        return fkColumnName;
    }

    /**
     * Sets the value of the fkColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkColumnName(String value) {
        this.fkColumnName = value;
    }

    /**
     * Gets the value of the pkColumnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkColumnName() {
        return pkColumnName;
    }

    /**
     * Sets the value of the pkColumnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkColumnName(String value) {
        this.pkColumnName = value;
    }

}
