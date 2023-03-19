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
@RequestMapping("ManufactureServiceImpl")
public class ManufactureServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default ManufactureMapper manufactureMapper;

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

    @GetMapping("getList")
    public EUDataGridResult getList(int arg1, int arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Manufacture arg0) {
        // TODO
    }

    @GetMapping("searchManufactureByManufactureTechnologyName")
    public EUDataGridResult searchManufactureByManufactureTechnologyName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("ManufactureServiceImpl")
    public  ManufactureServiceImpl() {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(Manufacture arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Manufacture arg0) {
        // TODO
    }

    @GetMapping("searchManufactureByManufactureOrderId")
    public EUDataGridResult searchManufactureByManufactureOrderId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchManufactureByManufactureSn")
    public EUDataGridResult searchManufactureByManufactureSn(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("get")
    public ManufactureVO get(String arg0) {
        // TODO
    }

    @GetMapping("getManufactureSn")
    public Object getManufactureSn() {
        // TODO
    }

    @GetMapping("getLaunchQuantity")
    public Object getLaunchQuantity() {
        // TODO
    }

    @GetMapping("getBeginDate")
    public Object getBeginDate() {
        // TODO
    }

    @GetMapping("getEndDate")
    public Object getEndDate() {
        // TODO
    }

    @GetMapping("getcOrder")
    public Object getcOrder() {
        // TODO
    }

    @GetMapping("getTechnology")
    public Object getTechnology() {
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

    @GetMapping("getData")
    public Object getData() {
        // TODO
    }

}
