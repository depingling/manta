package com.espendwise.manta.model.data;
// Generated by Hibernate Tools


import com.espendwise.manta.model.TableObject;
import com.espendwise.manta.model.ValueObject;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * ScheduleDetailData generated by hbm2java
*/
@Entity
@Table(name="CLW_SCHEDULE_DETAIL")
public class ScheduleDetailData extends ValueObject implements TableObject,java.io.Serializable {

    private static final long serialVersionUID = -1;

    public static final String SCHEDULE_DETAIL_ID = "scheduleDetailId";
    public static final String SCHEDULE_ID = "scheduleId";
    public static final String SCHEDULE_DETAIL_CD = "scheduleDetailCd";
    public static final String VALUE = "value";
    public static final String ADD_DATE = "addDate";
    public static final String ADD_BY = "addBy";
    public static final String MOD_DATE = "modDate";
    public static final String MOD_BY = "modBy";
    public static final String COUNTRY_CD = "countryCd";

    private Long scheduleDetailId;
    private Long scheduleId;
    private String scheduleDetailCd;
    private String value;
    private Date addDate;
    private String addBy;
    private Date modDate;
    private String modBy;
    private String countryCd;

    public ScheduleDetailData() {
    }
	
    public ScheduleDetailData(Long scheduleId, String scheduleDetailCd, String value, Date addDate, Date modDate) {
        this.setScheduleId(scheduleId);
        this.setScheduleDetailCd(scheduleDetailCd);
        this.setValue(value);
        this.setAddDate(addDate);
        this.setModDate(modDate);
    }

    public ScheduleDetailData(Long scheduleId, String scheduleDetailCd, String value, Date addDate, String addBy, Date modDate, String modBy, String countryCd) {
        this.setScheduleId(scheduleId);
        this.setScheduleDetailCd(scheduleDetailCd);
        this.setValue(value);
        this.setAddDate(addDate);
        this.setAddBy(addBy);
        this.setModDate(modDate);
        this.setModBy(modBy);
        this.setCountryCd(countryCd);
    }

    @SequenceGenerator(name="generator", sequenceName="CLW_SCHEDULE_DETAIL_SEQ")
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.SEQUENCE, generator="generator")     
    @Column(name="SCHEDULE_DETAIL_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getScheduleDetailId() {
        return this.scheduleDetailId;
    }

    public void setScheduleDetailId(Long scheduleDetailId) {
        this.scheduleDetailId = scheduleDetailId;
        setDirty(true);
    }

    
    @Column(name="SCHEDULE_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getScheduleId() {
        return this.scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
        setDirty(true);
    }

    
    @Column(name="SCHEDULE_DETAIL_CD", nullable=false, length=30)
    public String getScheduleDetailCd() {
        return this.scheduleDetailCd;
    }

    public void setScheduleDetailCd(String scheduleDetailCd) {
        this.scheduleDetailCd = scheduleDetailCd;
        setDirty(true);
    }

    
    @Column(name="VALUE", nullable=false, length=30)
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
        setDirty(true);
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ADD_DATE", nullable=false, length=7)
    public Date getAddDate() {
        return this.addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
        setDirty(true);
    }

    
    @Column(name="ADD_BY")
    public String getAddBy() {
        return this.addBy;
    }

    public void setAddBy(String addBy) {
        this.addBy = addBy;
        setDirty(true);
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MOD_DATE", nullable=false, length=7)
    public Date getModDate() {
        return this.modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
        setDirty(true);
    }

    
    @Column(name="MOD_BY")
    public String getModBy() {
        return this.modBy;
    }

    public void setModBy(String modBy) {
        this.modBy = modBy;
        setDirty(true);
    }

    
    @Column(name="COUNTRY_CD", length=30)
    public String getCountryCd() {
        return this.countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
        setDirty(true);
    }




}

