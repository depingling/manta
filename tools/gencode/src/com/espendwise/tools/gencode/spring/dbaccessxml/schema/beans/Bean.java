//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.02 at 09:40:28 AM MSK 
//


package com.espendwise.tools.gencode.spring.dbaccessxml.schema.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.espendwise.tools.gencode.spring.dbaccessxml.schema.aop.ScopedProxy;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.springframework.org/schema/aop}scoped-proxy"/>
 *         &lt;element ref="{http://www.springframework.org/schema/beans}property" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="destroy-method" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="factory-bean" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="factory-method" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="scope" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scopedProxy",
    "property"
})
@XmlRootElement(name = "bean")
public class Bean {

    @XmlElement(name = "scoped-proxy", namespace = "http://www.springframework.org/schema/aop")
    protected ScopedProxy scopedProxy;
    protected List<Property> property;
    @XmlAttribute(name = "class")
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "destroy-method")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String destroyMethod;
    @XmlAttribute(name = "factory-bean")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String factoryBean;
    @XmlAttribute(name = "factory-method")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String factoryMethod;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String id;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String scope;

    /**
     * Gets the value of the scopedProxy property.
     * 
     * @return
     *     possible object is
     *     {@link ScopedProxy }
     *     
     */
    public ScopedProxy getScopedProxy() {
        return scopedProxy;
    }

    /**
     * Sets the value of the scopedProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopedProxy }
     *     
     */
    public void setScopedProxy(ScopedProxy value) {
        this.scopedProxy = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the property property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Property }
     * 
     * 
     */
    public List<Property> getProperty() {
        if (property == null) {
            property = new ArrayList<Property>();
        }
        return this.property;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the destroyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestroyMethod() {
        return destroyMethod;
    }

    /**
     * Sets the value of the destroyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestroyMethod(String value) {
        this.destroyMethod = value;
    }

    /**
     * Gets the value of the factoryBean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryBean() {
        return factoryBean;
    }

    /**
     * Sets the value of the factoryBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryBean(String value) {
        this.factoryBean = value;
    }

    /**
     * Gets the value of the factoryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactoryMethod() {
        return factoryMethod;
    }

    /**
     * Sets the value of the factoryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactoryMethod(String value) {
        this.factoryMethod = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

}
