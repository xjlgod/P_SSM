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
@RequestMapping("RoleServiceImpl")
public class RoleServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default SysRoleMapper sysRoleMapper;

    @Autowired
    default SysRolePermissionMapper sysRolePermissionMapper;

    @Autowired
    default SysUserRoleMapper sysUserRoleMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("searchRoleByRoleName")
    public EUDataGridResult searchRoleByRoleName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchRoleByRoleId")
    public EUDataGridResult searchRoleByRoleId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(SysRole arg0) {
        // TODO
    }

    @GetMapping("findRoleByUserId")
    public RoleVO findRoleByUserId(String arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(RoleVO arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(SysRole arg0) {
        // TODO
    }

    @GetMapping("get")
    public RoleVO get(String arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(SysRole arg0) {
        // TODO
    }

    @GetMapping("searchSysRoleBySysRoleName")
    public Object searchSysRoleBySysRoleName(String arg0) {
        // TODO
    }

    @GetMapping("RoleServiceImpl")
    public  RoleServiceImpl() {
        // TODO
    }

    @GetMapping("findByRoleNameAndId")
    public Object findByRoleNameAndId(String arg1, String arg0) {
        // TODO
    }

    @GetMapping("searchSysRoleBySysRoleId")
    public Object searchSysRoleBySysRoleId(String arg0) {
        // TODO
    }

    @GetMapping("getRoleName")
    public Object getRoleName() {
        // TODO
    }

    @GetMapping("getAvailable")
    public Object getAvailable() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("createCriteria")
    public Object createCriteria() {
        // TODO
    }

    @GetMapping("andIdIn")
    public Object andIdIn() {
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

    @GetMapping("isValid")
    public Object isValid() {
        // TODO
    }

    @GetMapping("getCriteria")
    public Object getCriteria() {
        // TODO
    }

    @GetMapping("isNoValue")
    public Object isNoValue() {
        // TODO
    }

    @GetMapping("isSingleValue")
    public Object isSingleValue() {
        // TODO
    }

    @GetMapping("isBetweenValue")
    public Object isBetweenValue() {
        // TODO
    }

    @GetMapping("isListValue")
    public Object isListValue() {
        // TODO
    }

    @GetMapping("getCondition")
    public Object getCondition() {
        // TODO
    }

    @GetMapping("getValue")
    public Object getValue() {
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

    @GetMapping("setWorkId")
    public Object setWorkId() {
        // TODO
    }

    @GetMapping("setProcessNumber")
    public Object setProcessNumber() {
        // TODO
    }

    @GetMapping("setRating")
    public Object setRating() {
        // TODO
    }

    @GetMapping("getProduct")
    public Object getProduct() {
        // TODO
    }

    @GetMapping("setProduct")
    public Object setProduct() {
        // TODO
    }

    @GetMapping("getProcess")
    public Object getProcess() {
        // TODO
    }

    @GetMapping("setProcess")
    public Object setProcess() {
        // TODO
    }

    @GetMapping("getDevice")
    public Object getDevice() {
        // TODO
    }

    @GetMapping("setDevice")
    public Object setDevice() {
        // TODO
    }

    @GetMapping("getWorkId")
    public Object getWorkId() {
        // TODO
    }

    @GetMapping("getProcessNumber")
    public Object getProcessNumber() {
        // TODO
    }

    @GetMapping("getRating")
    public Object getRating() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getDeviceId")
    public Object getDeviceId() {
        // TODO
    }

    @GetMapping("setDeviceId")
    public Object setDeviceId() {
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

    @GetMapping("getProcessNumber")
    public Object getProcessNumber() {
        // TODO
    }

    @GetMapping("setProcessNumber")
    public Object setProcessNumber() {
        // TODO
    }

    @GetMapping("getProductId")
    public Object getProductId() {
        // TODO
    }

    @GetMapping("setProductId")
    public Object setProductId() {
        // TODO
    }

    @GetMapping("getRating")
    public Object getRating() {
        // TODO
    }

    @GetMapping("setRating")
    public Object setRating() {
        // TODO
    }

    @GetMapping("getWorkId")
    public Object getWorkId() {
        // TODO
    }

    @GetMapping("setWorkId")
    public Object setWorkId() {
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

    @GetMapping("searchpCountCheckBypCountCheckId")
    public Object searchpCountCheckBypCountCheckId() {
        // TODO
    }

    @GetMapping("getData")
    public Object getData() {
        // TODO
    }

    @GetMapping("getRoleId")
    public Object getRoleId() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getItemList")
    public Object getItemList() {
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

}
