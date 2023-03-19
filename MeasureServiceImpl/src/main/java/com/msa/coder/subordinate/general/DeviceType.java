package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceType {
    /**
    * object fields.
    */
    @Autowired
    private String deviceTypeModel;

    @Autowired
    private String deviceTypeSupplier;

    @Autowired
    private String deviceTypeId;

    @Autowired
    private String deviceTypeName;

    @Autowired
    private Object deviceTypeWarranty;

    @Autowired
    private String deviceTypeProducer;

    @Autowired
    private String deviceTypeSpec;

    /**
    * not object fields.
    */
    private int deviceTypeQuantity;

    /**
    * methods.
    */
    public void setDeviceTypeWarranty(Object arg0) {
    // TODO
    }

    public  DeviceType() {
    // TODO
    }

    public String getDeviceTypeSpec() {
    // TODO
    }

    public Object getDeviceTypeWarranty() {
    // TODO
    }

    public void setDeviceTypeName(String arg0) {
    // TODO
    }

    public void setDeviceTypeModel(String arg0) {
    // TODO
    }

    public String getDeviceTypeProducer() {
    // TODO
    }

    public String getDeviceTypeModel() {
    // TODO
    }

    public String getDeviceTypeName() {
    // TODO
    }

    public void setDeviceTypeSpec(String arg0) {
    // TODO
    }

    public void setDeviceTypeSupplier(String arg0) {
    // TODO
    }

    public int getDeviceTypeQuantity() {
    // TODO
    }

    public void setDeviceTypeQuantity(int arg0) {
    // TODO
    }

    public String getDeviceTypeId() {
    // TODO
    }

    public String getDeviceTypeSupplier() {
    // TODO
    }

    public void setDeviceTypeProducer(String arg0) {
    // TODO
    }

    public void setDeviceTypeId(String arg0) {
    // TODO
    }

}
