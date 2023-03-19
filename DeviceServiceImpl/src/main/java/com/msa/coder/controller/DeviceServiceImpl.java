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
@RequestMapping("DeviceServiceImpl")
public class DeviceServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default DeviceMapper deviceMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(Device arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchDeviceByDeviceId")
    public EUDataGridResult searchDeviceByDeviceId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchDeviceByDeviceName")
    public EUDataGridResult searchDeviceByDeviceName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(Device arg0) {
        // TODO
    }

    @GetMapping("searchDeviceByDeviceTypeName")
    public EUDataGridResult searchDeviceByDeviceTypeName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Device arg0) {
        // TODO
    }

    @GetMapping("get")
    public Device get(String arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("DeviceServiceImpl")
    public  DeviceServiceImpl() {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Device arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(Device arg0) {
        // TODO
    }

    @GetMapping("getTechnologyRequirementId")
    public Object getTechnologyRequirementId() {
        // TODO
    }

    @GetMapping("getTechnologyId")
    public Object getTechnologyId() {
        // TODO
    }

    @GetMapping("getRequirement")
    public Object getRequirement() {
        // TODO
    }

    @GetMapping("getAddTime")
    public Object getAddTime() {
        // TODO
    }

    @GetMapping("getReviseTime")
    public Object getReviseTime() {
        // TODO
    }

}
