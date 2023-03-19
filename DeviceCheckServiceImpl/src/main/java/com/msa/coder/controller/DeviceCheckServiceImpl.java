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
@RequestMapping("DeviceCheckServiceImpl")
public class DeviceCheckServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default DeviceCheckMapper deviceCheckMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(DeviceCheck arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(DeviceCheck arg0) {
        // TODO
    }

    @GetMapping("searchDeviceCheckByDeviceCheckId")
    public EUDataGridResult searchDeviceCheckByDeviceCheckId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(DeviceCheck arg0) {
        // TODO
    }

    @GetMapping("get")
    public DeviceCheck get(String arg0) {
        // TODO
    }

    @GetMapping("DeviceCheckServiceImpl")
    public  DeviceCheckServiceImpl() {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(DeviceCheck arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchDeviceCheckByDeviceName")
    public EUDataGridResult searchDeviceCheckByDeviceName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setRows")
    public Object setRows() {
        // TODO
    }

    @GetMapping("setTotal")
    public Object setTotal() {
        // TODO
    }

    @GetMapping("getTotal")
    public Object getTotal() {
        // TODO
    }

    @GetMapping("getRows")
    public Object getRows() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getListType")
    public Object getListType() {
        // TODO
    }

    @GetMapping("getDeviceCheckId")
    public Object getDeviceCheckId() {
        // TODO
    }

    @GetMapping("getDeviceId")
    public Object getDeviceId() {
        // TODO
    }

    @GetMapping("getDeviceCheckEmpId")
    public Object getDeviceCheckEmpId() {
        // TODO
    }

    @GetMapping("getDeviceCheckDate")
    public Object getDeviceCheckDate() {
        // TODO
    }

    @GetMapping("getDeviceCheckResult")
    public Object getDeviceCheckResult() {
        // TODO
    }

    @GetMapping("getDeviceCheckFaultId")
    public Object getDeviceCheckFaultId() {
        // TODO
    }

    @GetMapping("getDeviceName")
    public Object getDeviceName() {
        // TODO
    }

    @GetMapping("getDeviceCheckEmp")
    public Object getDeviceCheckEmp() {
        // TODO
    }

    @GetMapping("add")
    public Object add() {
        // TODO
    }

    @GetMapping("setDeviceCheckDate")
    public Object setDeviceCheckDate() {
        // TODO
    }

    @GetMapping("setDeviceCheckEmpId")
    public Object setDeviceCheckEmpId() {
        // TODO
    }

    @GetMapping("setDeviceCheckFaultId")
    public Object setDeviceCheckFaultId() {
        // TODO
    }

    @GetMapping("setDeviceCheckId")
    public Object setDeviceCheckId() {
        // TODO
    }

    @GetMapping("setDeviceCheckResult")
    public Object setDeviceCheckResult() {
        // TODO
    }

    @GetMapping("setDeviceId")
    public Object setDeviceId() {
        // TODO
    }

    @GetMapping("edit")
    public Object edit() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setDeviceFaultId")
    public Object setDeviceFaultId() {
        // TODO
    }

    @GetMapping("setDeviceId")
    public Object setDeviceId() {
        // TODO
    }

    @GetMapping("setDeviceFaultCause")
    public Object setDeviceFaultCause() {
        // TODO
    }

    @GetMapping("setDeviceFaultDetail")
    public Object setDeviceFaultDetail() {
        // TODO
    }

    @GetMapping("setDeviceFaultDate")
    public Object setDeviceFaultDate() {
        // TODO
    }

    @GetMapping("setDeviceFaultMaintenance")
    public Object setDeviceFaultMaintenance() {
        // TODO
    }

    @GetMapping("getDeviceFaultId")
    public Object getDeviceFaultId() {
        // TODO
    }

    @GetMapping("getDeviceId")
    public Object getDeviceId() {
        // TODO
    }

    @GetMapping("getDeviceFaultCause")
    public Object getDeviceFaultCause() {
        // TODO
    }

    @GetMapping("getDeviceFaultDetail")
    public Object getDeviceFaultDetail() {
        // TODO
    }

    @GetMapping("getDeviceFaultDate")
    public Object getDeviceFaultDate() {
        // TODO
    }

    @GetMapping("getDeviceFaultMaintenance")
    public Object getDeviceFaultMaintenance() {
        // TODO
    }

    @GetMapping("getDeviceName")
    public Object getDeviceName() {
        // TODO
    }

    @GetMapping("setDeviceName")
    public Object setDeviceName() {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("add")
    public Object add() {
        // TODO
    }

    @GetMapping("edit")
    public Object edit() {
        // TODO
    }

    @GetMapping("updateAll")
    public Object updateAll() {
        // TODO
    }

    @GetMapping("searchFMeasureCheckByFMeasureCheckId")
    public Object searchFMeasureCheckByFMeasureCheckId() {
        // TODO
    }

}
