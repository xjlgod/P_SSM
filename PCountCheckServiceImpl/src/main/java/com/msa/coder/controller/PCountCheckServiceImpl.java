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
@RequestMapping("PCountCheckServiceImpl")
public class PCountCheckServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default ProcessCountCheckMapper processCountCheckMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("searchPCountCheckByPCountCheckId")
    public EUDataGridResult searchPCountCheckByPCountCheckId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(ProcessCountCheck arg0) {
        // TODO
    }

    @GetMapping("PCountCheckServiceImpl")
    public  PCountCheckServiceImpl() {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(ProcessCountCheck arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(ProcessCountCheck arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(ProcessCountCheck arg2, int arg1, int arg0) {
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

    @GetMapping("setEmpName")
    public Object setEmpName() {
        // TODO
    }

    @GetMapping("setfCountCheckId")
    public Object setfCountCheckId() {
        // TODO
    }

    @GetMapping("setOrderId")
    public Object setOrderId() {
        // TODO
    }

    @GetMapping("setCheckItem")
    public Object setCheckItem() {
        // TODO
    }

    @GetMapping("setSample")
    public Object setSample() {
        // TODO
    }

    @GetMapping("setCheckNumber")
    public Object setCheckNumber() {
        // TODO
    }

    @GetMapping("setUnqualify")
    public Object setUnqualify() {
        // TODO
    }

    @GetMapping("setQualify")
    public Object setQualify() {
        // TODO
    }

    @GetMapping("setCdate")
    public Object setCdate() {
        // TODO
    }

    @GetMapping("setMeasureData")
    public Object setMeasureData() {
        // TODO
    }

    @GetMapping("setEmpId")
    public Object setEmpId() {
        // TODO
    }

    @GetMapping("setResult")
    public Object setResult() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("getfCountCheckId")
    public Object getfCountCheckId() {
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

    @GetMapping("getSample")
    public Object getSample() {
        // TODO
    }

    @GetMapping("getCheckNumber")
    public Object getCheckNumber() {
        // TODO
    }

    @GetMapping("getUnqualify")
    public Object getUnqualify() {
        // TODO
    }

    @GetMapping("getQualify")
    public Object getQualify() {
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

    @GetMapping("getpCountCheckId")
    public Object getpCountCheckId() {
        // TODO
    }

    @GetMapping("getProcessId")
    public Object getProcessId() {
        // TODO
    }

    @GetMapping("getCheckItem")
    public Object getCheckItem() {
        // TODO
    }

    @GetMapping("getSample")
    public Object getSample() {
        // TODO
    }

    @GetMapping("getCheckNumber")
    public Object getCheckNumber() {
        // TODO
    }

    @GetMapping("getUnqualify")
    public Object getUnqualify() {
        // TODO
    }

    @GetMapping("getQualify")
    public Object getQualify() {
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
