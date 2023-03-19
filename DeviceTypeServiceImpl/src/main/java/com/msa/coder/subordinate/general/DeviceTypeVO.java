package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceTypeVO {
    /**
    * object fields.
    */
    @Autowired
    private String deviceTypeIdd;

    /**
    * methods.
    */
    public String getDeviceTypeIdd() {
    // TODO
    }

    public  DeviceTypeVO() {
    // TODO
    }

    public void setDeviceTypeIdd(String arg0) {
    // TODO
    }

}
