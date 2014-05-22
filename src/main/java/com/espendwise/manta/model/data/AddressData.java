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
import org.hibernate.annotations.Type;
/**
 * AddressData generated by hbm2java
*/
@Entity
@Table(name="CLW_ADDRESS")
public class AddressData extends ValueObject implements TableObject,java.io.Serializable {

    private static final long serialVersionUID = -1;

    public static final String ADDRESS_ID = "addressId";
    public static final String BUS_ENTITY_ID = "busEntityId";
    public static final String USER_ID = "userId";
    public static final String NAME1 = "name1";
    public static final String NAME2 = "name2";
    public static final String ADDRESS1 = "address1";
    public static final String ADDRESS2 = "address2";
    public static final String ADDRESS3 = "address3";
    public static final String ADDRESS4 = "address4";
    public static final String CITY = "city";
    public static final String STATE_PROVINCE_CD = "stateProvinceCd";
    public static final String COUNTRY_CD = "countryCd";
    public static final String COUNTY_CD = "countyCd";
    public static final String POSTAL_CODE = "postalCode";
    public static final String ADDRESS_STATUS_CD = "addressStatusCd";
    public static final String ADDRESS_TYPE_CD = "addressTypeCd";
    public static final String PRIMARY_IND = "primaryInd";
    public static final String ADD_DATE = "addDate";
    public static final String ADD_BY = "addBy";
    public static final String MOD_DATE = "modDate";
    public static final String MOD_BY = "modBy";

    private Long addressId;
    private Long busEntityId;
    private Long userId;
    private String name1;
    private String name2;
    private String address1;
    private String address2;
    private String address3;
    private String address4;
    private String city;
    private String stateProvinceCd;
    private String countryCd;
    private String countyCd;
    private String postalCode;
    private String addressStatusCd;
    private String addressTypeCd;
    private Boolean primaryInd;
    private Date addDate;
    private String addBy;
    private Date modDate;
    private String modBy;

    public AddressData() {
    }
	
    public AddressData(String addressStatusCd, String addressTypeCd, Date addDate, Date modDate) {
        this.setAddressStatusCd(addressStatusCd);
        this.setAddressTypeCd(addressTypeCd);
        this.setAddDate(addDate);
        this.setModDate(modDate);
    }

    public AddressData(Long busEntityId, Long userId, String name1, String name2, String address1, String address2, String address3, String address4, String city, String stateProvinceCd, String countryCd, String countyCd, String postalCode, String addressStatusCd, String addressTypeCd, Boolean primaryInd, Date addDate, String addBy, Date modDate, String modBy) {
        this.setBusEntityId(busEntityId);
        this.setUserId(userId);
        this.setName1(name1);
        this.setName2(name2);
        this.setAddress1(address1);
        this.setAddress2(address2);
        this.setAddress3(address3);
        this.setAddress4(address4);
        this.setCity(city);
        this.setStateProvinceCd(stateProvinceCd);
        this.setCountryCd(countryCd);
        this.setCountyCd(countyCd);
        this.setPostalCode(postalCode);
        this.setAddressStatusCd(addressStatusCd);
        this.setAddressTypeCd(addressTypeCd);
        this.setPrimaryInd(primaryInd);
        this.setAddDate(addDate);
        this.setAddBy(addBy);
        this.setModDate(modDate);
        this.setModBy(modBy);
    }

    @SequenceGenerator(name="generator", sequenceName="CLW_ADDRESS_SEQ")
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.SEQUENCE, generator="generator")     
    @Column(name="ADDRESS_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
        setDirty(true);
    }

    
    @Column(name="BUS_ENTITY_ID", columnDefinition="number", precision=38, scale=0)
    public Long getBusEntityId() {
        return this.busEntityId;
    }

    public void setBusEntityId(Long busEntityId) {
        this.busEntityId = busEntityId;
        setDirty(true);
    }

    
    @Column(name="USER_ID", columnDefinition="number", precision=38, scale=0)
    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
        setDirty(true);
    }

    
    @Column(name="NAME1")
    public String getName1() {
        return this.name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
        setDirty(true);
    }

    
    @Column(name="NAME2")
    public String getName2() {
        return this.name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
        setDirty(true);
    }

    
    @Column(name="ADDRESS1")
    public String getAddress1() {
        return this.address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
        setDirty(true);
    }

    
    @Column(name="ADDRESS2")
    public String getAddress2() {
        return this.address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
        setDirty(true);
    }

    
    @Column(name="ADDRESS3")
    public String getAddress3() {
        return this.address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
        setDirty(true);
    }

    
    @Column(name="ADDRESS4")
    public String getAddress4() {
        return this.address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
        setDirty(true);
    }

    
    @Column(name="CITY")
    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
        setDirty(true);
    }

    
    @Column(name="STATE_PROVINCE_CD", length=30)
    public String getStateProvinceCd() {
        return this.stateProvinceCd;
    }

    public void setStateProvinceCd(String stateProvinceCd) {
        this.stateProvinceCd = stateProvinceCd;
        setDirty(true);
    }

    
    @Column(name="COUNTRY_CD")
    public String getCountryCd() {
        return this.countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
        setDirty(true);
    }

    
    @Column(name="COUNTY_CD", length=50)
    public String getCountyCd() {
        return this.countyCd;
    }

    public void setCountyCd(String countyCd) {
        this.countyCd = countyCd;
        setDirty(true);
    }

    
    @Column(name="POSTAL_CODE", length=15)
    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        setDirty(true);
    }

    
    @Column(name="ADDRESS_STATUS_CD", nullable=false, length=30)
    public String getAddressStatusCd() {
        return this.addressStatusCd;
    }

    public void setAddressStatusCd(String addressStatusCd) {
        this.addressStatusCd = addressStatusCd;
        setDirty(true);
    }

    
    @Column(name="ADDRESS_TYPE_CD", nullable=false, length=30)
    public String getAddressTypeCd() {
        return this.addressTypeCd;
    }

    public void setAddressTypeCd(String addressTypeCd) {
        this.addressTypeCd = addressTypeCd;
        setDirty(true);
    }

    @Type(type="com.espendwise.manta.support.hibernate.NumberBooleanType")
    @Column(name="PRIMARY_IND", columnDefinition="number", precision=1, scale=0)
    public Boolean getPrimaryInd() {
        return this.primaryInd;
    }

    public void setPrimaryInd(Boolean primaryInd) {
        this.primaryInd = primaryInd;
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




}


