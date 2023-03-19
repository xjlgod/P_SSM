package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceListController {
    /**
    * object fields.
    */
    @Autowired
    private DeviceService deviceService;

    /**
    * methods.
    */
    private CustomResult updateAll(Object arg1, Device arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, Device arg0) {
    // TODO
    }

    public  DeviceListController() {
    // TODO
    }

    public EUDataGridResult searchDeviceByDeviceTypeName(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, Device arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, Device arg0) {
    // TODO
    }

    public EUDataGridResult searchDeviceByDeviceId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public Device getItemById(String arg0) {
    // TODO
    }

    public EUDataGridResult getList(Device arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchDeviceByDeviceName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public String add() {
    // TODO
    }

}
