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
@RequestMapping("UserServiceImpl")
public class UserServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default SysUserMapper sysUserMapper;

    @Autowired
    default SysUserRoleMapper sysUserRoleMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("searchUserByRoleName")
    public EUDataGridResult searchUserByRoleName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("searchUserByUserId")
    public EUDataGridResult searchUserByUserId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("UserServiceImpl")
    public  UserServiceImpl() {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(SysUser arg0) {
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

    @GetMapping("searchSysUserBySysUserName")
    public Object searchSysUserBySysUserName(String arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(SysUser arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(SysUser arg0) {
        // TODO
    }

    @GetMapping("searchUserByUserName")
    public EUDataGridResult searchUserByUserName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(SysUser arg0) {
        // TODO
    }

    @GetMapping("get")
    public SysUser get(String arg0) {
        // TODO
    }

    @GetMapping("searchSysUserBySysUserId")
    public Object searchSysUserBySysUserId(String arg0) {
        // TODO
    }

    @GetMapping("findByUserNameAndId")
    public Object findByUserNameAndId(String arg1, String arg0) {
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

    @GetMapping("andUsernameEqualTo")
    public Object andUsernameEqualTo() {
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

    @GetMapping("getCondition")
    public Object getCondition() {
        // TODO
    }

    @GetMapping("getOrderByClause")
    public Object getOrderByClause() {
        // TODO
    }

    @GetMapping("getValue")
    public Object getValue() {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
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

    @GetMapping("getData")
    public Object getData() {
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

    @GetMapping("getUnqualify")
    public Object getUnqualify() {
        // TODO
    }

    @GetMapping("getResult")
    public Object getResult() {
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

    @GetMapping("getfCountCheckId")
    public Object getfCountCheckId() {
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

    @GetMapping("setfCountCheckId")
    public Object setfCountCheckId() {
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

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("getId")
    public Object getId() {
        // TODO
    }

    @GetMapping("getUsername")
    public Object getUsername() {
        // TODO
    }

    @GetMapping("getPassword")
    public Object getPassword() {
        // TODO
    }

    @GetMapping("getLocked")
    public Object getLocked() {
        // TODO
    }

    @GetMapping("getRoleName")
    public Object getRoleName() {
        // TODO
    }

    @GetMapping("getRoleId")
    public Object getRoleId() {
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
