package com.espendwise.manta.model.fullentity;

// Generated by Hibernate Tools

import com.espendwise.manta.model.TableObject;
import com.espendwise.manta.model.ValueObject;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TemplatePropertyFullEntity generated by hbm2java
*/
@Entity
@Table(name="CLW_TEMPLATE_PROPERTY")
public interface TemplatePropertyFullEntity  {

    public static final String TEMPLATE_PROPERTY_ID = "templatePropertyId";
    public static final String TEMPLATE = "templateId";
    public static final String TEMPLATE_PROPERTY_CD = "templatePropertyCd";
    public static final String VALUE = "value";
    public static final String ADD_BY = "addBy";
    public static final String ADD_DATE = "addDate";
    public static final String MOD_BY = "modBy";
    public static final String MOD_DATE = "modDate";

    public static final String TEMPLATE_ID = "templateId.templateId";

    public void setTemplatePropertyId(Long templatePropertyId);
    @SequenceGenerator(name="generator", sequenceName="CLW_TEMPLATE_PROPERTY_SEQ")
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.SEQUENCE, generator="generator")     
    @Column(name="TEMPLATE_PROPERTY_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getTemplatePropertyId();

    public void setTemplateId(TemplateFullEntity templateId);
    @ManyToOne(fetch=FetchType.LAZY)    @JoinColumn(name="TEMPLATE_ID", nullable=false, columnDefinition="number")
    public TemplateFullEntity getTemplateId();

    public void setTemplatePropertyCd(String templatePropertyCd);
    
    @Column(name="TEMPLATE_PROPERTY_CD", nullable=false, length=30)
    public String getTemplatePropertyCd();

    public void setValue(String value);
    
    @Column(name="CLW_VALUE", length=4000)
    public String getValue();

    public void setAddBy(String addBy);
    
    @Column(name="ADD_BY")
    public String getAddBy();

    public void setAddDate(Date addDate);
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ADD_DATE", nullable=false, length=7)
    public Date getAddDate();

    public void setModBy(String modBy);
    
    @Column(name="MOD_BY")
    public String getModBy();

    public void setModDate(Date modDate);
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MOD_DATE", nullable=false, length=7)
    public Date getModDate();

}
