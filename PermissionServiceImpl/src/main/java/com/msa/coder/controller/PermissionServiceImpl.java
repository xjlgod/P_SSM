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
@RequestMapping("PermissionServiceImpl")
public class PermissionServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default SysRolePermissionMapper sysRolePermissionMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(SysRolePermission arg0) {
        // TODO
    }

    @GetMapping("getByRoleId")
    public SysRolePermission getByRoleId(String arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(SysRolePermission arg0) {
        // TODO
    }

    @GetMapping("updateByRoleId")
    public CustomResult updateByRoleId(String arg1, String arg0) {
        // TODO
    }

    @GetMapping("get")
    public SysRolePermission get(String arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(SysRolePermission arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(SysRolePermission arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("PermissionServiceImpl")
    public  PermissionServiceImpl() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("isDistinct")
    public Object isDistinct() {
        // TODO
    }

    @GetMapping("getOredCriteria")
    public Object getOredCriteria() {
        // TODO
    }

    @GetMapping("getOrderByClause")
    public Object getOrderByClause() {
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

    @GetMapping("getCheckItem")
    public Object getCheckItem() {
        // TODO
    }

    @GetMapping("getMeasureData")
    public Object getMeasureData() {
        // TODO
    }

    @GetMapping("getUnqualify")
    public Object getUnqualify() {
        // TODO
    }

    @GetMapping("getResult")
    public Object getResult() {
        // TODO
    }

    @GetMapping("getProcessId")
    public Object getProcessId() {
        // TODO
    }

    @GetMapping("getQualify")
    public Object getQualify() {
        // TODO
    }

    @GetMapping("getCheckNumber")
    public Object getCheckNumber() {
        // TODO
    }

    @GetMapping("getSample")
    public Object getSample() {
        // TODO
    }

    @GetMapping("getCdate")
    public Object getCdate() {
        // TODO
    }

    @GetMapping("getpCountCheckId")
    public Object getpCountCheckId() {
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

    @GetMapping("setCheckNumber")
    public Object setCheckNumber() {
        // TODO
    }

    @GetMapping("setEmpId")
    public Object setEmpId() {
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

    @GetMapping("setpCountCheckId")
    public Object setpCountCheckId() {
        // TODO
    }

    @GetMapping("setProcessId")
    public Object setProcessId() {
        // TODO
    }

    @GetMapping("setQualify")
    public Object setQualify() {
        // TODO
    }

    @GetMapping("setResult")
    public Object setResult() {
        // TODO
    }

    @GetMapping("setSample")
    public Object setSample() {
        // TODO
    }

    @GetMapping("setUnqualify")
    public Object setUnqualify() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setId")
    public Object setId() {
        // TODO
    }

    @GetMapping("setSysRoleId")
    public Object setSysRoleId() {
        // TODO
    }

    @GetMapping("setSysPermissionId")
    public Object setSysPermissionId() {
        // TODO
    }

    @GetMapping("getId")
    public Object getId() {
        // TODO
    }

    @GetMapping("getSysRoleId")
    public Object getSysRoleId() {
        // TODO
    }

    @GetMapping("getSysPermissionId")
    public Object getSysPermissionId() {
        // TODO
    }

}
