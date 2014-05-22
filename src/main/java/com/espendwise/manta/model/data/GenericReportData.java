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
 * GenericReportData generated by hbm2java
*/
@Entity
@Table(name="CLW_GENERIC_REPORT")
public class GenericReportData extends ValueObject implements TableObject,java.io.Serializable {

    private static final long serialVersionUID = -1;

    public static final String GENERIC_REPORT_ID = "genericReportId";
    public static final String CATEGORY = "category";
    public static final String NAME = "name";
    public static final String PARAMETER_TOKEN = "parameterToken";
    public static final String REPORT_SCHEMA_CD = "reportSchemaCd";
    public static final String INTERFACE_TABLE = "interfaceTable";
    public static final String SQL_TEXT = "sqlText";
    public static final String SCRIPT_TEXT = "scriptText";
    public static final String ADD_DATE = "addDate";
    public static final String ADD_BY = "addBy";
    public static final String MOD_DATE = "modDate";
    public static final String MOD_BY = "modBy";
    public static final String GENERIC_REPORT_TYPE = "genericReportType";
    public static final String CLASSNAME = "classname";
    public static final String SUPPLEMENTARY_CONTROLS = "supplementaryControls";
    public static final String RUNTIME_ENABLED = "runtimeEnabled";
    public static final String LONG_DESC = "longDesc";
    public static final String USER_TYPES = "userTypes";

    private Long genericReportId;
    private String category;
    private String name;
    private String parameterToken;
    private String reportSchemaCd;
    private String interfaceTable;
    private String sqlText;
    private String scriptText;
    private Date addDate;
    private String addBy;
    private Date modDate;
    private String modBy;
    private String genericReportType;
    private String classname;
    private String supplementaryControls;
    private String runtimeEnabled;
    private String longDesc;
    private String userTypes;

    public GenericReportData() {
    }

    public GenericReportData(String category, String name, String parameterToken, String reportSchemaCd, String interfaceTable, String sqlText, String scriptText, Date addDate, String addBy, Date modDate, String modBy, String genericReportType, String classname, String supplementaryControls, String runtimeEnabled, String longDesc, String userTypes) {
        this.setCategory(category);
        this.setName(name);
        this.setParameterToken(parameterToken);
        this.setReportSchemaCd(reportSchemaCd);
        this.setInterfaceTable(interfaceTable);
        this.setSqlText(sqlText);
        this.setScriptText(scriptText);
        this.setAddDate(addDate);
        this.setAddBy(addBy);
        this.setModDate(modDate);
        this.setModBy(modBy);
        this.setGenericReportType(genericReportType);
        this.setClassname(classname);
        this.setSupplementaryControls(supplementaryControls);
        this.setRuntimeEnabled(runtimeEnabled);
        this.setLongDesc(longDesc);
        this.setUserTypes(userTypes);
    }

    @SequenceGenerator(name="generator", sequenceName="CLW_GENERIC_REPORT_SEQ")
    @Id 
    @GeneratedValue(strategy=javax.persistence.GenerationType.SEQUENCE, generator="generator")     
    @Column(name="GENERIC_REPORT_ID", nullable=false, columnDefinition="number", precision=38, scale=0)
    public Long getGenericReportId() {
        return this.genericReportId;
    }

    public void setGenericReportId(Long genericReportId) {
        this.genericReportId = genericReportId;
        setDirty(true);
    }

    
    @Column(name="CATEGORY", length=50)
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
        setDirty(true);
    }

    
    @Column(name="NAME", length=2000)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        setDirty(true);
    }

    
    @Column(name="PARAMETER_TOKEN", length=10)
    public String getParameterToken() {
        return this.parameterToken;
    }

    public void setParameterToken(String parameterToken) {
        this.parameterToken = parameterToken;
        setDirty(true);
    }

    
    @Column(name="REPORT_SCHEMA_CD", length=30)
    public String getReportSchemaCd() {
        return this.reportSchemaCd;
    }

    public void setReportSchemaCd(String reportSchemaCd) {
        this.reportSchemaCd = reportSchemaCd;
        setDirty(true);
    }

    
    @Column(name="INTERFACE_TABLE", length=50)
    public String getInterfaceTable() {
        return this.interfaceTable;
    }

    public void setInterfaceTable(String interfaceTable) {
        this.interfaceTable = interfaceTable;
        setDirty(true);
    }

    
    @Column(name="SQL_TEXT", columnDefinition="clob")
    public String getSqlText() {
        return this.sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
        setDirty(true);
    }

    
    @Column(name="SCRIPT_TEXT", columnDefinition="clob")
    public String getScriptText() {
        return this.scriptText;
    }

    public void setScriptText(String scriptText) {
        this.scriptText = scriptText;
        setDirty(true);
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="ADD_DATE", length=7)
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
    @Column(name="MOD_DATE", length=7)
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

    
    @Column(name="GENERIC_REPORT_TYPE")
    public String getGenericReportType() {
        return this.genericReportType;
    }

    public void setGenericReportType(String genericReportType) {
        this.genericReportType = genericReportType;
        setDirty(true);
    }

    
    @Column(name="CLASSNAME")
    public String getClassname() {
        return this.classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
        setDirty(true);
    }

    
    @Column(name="SUPPLEMENTARY_CONTROLS", length=1000)
    public String getSupplementaryControls() {
        return this.supplementaryControls;
    }

    public void setSupplementaryControls(String supplementaryControls) {
        this.supplementaryControls = supplementaryControls;
        setDirty(true);
    }

    
    @Column(name="RUNTIME_ENABLED")
    public String getRuntimeEnabled() {
        return this.runtimeEnabled;
    }

    public void setRuntimeEnabled(String runtimeEnabled) {
        this.runtimeEnabled = runtimeEnabled;
        setDirty(true);
    }

    
    @Column(name="LONG_DESC", length=2000)
    public String getLongDesc() {
        return this.longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
        setDirty(true);
    }

    
    @Column(name="USER_TYPES", length=1000)
    public String getUserTypes() {
        return this.userTypes;
    }

    public void setUserTypes(String userTypes) {
        this.userTypes = userTypes;
        setDirty(true);
    }




}

