package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceMaintainController {
    /**
    * object fields.
    */
    @Autowired
    private DeviceMaintainService deviceMaintainService;

    /**
    * methods.
    */
    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, DeviceMaintain arg0) {
    // TODO
    }

    public EUDataGridResult searchDeviceMaintainByDeviceFaultId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public  DeviceMaintainController() {
    // TODO
    }

    public EUDataGridResult getListType(DeviceMaintain arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchDeviceMaintainByDeviceMaintainId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, DeviceMaintain arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, DeviceMaintain arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
