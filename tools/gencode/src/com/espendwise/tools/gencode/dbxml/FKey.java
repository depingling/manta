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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fkey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fkey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fkeyref" type="{}fkeyref"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fkTable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pkName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pkTable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fkey", propOrder = {
    "fkeyref"
})
public class FKey {

    @XmlElement(required = true)
    protected FKeyRef fkeyref;
    @XmlAttribute
    protected String fkTable;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String pkName;
    @XmlAttribute
    protected String pkTable;

    /**
     * Gets the value of the fkeyref property.
     * 
     * @return
     *     possible object is
     *     {@link FKeyRef }
     *     
     */
    public FKeyRef getFKeyRef() {
        return fkeyref;
    }

    /**
     * Sets the value of the fkeyref property.
     * 
     * @param value
     *     allowed object is
     *     {@link FKeyRef }
     *     
     */
    public void setFKeyRef(FKeyRef value) {
        this.fkeyref = value;
    }

    /**
     * Gets the value of the fkTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkTable() {
        return fkTable;
    }

    /**
     * Sets the value of the fkTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkTable(String value) {
        this.fkTable = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkName() {
        return pkName;
    }

    /**
     * Sets the value of the pkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkName(String value) {
        this.pkName = value;
    }

    /**
     * Gets the value of the pkTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPkTable() {
        return pkTable;
    }

    /**
     * Sets the value of the pkTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPkTable(String value) {
        this.pkTable = value;
    }

}
