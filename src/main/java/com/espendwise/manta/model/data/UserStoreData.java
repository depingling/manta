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
 * UserStoreData generated by hbm2java
*/
@Entity
@Table(name="ESW_USER_STORE")
public class UserStoreData extends ValueObject implements TableObject,java.io.Serializable {

    private static final long serialVersionUID = -1;

    public static final String USER_STORE_ID = "userStoreId";
    public static final String ALL_USER_ID = "allUserId";
    public static final String ALL_STORE_ID = "allStoreId";
    public static final String LAST_LOGIN_DATE = "lastLoginDate";
    public static final String ADD_DATE = "addDate";
    public static final String ADD_BY = "addBy";
    public static final String MOD_DATE = "modDate";
    public static final String MOD_BY = "modBy";
    public static final String LOCALE_CD = "localeCd";

    private Long userStoreId;
    private Long allUserId;
    private Long allStoreId;
    private Date lastLoginDate;
    private Date addDate;
    private String addBy;
    private Date modDate;
    private String modBy;
    private String localeCd;

    public UserStoreData() {
    }
	
    public UserStoreData(Long allUserId, Long allStoreId, Date addDate, Date modDate) {
        this.setAllUserId(allUserId);
        this.setAllStoreId(allStoreId);
        this.setAddDate(addDate);
        this.setModDate(modDate);
    }

    public UserStoreData(Long allUserId, Long allStoreId, Date lastLoginDate, Date addDate, String addBy, Date modDate, String modBy, String localeCd) {
        this.setAllUserId(allUserId);
        this.setAllStoreId(allStoreId);
        this.setLastLoginDate(lastLoginDate);
        this.setAddDate(addDate);
        this.setAddBy(addBy);
        this.setModDate(modDate);
        this.setModBy(modBy);
        this.setLocaleCd(localeCd);
    }

    @SequenceGenerator(name="generator", sequenceName="ESW_USER_STORE_SEQ")
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.SEQUENCE, generator="generator")     
    @Column(name="USER_STORE_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getUserStoreId() {
        return this.userStoreId;
    }

    public void setUserStoreId(Long userStoreId) {
        this.userStoreId = userStoreId;
        setDirty(true);
    }

    
    @Column(name="ALL_USER_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getAllUserId() {
        return this.allUserId;
    }

    public void setAllUserId(Long allUserId) {
        this.allUserId = allUserId;
        setDirty(true);
    }

    
    @Column(name="ALL_STORE_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getAllStoreId() {
        return this.allStoreId;
    }

    public void setAllStoreId(Long allStoreId) {
        this.allStoreId = allStoreId;
        setDirty(true);
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="LAST_LOGIN_DATE", length=7)
    public Date getLastLoginDate() {
        return this.lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
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

    
    @Column(name="LOCALE_CD", length=5)
    public String getLocaleCd() {
        return this.localeCd;
    }

    public void setLocaleCd(String localeCd) {
        this.localeCd = localeCd;
        setDirty(true);
    }




}

