package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceMaintain {
    /**
    * object fields.
    */
    @Autowired
    private Object deviceMaintainDate;

    @Autowired
    private Object deviceMaintainCost;

    @Autowired
    private String deviceMaintainEmpId;

    @Autowired
    private String note;

    @Autowired
    private String deviceMaintainId;

    @Autowired
    private String deviceFaultId;

    @Autowired
    private String deviceMaintainResult;

    /**
    * methods.
    */
    public String getDeviceMaintainId() {
    // TODO
    }

    public String getDeviceMaintainEmpId() {
    // TODO
    }

    public String getDeviceMaintainResult() {
    // TODO
    }

    public void setDeviceMaintainResult(String arg0) {
    // TODO
    }

    public void setDeviceMaintainEmpId(String arg0) {
    // TODO
    }

    public Object getDeviceMaintainDate() {
    // TODO
    }

    public void setDeviceFaultId(String arg0) {
    // TODO
    }

    public void setNote(String arg0) {
    // TODO
    }

    public String getDeviceFaultId() {
    // TODO
    }

    public String getNote() {
    // TODO
    }

    public void setDeviceMaintainCost(Object arg0) {
    // TODO
    }

    public void setDeviceMaintainId(String arg0) {
    // TODO
    }

    public  DeviceMaintain() {
    // TODO
    }

    public void setDeviceMaintainDate(Object arg0) {
    // TODO
    }

    public Object getDeviceMaintainCost() {
    // TODO
    }

}
