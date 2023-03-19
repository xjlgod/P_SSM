package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceMaintainVO {
    /**
    * object fields.
    */
    @Autowired
    private String deviceMaintainEmp;

    /**
    * methods.
    */
    public  DeviceMaintainVO() {
    // TODO
    }

    public void setDeviceMaintainEmp(String arg0) {
    // TODO
    }

    public String getDeviceMaintainEmp() {
    // TODO
    }

}
