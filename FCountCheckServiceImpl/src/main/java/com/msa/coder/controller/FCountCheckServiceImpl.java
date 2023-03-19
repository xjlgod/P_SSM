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
@RequestMapping("FCountCheckServiceImpl")
public class FCountCheckServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default FinalCountCheckMapper finalCountCheckMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(FinalCountCheck arg0) {
        // TODO
    }

    @GetMapping("get")
    public FinalCountCheck get(String arg0) {
        // TODO
    }

    @GetMapping("searchFCountCheckByFCountCheckId")
    public EUDataGridResult searchFCountCheckByFCountCheckId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(FinalCountCheck arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(FinalCountCheck arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(FinalCountCheck arg0) {
        // TODO
    }

    @GetMapping("FCountCheckServiceImpl")
    public  FCountCheckServiceImpl() {
        // TODO
    }

    @GetMapping("searchFCountCheckByOrderId")
    public EUDataGridResult searchFCountCheckByOrderId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getEmpId")
    public Object getEmpId() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
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

    @GetMapping("getMeasureData")
    public Object getMeasureData() {
        // TODO
    }

    @GetMapping("getResult")
    public Object getResult() {
        // TODO
    }

    @GetMapping("getCdate")
    public Object getCdate() {
        // TODO
    }

    @GetMapping("getfMeasureCheckId")
    public Object getfMeasureCheckId() {
        // TODO
    }

    @GetMapping("setCdate")
    public Object setCdate() {
        // TODO
    }

    @GetMapping("setCheckItem")
    public Object setCheckItem() {
        // TODO
    }

    @GetMapping("setEmpId")
    public Object setEmpId() {
        // TODO
    }

    @GetMapping("setfMeasureCheckId")
    public Object setfMeasureCheckId() {
        // TODO
    }

    @GetMapping("setMeasureData")
    public Object setMeasureData() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("setOrderId")
    public Object setOrderId() {
        // TODO
    }

    @GetMapping("setResult")
    public Object setResult() {
        // TODO
    }

}
