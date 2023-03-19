package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceFaultController {
    /**
    * object fields.
    */
    @Autowired
    private DeviceFaultService deviceFaultService;

    /**
    * methods.
    */
    public EUDataGridResult searchDeviceFaultByDeviceFaultId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, DeviceFault arg0) {
    // TODO
    }

    public EUDataGridResult getListType(DeviceFault arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, DeviceFault arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, DeviceFault arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, DeviceFault arg0) {
    // TODO
    }

    public EUDataGridResult searchDeviceFaultByDeviceName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public  DeviceFaultController() {
    // TODO
    }

    public DeviceFault getItemById(String arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
