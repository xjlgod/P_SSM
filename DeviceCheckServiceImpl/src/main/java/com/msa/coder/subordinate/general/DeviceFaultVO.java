package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceFaultVO {
    /**
    * object fields.
    */
    @Autowired
    private String deviceName;

    /**
    * methods.
    */
    public String getDeviceName() {
    // TODO
    }

    public void setDeviceName(String arg0) {
    // TODO
    }

    public  DeviceFaultVO() {
    // TODO
    }

}
