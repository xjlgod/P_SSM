package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceFault {
    /**
    * object fields.
    */
    @Autowired
    private String deviceFaultCause;

    @Autowired
    private String deviceFaultMaintenance;

    @Autowired
    private Object deviceFaultDate;

    @Autowired
    private String deviceFaultDetail;

    @Autowired
    private String deviceFaultId;

    @Autowired
    private String deviceId;

    /**
    * methods.
    */
    public Object getDeviceFaultDate() {
    // TODO
    }

    public void setDeviceFaultDetail(String arg0) {
    // TODO
    }

    public void setDeviceFaultMaintenance(String arg0) {
    // TODO
    }

    public String getDeviceFaultCause() {
    // TODO
    }

    public String getDeviceId() {
    // TODO
    }

    public void setDeviceFaultId(String arg0) {
    // TODO
    }

    public void setDeviceFaultDate(Object arg0) {
    // TODO
    }

    public String getDeviceFaultDetail() {
    // TODO
    }

    public  DeviceFault() {
    // TODO
    }

    public String getDeviceFaultId() {
    // TODO
    }

    public void setDeviceFaultCause(String arg0) {
    // TODO
    }

    public void setDeviceId(String arg0) {
    // TODO
    }

    public String getDeviceFaultMaintenance() {
    // TODO
    }

}
