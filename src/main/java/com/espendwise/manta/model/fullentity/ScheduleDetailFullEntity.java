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
 * ScheduleDetailFullEntity generated by hbm2java
*/
@Entity
@Table(name="CLW_SCHEDULE_DETAIL")
public interface ScheduleDetailFullEntity  {

    public static final String SCHEDULE_DETAIL_ID = "scheduleDetailId";
    public static final String SCHEDULE = "scheduleId";
    public static final String SCHEDULE_DETAIL_CD = "scheduleDetailCd";
    public static final String VALUE = "value";
    public static final String ADD_DATE = "addDate";
    public static final String ADD_BY = "addBy";
    public static final String MOD_DATE = "modDate";
    public static final String MOD_BY = "modBy";
    public static final String COUNTRY_CD = "countryCd";

    public static final String SCHEDULE_ID = "scheduleId.scheduleId";

    public void setScheduleDetailId(Long scheduleDetailId);
    @SequenceGenerator(name="generator", sequenceName="CLW_SCHEDULE_DETAIL_SEQ")
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.SEQUENCE, generator="generator")     
    @Column(name="SCHEDULE_DETAIL_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getScheduleDetailId();

    public void setScheduleId(ScheduleFullEntity scheduleId);
    @ManyToOne(fetch=FetchType.LAZY)    @JoinColumn(name="SCHEDULE_ID", nullable=false, columnDefinition="number")
    public ScheduleFullEntity getScheduleId();

    public void setScheduleDetailCd(String scheduleDetailCd);
    
    @Column(name="SCHEDULE_DETAIL_CD", nullable=false, length=30)
    public String getScheduleDetailCd();

    public void setValue(String value);
    
    @Column(name="VALUE", nullable=false, length=30)
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

    public void setCountryCd(String countryCd);
    
    @Column(name="COUNTRY_CD", length=30)
    public String getCountryCd();

}
