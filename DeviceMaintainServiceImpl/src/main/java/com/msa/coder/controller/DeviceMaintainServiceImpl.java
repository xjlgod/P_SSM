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
@RequestMapping("DeviceMaintainServiceImpl")
public class DeviceMaintainServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default DeviceMaintainMapper deviceMaintainMapper;

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

    @GetMapping("searchDeviceMaintainByDeviceFaultId")
    public EUDataGridResult searchDeviceMaintainByDeviceFaultId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("DeviceMaintainServiceImpl")
    public  DeviceMaintainServiceImpl() {
        // TODO
    }

    @GetMapping("get")
    public DeviceMaintain get(String arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(DeviceMaintain arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(DeviceMaintain arg0) {
        // TODO
    }

    @GetMapping("searchDeviceMaintainByDeviceMaintainId")
    public EUDataGridResult searchDeviceMaintainByDeviceMaintainId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(DeviceMaintain arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(DeviceMaintain arg2, int arg1, int arg0) {
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

    @GetMapping("setUsername")
    public Object setUsername() {
        // TODO
    }

    @GetMapping("setPassword")
    public Object setPassword() {
        // TODO
    }

    @GetMapping("setLocked")
    public Object setLocked() {
        // TODO
    }

    @GetMapping("getPassword")
    public Object getPassword() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getId")
    public Object getId() {
        // TODO
    }

    @GetMapping("setUserid")
    public Object setUserid() {
        // TODO
    }

    @GetMapping("getUsername")
    public Object getUsername() {
        // TODO
    }

    @GetMapping("setUsername")
    public Object setUsername() {
        // TODO
    }

    @GetMapping("getLocked")
    public Object getLocked() {
        // TODO
    }

    @GetMapping("setUserStatus")
    public Object setUserStatus() {
        // TODO
    }

    @GetMapping("setRolename")
    public Object setRolename() {
        // TODO
    }

    @GetMapping("setRoleStatus")
    public Object setRoleStatus() {
        // TODO
    }

    @GetMapping("getUsername")
    public Object getUsername() {
        // TODO
    }

    @GetMapping("setMenus")
    public Object setMenus() {
        // TODO
    }

    @GetMapping("getUserid")
    public Object getUserid() {
        // TODO
    }

    @GetMapping("getRolename")
    public Object getRolename() {
        // TODO
    }

    @GetMapping("getDeviceMaintainId")
    public Object getDeviceMaintainId() {
        // TODO
    }

    @GetMapping("getDeviceFaultId")
    public Object getDeviceFaultId() {
        // TODO
    }

    @GetMapping("getDeviceMaintainEmpId")
    public Object getDeviceMaintainEmpId() {
        // TODO
    }

    @GetMapping("getDeviceMaintainDate")
    public Object getDeviceMaintainDate() {
        // TODO
    }

    @GetMapping("getDeviceMaintainResult")
    public Object getDeviceMaintainResult() {
        // TODO
    }

    @GetMapping("getDeviceMaintainCost")
    public Object getDeviceMaintainCost() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("getDeviceMaintainEmp")
    public Object getDeviceMaintainEmp() {
        // TODO
    }

    @GetMapping("getRoleId")
    public Object getRoleId() {
        // TODO
    }

    @GetMapping("getRoleName")
    public Object getRoleName() {
        // TODO
    }

    @GetMapping("setRoleId")
    public Object setRoleId() {
        // TODO
    }

}
