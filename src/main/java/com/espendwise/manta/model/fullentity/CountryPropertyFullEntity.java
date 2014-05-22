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
 * CountryPropertyFullEntity generated by hbm2java
*/
@Entity
@Table(name="CLW_COUNTRY_PROPERTY")
public interface CountryPropertyFullEntity  {

    public static final String COUNTRY_PROPERTY_ID = "countryPropertyId";
    public static final String COUNTRY = "countryId";
    public static final String COUNTRY_PROPERTY_CD = "countryPropertyCd";
    public static final String VALUE = "value";
    public static final String ADD_DATE = "addDate";
    public static final String ADD_BY = "addBy";
    public static final String MOD_DATE = "modDate";
    public static final String MOD_BY = "modBy";

    public static final String COUNTRY_ID = "countryId.countryId";

    public void setCountryPropertyId(Long countryPropertyId);
    @SequenceGenerator(name="generator", sequenceName="CLW_COUNTRY_PROPERTY_SEQ")
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.SEQUENCE, generator="generator")     
    @Column(name="COUNTRY_PROPERTY_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getCountryPropertyId();

    public void setCountryId(CountryFullEntity countryId);
    @ManyToOne(fetch=FetchType.LAZY)    @JoinColumn(name="COUNTRY_ID", nullable=false, columnDefinition="number")
    public CountryFullEntity getCountryId();

    public void setCountryPropertyCd(String countryPropertyCd);
    
    @Column(name="COUNTRY_PROPERTY_CD", nullable=false, length=30)
    public String getCountryPropertyCd();

    public void setValue(String value);
    
    @Column(name="CLW_VALUE", length=12)
    public String getValue();

    public void setAddDate(Date addDate);
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ADD_DATE", nullable=false, length=7)
    public Date getAddDate();

    public void setAddBy(String addBy);
    
    @Column(name="ADD_BY")
    public String getAddBy();

    public void setModDate(Date modDate);
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MOD_DATE", nullable=false, length=7)
    public Date getModDate();

    public void setModBy(String modBy);
    
    @Column(name="MOD_BY")
    public String getModBy();

}

