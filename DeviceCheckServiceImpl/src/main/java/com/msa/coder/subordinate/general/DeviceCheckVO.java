package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceCheckVO {
    /**
    * object fields.
    */
    @Autowired
    private String deviceCheckEmp;

    @Autowired
    private String deviceName;

    /**
    * methods.
    */
    public String getDeviceName() {
    // TODO
    }

    public String getDeviceCheckEmp() {
    // TODO
    }

    public void setDeviceCheckEmp(String arg0) {
    // TODO
    }

    public void setDeviceName(String arg0) {
    // TODO
    }

    public  DeviceCheckVO() {
    // TODO
    }

}
