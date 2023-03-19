package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceCheckController {
    /**
    * object fields.
    */
    @Autowired
    private DeviceCheckService deviceCheckService;

    /**
    * methods.
    */
    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    private CustomResult update(Object arg1, DeviceCheck arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, DeviceCheck arg0) {
    // TODO
    }

    public EUDataGridResult searchDeviceCheckByDeviceCheckId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult getListType(DeviceCheck arg2, int arg1, int arg0) {
    // TODO
    }

    public  DeviceCheckController() {
    // TODO
    }

    private CustomResult insert(Object arg1, DeviceCheck arg0) {
    // TODO
    }

    public EUDataGridResult searchDeviceCheckByDeviceName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
