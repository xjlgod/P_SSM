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
@RequestMapping("DepartmentServiceImpl")
public class DepartmentServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default DepartmentMapper departmentMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(Department arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchDepartmentByDepartmentId")
    public Object searchDepartmentByDepartmentId(String arg0) {
        // TODO
    }

    @GetMapping("searchDepartmentByDepartmentId")
    public EUDataGridResult searchDepartmentByDepartmentId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(Department arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("get")
    public Department get(String arg0) {
        // TODO
    }

    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("DepartmentServiceImpl")
    public  DepartmentServiceImpl() {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Department arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(Department arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Department arg0) {
        // TODO
    }

    @GetMapping("searchDepartmentByDepartmentName")
    public EUDataGridResult searchDepartmentByDepartmentName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setDepartmentId")
    public Object setDepartmentId() {
        // TODO
    }

    @GetMapping("getDepartmentId")
    public Object getDepartmentId() {
        // TODO
    }

    @GetMapping("getDepartmentName")
    public Object getDepartmentName() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
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

    @GetMapping("searchOrderByOrderId")
    public Object searchOrderByOrderId() {
        // TODO
    }

    @GetMapping("setDepartmentName")
    public Object setDepartmentName() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

}
