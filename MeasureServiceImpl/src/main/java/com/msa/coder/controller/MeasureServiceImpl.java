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
@RequestMapping("MeasureServiceImpl")
public class MeasureServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default FinalMeasuretCheckMapper finalMeasuretCheckMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("searchFMeasureCheckByOrderId")
    public EUDataGridResult searchFMeasureCheckByOrderId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(FinalMeasuretCheck arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("MeasureServiceImpl")
    public  MeasureServiceImpl() {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(FinalMeasuretCheck arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(FinalMeasuretCheck arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(FinalMeasuretCheck arg0) {
        // TODO
    }

    @GetMapping("get")
    public FinalMeasuretCheck get(String arg0) {
        // TODO
    }

    @GetMapping("searchFMeasureCheckByFMeasureCheckId")
    public EUDataGridResult searchFMeasureCheckByFMeasureCheckId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("ok")
    public Object ok() {
        // TODO
    }

    @GetMapping("getStatus")
    public Object getStatus() {
        // TODO
    }

    @GetMapping("getMsg")
    public Object getMsg() {
        // TODO
    }

    @GetMapping("getData")
    public Object getData() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setDeviceTypeId")
    public Object setDeviceTypeId() {
        // TODO
    }

    @GetMapping("setDeviceTypeName")
    public Object setDeviceTypeName() {
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

    @GetMapping("build")
    public Object build() {
        // TODO
    }

    @GetMapping("setDeviceTypeModel")
    public Object setDeviceTypeModel() {
        // TODO
    }

    @GetMapping("setDeviceTypeProducer")
    public Object setDeviceTypeProducer() {
        // TODO
    }

    @GetMapping("setDeviceTypeQuantity")
    public Object setDeviceTypeQuantity() {
        // TODO
    }

    @GetMapping("setDeviceTypeSpec")
    public Object setDeviceTypeSpec() {
        // TODO
    }

    @GetMapping("setDeviceTypeSupplier")
    public Object setDeviceTypeSupplier() {
        // TODO
    }

    @GetMapping("setDeviceTypeWarranty")
    public Object setDeviceTypeWarranty() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getfMeasureCheckId")
    public Object getfMeasureCheckId() {
        // TODO
    }

    @GetMapping("getOrderId")
    public Object getOrderId() {
        // TODO
    }

    @GetMapping("getCheckItem")
    public Object getCheckItem() {
        // TODO
    }

    @GetMapping("getCdate")
    public Object getCdate() {
        // TODO
    }

    @GetMapping("getMeasureData")
    public Object getMeasureData() {
        // TODO
    }

    @GetMapping("getEmpId")
    public Object getEmpId() {
        // TODO
    }

    @GetMapping("getResult")
    public Object getResult() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("getEmpName")
    public Object getEmpName() {
        // TODO
    }

}
