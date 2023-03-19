package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceCheck {
    /**
    * object fields.
    */
    @Autowired
    private String deviceCheckResult;

    @Autowired
    private String deviceCheckEmpId;

    @Autowired
    private String deviceId;

    @Autowired
    private String deviceCheckFaultId;

    @Autowired
    private String deviceCheckId;

    @Autowired
    private Object deviceCheckDate;

    /**
    * methods.
    */
    public  DeviceCheck() {
    // TODO
    }

    public void setDeviceCheckId(String arg0) {
    // TODO
    }

    public void setDeviceCheckEmpId(String arg0) {
    // TODO
    }

    public String getDeviceCheckId() {
    // TODO
    }

    public void setDeviceCheckResult(String arg0) {
    // TODO
    }

    public void setDeviceCheckDate(Object arg0) {
    // TODO
    }

    public String getDeviceId() {
    // TODO
    }

    public String getDeviceCheckFaultId() {
    // TODO
    }

    public void setDeviceCheckFaultId(String arg0) {
    // TODO
    }

    public String getDeviceCheckEmpId() {
    // TODO
    }

    public Object getDeviceCheckDate() {
    // TODO
    }

    public String getDeviceCheckResult() {
    // TODO
    }

    public void setDeviceId(String arg0) {
    // TODO
    }

}
