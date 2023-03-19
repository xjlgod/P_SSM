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
@RequestMapping("DeviceTypeServiceImpl")
public class DeviceTypeServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default DeviceTypeMapper deviceTypeMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("searchDeviceTypeByDeviceTypeId")
    public EUDataGridResult searchDeviceTypeByDeviceTypeId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("DeviceTypeServiceImpl")
    public  DeviceTypeServiceImpl() {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(DeviceType arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchDeviceTypeByDeviceTypeName")
    public EUDataGridResult searchDeviceTypeByDeviceTypeName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(DeviceType arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(DeviceType arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("get")
    public DeviceType get(String arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(DeviceType arg0) {
        // TODO
    }

    @GetMapping("getData")
    public Object getData() {
        // TODO
    }

    @GetMapping("deviceList")
    public Object deviceList() {
        // TODO
    }

    @GetMapping("deviceType")
    public Object deviceType() {
        // TODO
    }

    @GetMapping("getListType")
    public Object getListType() {
        // TODO
    }

    @GetMapping("getDeviceTypeId")
    public Object getDeviceTypeId() {
        // TODO
    }

    @GetMapping("getDeviceTypeName")
    public Object getDeviceTypeName() {
        // TODO
    }

    @GetMapping("getDeviceTypeModel")
    public Object getDeviceTypeModel() {
        // TODO
    }

    @GetMapping("getDeviceTypeSpec")
    public Object getDeviceTypeSpec() {
        // TODO
    }

    @GetMapping("getDeviceTypeSupplier")
    public Object getDeviceTypeSupplier() {
        // TODO
    }

    @GetMapping("getDeviceTypeProducer")
    public Object getDeviceTypeProducer() {
        // TODO
    }

    @GetMapping("getDeviceTypeQuantity")
    public Object getDeviceTypeQuantity() {
        // TODO
    }

    @GetMapping("getDeviceTypeWarranty")
    public Object getDeviceTypeWarranty() {
        // TODO
    }

    @GetMapping("getDeviceTypeIdd")
    public Object getDeviceTypeIdd() {
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

    @GetMapping("deviceCheck")
    public Object deviceCheck() {
        // TODO
    }

    @GetMapping("deviceFault")
    public Object deviceFault() {
        // TODO
    }

    @GetMapping("deviceMaintain")
    public Object deviceMaintain() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("getConsumeDate")
    public Object getConsumeDate() {
        // TODO
    }

    @GetMapping("getConsumeId")
    public Object getConsumeId() {
        // TODO
    }

    @GetMapping("getConsumeAmount")
    public Object getConsumeAmount() {
        // TODO
    }

    @GetMapping("getReceiver")
    public Object getReceiver() {
        // TODO
    }

    @GetMapping("getWork")
    public Object getWork() {
        // TODO
    }

    @GetMapping("getMaterial")
    public Object getMaterial() {
        // TODO
    }

    @GetMapping("getSender")
    public Object getSender() {
        // TODO
    }

    @GetMapping("setConsumeId")
    public Object setConsumeId() {
        // TODO
    }

    @GetMapping("setConsumeAmount")
    public Object setConsumeAmount() {
        // TODO
    }

    @GetMapping("setConsumeDate")
    public Object setConsumeDate() {
        // TODO
    }

    @GetMapping("setSender")
    public Object setSender() {
        // TODO
    }

    @GetMapping("setReceiver")
    public Object setReceiver() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("setWork")
    public Object setWork() {
        // TODO
    }

    @GetMapping("setMaterial")
    public Object setMaterial() {
        // TODO
    }

}
