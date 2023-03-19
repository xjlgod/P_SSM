package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("DeviceFaultServiceImpl")
public class DeviceFaultServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default DeviceFaultMapper deviceFaultMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("DeviceFaultServiceImpl")
    public  DeviceFaultServiceImpl() {
        // TODO
    }

    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("get")
    public DeviceFault get(String arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(DeviceFault arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("searchDeviceFaultByDeviceFaultId")
    public EUDataGridResult searchDeviceFaultByDeviceFaultId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchDeviceFaultByDeviceName")
    public EUDataGridResult searchDeviceFaultByDeviceName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(DeviceFault arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(DeviceFault arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(DeviceFault arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(DeviceFault arg0) {
        // TODO
    }

    @GetMapping("getData")
    public Object getData() {
        // TODO
    }

    @GetMapping("searchDeviceByDeviceId")
    public Object searchDeviceByDeviceId() {
        // TODO
    }

}
