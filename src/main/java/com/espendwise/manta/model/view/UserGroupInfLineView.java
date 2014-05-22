package com.espendwise.manta.model.view;
// Generated by Hibernate Tools


import com.espendwise.manta.model.ValueObject;
import java.util.List;
/**
 * UserGroupInfLineView generated by hbm2java
*/
public class UserGroupInfLineView extends ValueObject implements java.io.Serializable {

    private static final long serialVersionUID = -1;

    public static final String GROUP_ID = "groupId";
    public static final String GROUP_DESCRIPTION = "groupDescription";
    public static final String GROUP_PERMISSION = "groupPermission";
    public static final String REPORT_NAME = "reportName";

    private Long groupId;
    private String groupDescription;
    private String groupPermission;
    private String reportName;

    public UserGroupInfLineView() {
    }
	
    public UserGroupInfLineView(Long groupId) {
        this.setGroupId(groupId);
    }

    public UserGroupInfLineView(Long groupId, String groupDescription, String groupPermission, String reportName) {
        this.setGroupId(groupId);
        this.setGroupDescription(groupDescription);
        this.setGroupPermission(groupPermission);
        this.setReportName(reportName);
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
        setDirty(true);
    }

    public String getGroupDescription() {
        return this.groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
        setDirty(true);
    }

    public String getGroupPermission() {
        return this.groupPermission;
    }

    public void setGroupPermission(String groupPermission) {
        this.groupPermission = groupPermission;
        setDirty(true);
    }

    public String getReportName() {
        return this.reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
        setDirty(true);
    }




}


