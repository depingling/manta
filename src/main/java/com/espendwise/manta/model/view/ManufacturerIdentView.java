package com.espendwise.manta.model.view;
// Generated by Hibernate Tools


import com.espendwise.manta.model.ValueObject;
import com.espendwise.manta.model.data.BusEntityData;
/**
 * ManufacturerIdentView generated by hbm2java
*/
public class ManufacturerIdentView extends ValueObject implements java.io.Serializable {

    private static final long serialVersionUID = -1;

    public static final String BUS_ENTITY_DATA = "busEntityData";
    public static final String PROPERTIES = "properties";

    private BusEntityData busEntityData;
    private ManufacturerPropertiesView properties;

    public ManufacturerIdentView() {
    }
	
    public ManufacturerIdentView(BusEntityData busEntityData) {
        this.setBusEntityData(busEntityData);
    }

    public ManufacturerIdentView(BusEntityData busEntityData, ManufacturerPropertiesView properties) {
        this.setBusEntityData(busEntityData);
        this.setProperties(properties);
    }

    public BusEntityData getBusEntityData() {
        return this.busEntityData;
    }

    public void setBusEntityData(BusEntityData busEntityData) {
        this.busEntityData = busEntityData;
        setDirty(true);
    }

    public ManufacturerPropertiesView getProperties() {
        return this.properties;
    }

    public void setProperties(ManufacturerPropertiesView properties) {
        this.properties = properties;
        setDirty(true);
    }




}


