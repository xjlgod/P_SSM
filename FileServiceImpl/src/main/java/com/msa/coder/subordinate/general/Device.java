package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Device {
    /**
    * object fields.
    */
    @Autowired
    private String note;

    @Autowired
    private String deviceTypeId;

    @Autowired
    private Object deviceServiceLife;

    @Autowired
    private Object deviceManufactureDate;

    @Autowired
    private String deviceKeeperId;

    @Autowired
    private Object devicePurchasePrice;

    @Autowired
    private String deviceId;

    @Autowired
    private String deviceName;

    @Autowired
    private String deviceStatusId;

    @Autowired
    private Object devicePurchaseDate;

    @Autowired
    private String deviceStatus;

    /**
    * methods.
    */
    public  Device() {
    // TODO
    }

    public void setDeviceManufactureDate(Object arg0) {
    // TODO
    }

    public void setDevicePurchaseDate(Object arg0) {
    // TODO
    }

    public String getDeviceStatus() {
    // TODO
    }

    public Object getDeviceServiceLife() {
    // TODO
    }

    public void setDevicePurchasePrice(Object arg0) {
    // TODO
    }

    public Object getDevicePurchaseDate() {
    // TODO
    }

    public String getDeviceId() {
    // TODO
    }

    public String getDeviceName() {
    // TODO
    }

    public String getDeviceStatusId() {
    // TODO
    }

    public void setDeviceName(String arg0) {
    // TODO
    }

    public void setNote(String arg0) {
    // TODO
    }

    public Object getDevicePurchasePrice() {
    // TODO
    }

    public String getNote() {
    // TODO
    }

    public String getDeviceTypeId() {
    // TODO
    }

    public void setDeviceStatusId(String arg0) {
    // TODO
    }

    public Object getDeviceManufactureDate() {
    // TODO
    }

    public void setDeviceServiceLife(Object arg0) {
    // TODO
    }

    public void setDeviceStatus(String arg0) {
    // TODO
    }

    public void setDeviceId(String arg0) {
    // TODO
    }

    public void setDeviceKeeperId(String arg0) {
    // TODO
    }

    public String getDeviceKeeperId() {
    // TODO
    }

    public void setDeviceTypeId(String arg0) {
    // TODO
    }

}
