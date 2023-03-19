package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceVO {
    /**
    * object fields.
    */
    @Autowired
    private String deviceIdd;

    @Autowired
    private String deviceKeeper;

    @Autowired
    private String deviceTypeName;

    /**
    * methods.
    */
    public String getDeviceTypeName() {
    // TODO
    }

    public  DeviceVO() {
    // TODO
    }

    public String getDeviceIdd() {
    // TODO
    }

    public void setDeviceIdd(String arg0) {
    // TODO
    }

    public String getDeviceKeeper() {
    // TODO
    }

    public void setDeviceKeeper(String arg0) {
    // TODO
    }

    public void setDeviceTypeName(String arg0) {
    // TODO
    }

}
