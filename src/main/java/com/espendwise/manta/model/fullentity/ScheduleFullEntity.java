package com.espendwise.manta.model.fullentity;

// Generated by Hibernate Tools

import com.espendwise.manta.model.TableObject;
import com.espendwise.manta.model.ValueObject;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ScheduleFullEntity generated by hbm2java
*/
@Entity
@Table(name="CLW_SCHEDULE")
public interface ScheduleFullEntity  {

    public static final String SCHEDULE_ID = "scheduleId";
    public static final String BUS_ENTITY = "busEntityId";
    public static final String SHORT_DESC = "shortDesc";
    public static final String SCHEDULE_STATUS_CD = "scheduleStatusCd";
    public static final String SCHEDULE_TYPE_CD = "scheduleTypeCd";
    public static final String SCHEDULE_RULE_CD = "scheduleRuleCd";
    public static final String CYCLE = "cycle";
    public static final String EFF_DATE = "effDate";
    public static final String EXP_DATE = "expDate";
    public static final String ADD_DATE = "addDate";
    public static final String ADD_BY = "addBy";
    public static final String MOD_DATE = "modDate";
    public static final String MOD_BY = "modBy";
    public static final String SCHEDULE_DETAILS = "scheduleDetails";

    public static final String BUS_ENTITY_ID = "busEntityId.busEntityId";

    public void setScheduleId(Long scheduleId);
    @SequenceGenerator(name="generator", sequenceName="CLW_SCHEDULE_SEQ")
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.SEQUENCE, generator="generator")     
    @Column(name="SCHEDULE_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getScheduleId();

    public void setBusEntityId(BusEntityFullEntity busEntityId);
    @ManyToOne(fetch=FetchType.LAZY)    @JoinColumn(name="BUS_ENTITY_ID", columnDefinition="number")
    public BusEntityFullEntity getBusEntityId();

    public void setShortDesc(String shortDesc);
    
    @Column(name="SHORT_DESC", length=30)
    public String getShortDesc();

    public void setScheduleStatusCd(String scheduleStatusCd);
    
    @Column(name="SCHEDULE_STATUS_CD", nullable=false, length=30)
    public String getScheduleStatusCd();

    public void setScheduleTypeCd(String scheduleTypeCd);
    
    @Column(name="SCHEDULE_TYPE_CD", nullable=false, length=30)
    public String getScheduleTypeCd();

    public void setScheduleRuleCd(String scheduleRuleCd);
    
    @Column(name="SCHEDULE_RULE_CD", nullable=false, length=30)
    public String getScheduleRuleCd();

    public void setCycle(Long cycle);
    
    @Column(name="CYCLE", columnDefinition="number", precision=38, scale=0)
    public Long getCycle();

    public void setEffDate(Date effDate);
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EFF_DATE", nullable=false, length=7)
    public Date getEffDate();

    public void setExpDate(Date expDate);
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="EXP_DATE", length=7)
    public Date getExpDate();

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

    public void setScheduleDetails(Set<ScheduleDetailFullEntity> scheduleDetails);
    @OneToMany(fetch=FetchType.LAZY, mappedBy="scheduleId")
    public Set<ScheduleDetailFullEntity> getScheduleDetails();

}

