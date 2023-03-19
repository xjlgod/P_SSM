package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DeviceTypeController {
    /**
    * object fields.
    */
    @Autowired
    private DeviceTypeService deviceTypeService;

    /**
    * methods.
    */
    public EUDataGridResult searchDeviceTypeByDeviceTypeId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public DeviceType getItemById(String arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, DeviceType arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public EUDataGridResult searchDeviceTypeByDeviceTypeName(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, DeviceType arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public  DeviceTypeController() {
    // TODO
    }

    public String add() {
    // TODO
    }

    public EUDataGridResult getListType(DeviceType arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, DeviceType arg0) {
    // TODO
    }

}
