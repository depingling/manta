package com.espendwise.manta.model.view;
// Generated by Hibernate Tools


import com.espendwise.manta.model.ValueObject;
import java.util.List;
/**
 * ApplicationFunctionView generated by hbm2java
*/
public class ApplicationFunctionView extends ValueObject implements java.io.Serializable {

    private static final long serialVersionUID = -1;

    public static final String APPLICATION_FUNCTION = "applicationFunction";
    public static final String GROUPS = "groups";

    private String applicationFunction;
    private List<GroupView> groups;

    public ApplicationFunctionView() {
    }
	
    public ApplicationFunctionView(String applicationFunction) {
        this.setApplicationFunction(applicationFunction);
    }

    public ApplicationFunctionView(String applicationFunction, List<GroupView> groups) {
        this.setApplicationFunction(applicationFunction);
        this.setGroups(groups);
    }

    public String getApplicationFunction() {
        return this.applicationFunction;
    }

    public void setApplicationFunction(String applicationFunction) {
        this.applicationFunction = applicationFunction;
        setDirty(true);
    }

    public List<GroupView> getGroups() {
        return this.groups;
    }

    public void setGroups(List<GroupView> groups) {
        this.groups = groups;
        setDirty(true);
    }




}


