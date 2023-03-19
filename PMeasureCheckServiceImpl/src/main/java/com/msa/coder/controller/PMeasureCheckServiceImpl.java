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
@RequestMapping("PMeasureCheckServiceImpl")
public class PMeasureCheckServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default ProcessMeasureCheckMapper processMeasureCheckMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("PMeasureCheckServiceImpl")
    public  PMeasureCheckServiceImpl() {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(ProcessMeasureCheck arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(ProcessMeasureCheck arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(ProcessMeasureCheck arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(ProcessMeasureCheck arg0) {
        // TODO
    }

    @GetMapping("searchPMeasureCheckByPMeasureCheckId")
    public EUDataGridResult searchPMeasureCheckByPMeasureCheckId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getCdate")
    public Object getCdate() {
        // TODO
    }

    @GetMapping("setCdate")
    public Object setCdate() {
        // TODO
    }

    @GetMapping("getCheckItem")
    public Object getCheckItem() {
        // TODO
    }

    @GetMapping("setCheckItem")
    public Object setCheckItem() {
        // TODO
    }

    @GetMapping("getEmpId")
    public Object getEmpId() {
        // TODO
    }

    @GetMapping("setEmpId")
    public Object setEmpId() {
        // TODO
    }

    @GetMapping("getMeasureData")
    public Object getMeasureData() {
        // TODO
    }

    @GetMapping("setMeasureData")
    public Object setMeasureData() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("getpMeasureCheckId")
    public Object getpMeasureCheckId() {
        // TODO
    }

    @GetMapping("setpMeasureCheckId")
    public Object setpMeasureCheckId() {
        // TODO
    }

    @GetMapping("getProcessId")
    public Object getProcessId() {
        // TODO
    }

    @GetMapping("setProcessId")
    public Object setProcessId() {
        // TODO
    }

    @GetMapping("getResult")
    public Object getResult() {
        // TODO
    }

    @GetMapping("setResult")
    public Object setResult() {
        // TODO
    }

}
