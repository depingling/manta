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
 * StoreMessageData generated by hbm2java
*/
@Entity
@Table(name="CLW_STORE_MESSAGE")
public class StoreMessageData extends ValueObject implements TableObject,java.io.Serializable {

    private static final long serialVersionUID = -1;

    public static final String STORE_MESSAGE_ID = "storeMessageId";
    public static final String MESSAGE_TITLE = "messageTitle";
    public static final String SHORT_DESC = "shortDesc";
    public static final String MESSAGE_TYPE = "messageType";
    public static final String POSTED_DATE = "postedDate";
    public static final String END_DATE = "endDate";
    public static final String FORCED_READ = "forcedRead";
    public static final String HOW_MANY_TIMES = "howManyTimes";
    public static final String FORCED_READ_COUNT = "forcedReadCount";
    public static final String PUBLISHED = "published";
    public static final String DISPLAY_ORDER = "displayOrder";
    public static final String LANGUAGE_CD = "languageCd";
    public static final String COUNTRY = "country";
    public static final String MESSAGE_AUTHOR = "messageAuthor";
    public static final String MESSAGE_ABSTRACT = "messageAbstract";
    public static final String MESSAGE_BODY = "messageBody";
    public static final String STORE_MESSAGE_STATUS_CD = "storeMessageStatusCd";
    public static final String ADD_BY = "addBy";
    public static final String ADD_DATE = "addDate";
    public static final String MOD_BY = "modBy";
    public static final String MOD_DATE = "modDate";

    private Long storeMessageId;
    private String messageTitle;
    private String shortDesc;
    private String messageType;
    private Date postedDate;
    private Date endDate;
    private String forcedRead;
    private Long howManyTimes;
    private Long forcedReadCount;
    private String published;
    private Long displayOrder;
    private String languageCd;
    private String country;
    private String messageAuthor;
    private String messageAbstract;
    private String messageBody;
    private String storeMessageStatusCd;
    private String addBy;
    private Date addDate;
    private String modBy;
    private Date modDate;

    public StoreMessageData() {
    }
	
    public StoreMessageData(String storeMessageStatusCd, Date addDate, Date modDate) {
        this.setStoreMessageStatusCd(storeMessageStatusCd);
        this.setAddDate(addDate);
        this.setModDate(modDate);
    }

    public StoreMessageData(String messageTitle, String shortDesc, String messageType, Date postedDate, Date endDate, String forcedRead, Long howManyTimes, Long forcedReadCount, String published, Long displayOrder, String languageCd, String country, String messageAuthor, String messageAbstract, String messageBody, String storeMessageStatusCd, String addBy, Date addDate, String modBy, Date modDate) {
        this.setMessageTitle(messageTitle);
        this.setShortDesc(shortDesc);
        this.setMessageType(messageType);
        this.setPostedDate(postedDate);
        this.setEndDate(endDate);
        this.setForcedRead(forcedRead);
        this.setHowManyTimes(howManyTimes);
        this.setForcedReadCount(forcedReadCount);
        this.setPublished(published);
        this.setDisplayOrder(displayOrder);
        this.setLanguageCd(languageCd);
        this.setCountry(country);
        this.setMessageAuthor(messageAuthor);
        this.setMessageAbstract(messageAbstract);
        this.setMessageBody(messageBody);
        this.setStoreMessageStatusCd(storeMessageStatusCd);
        this.setAddBy(addBy);
        this.setAddDate(addDate);
        this.setModBy(modBy);
        this.setModDate(modDate);
    }

    @SequenceGenerator(name="generator", sequenceName="CLW_STORE_MESSAGE_SEQ")
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.SEQUENCE, generator="generator")     
    @Column(name="STORE_MESSAGE_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getStoreMessageId() {
        return this.storeMessageId;
    }

    public void setStoreMessageId(Long storeMessageId) {
        this.storeMessageId = storeMessageId;
        setDirty(true);
    }

    
    @Column(name="MESSAGE_TITLE", length=128)
    public String getMessageTitle() {
        return this.messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
        setDirty(true);
    }

    
    @Column(name="SHORT_DESC")
    public String getShortDesc() {
        return this.shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
        setDirty(true);
    }

    
    @Column(name="MESSAGE_TYPE", length=50)
    public String getMessageType() {
        return this.messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
        setDirty(true);
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="POSTED_DATE", length=7)
    public Date getPostedDate() {
        return this.postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
        setDirty(true);
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="END_DATE", length=7)
    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
        setDirty(true);
    }

    
    @Column(name="FORCED_READ", length=30)
    public String getForcedRead() {
        return this.forcedRead;
    }

    public void setForcedRead(String forcedRead) {
        this.forcedRead = forcedRead;
        setDirty(true);
    }

    
    @Column(name="HOW_MANY_TIMES", columnDefinition="number", precision=38, scale=0)
    public Long getHowManyTimes() {
        return this.howManyTimes;
    }

    public void setHowManyTimes(Long howManyTimes) {
        this.howManyTimes = howManyTimes;
        setDirty(true);
    }

    
    @Column(name="FORCED_READ_COUNT", columnDefinition="number", precision=38, scale=0)
    public Long getForcedReadCount() {
        return this.forcedReadCount;
    }

    public void setForcedReadCount(Long forcedReadCount) {
        this.forcedReadCount = forcedReadCount;
        setDirty(true);
    }

    
    @Column(name="PUBLISHED", length=30)
    public String getPublished() {
        return this.published;
    }

    public void setPublished(String published) {
        this.published = published;
        setDirty(true);
    }

    
    @Column(name="DISPLAY_ORDER", columnDefinition="number", precision=38, scale=0)
    public Long getDisplayOrder() {
        return this.displayOrder;
    }

    public void setDisplayOrder(Long displayOrder) {
        this.displayOrder = displayOrder;
        setDirty(true);
    }

    
    @Column(name="LANGUAGE_CD", length=30)
    public String getLanguageCd() {
        return this.languageCd;
    }

    public void setLanguageCd(String languageCd) {
        this.languageCd = languageCd;
        setDirty(true);
    }

    
    @Column(name="COUNTRY")
    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
        setDirty(true);
    }

    
    @Column(name="MESSAGE_AUTHOR", length=60)
    public String getMessageAuthor() {
        return this.messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
        setDirty(true);
    }

    
    @Column(name="MESSAGE_ABSTRACT", length=200)
    public String getMessageAbstract() {
        return this.messageAbstract;
    }

    public void setMessageAbstract(String messageAbstract) {
        this.messageAbstract = messageAbstract;
        setDirty(true);
    }

    
    @Column(name="MESSAGE_BODY", length=4000)
    public String getMessageBody() {
        return this.messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
        setDirty(true);
    }

    
    @Column(name="STORE_MESSAGE_STATUS_CD", nullable=false, length=30)
    public String getStoreMessageStatusCd() {
        return this.storeMessageStatusCd;
    }

    public void setStoreMessageStatusCd(String storeMessageStatusCd) {
        this.storeMessageStatusCd = storeMessageStatusCd;
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
    @Column(name="ADD_DATE", nullable=false, length=7)
    public Date getAddDate() {
        return this.addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="MOD_DATE", nullable=false, length=7)
    public Date getModDate() {
        return this.modDate;
    }

    public void setModDate(Date modDate) {
        this.modDate = modDate;
        setDirty(true);
    }




}

