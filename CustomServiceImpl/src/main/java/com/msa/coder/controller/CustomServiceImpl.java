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
@RequestMapping("CustomServiceImpl")
public class CustomServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default CustomMapper customMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("CustomServiceImpl")
    public  CustomServiceImpl() {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(Custom arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(Custom arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchCustomByCustomId")
    public EUDataGridResult searchCustomByCustomId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("changeStatus")
    public CustomResult changeStatus(Object arg0) {
        // TODO
    }

    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Custom arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(Custom arg0) {
        // TODO
    }

    @GetMapping("get")
    public Custom get(String arg0) {
        // TODO
    }

    @GetMapping("searchCustomByCustomName")
    public EUDataGridResult searchCustomByCustomName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Custom arg0) {
        // TODO
    }

    @GetMapping("newHashMap")
    public Object newHashMap() {
        // TODO
    }

    @GetMapping("newArrayList")
    public Object newArrayList() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getMessage")
    public Object getMessage() {
        // TODO
    }

    @GetMapping("convert")
    public Object convert() {
        // TODO
    }

    @GetMapping("getListType")
    public Object getListType() {
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

    @GetMapping("searchDeviceMaintainByDeviceMaintainId")
    public Object searchDeviceMaintainByDeviceMaintainId() {
        // TODO
    }

}
