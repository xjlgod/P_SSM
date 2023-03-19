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
@RequestMapping("ProductServiceImpl")
public class ProductServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default ProductMapper productMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("get")
    public Product get(String arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(Product arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(Product arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchProductByProductType")
    public EUDataGridResult searchProductByProductType(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Product arg0) {
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

    @GetMapping("ProductServiceImpl")
    public  ProductServiceImpl() {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Product arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(Product arg0) {
        // TODO
    }

    @GetMapping("searchProductByProductId")
    public EUDataGridResult searchProductByProductId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchProductByProductName")
    public EUDataGridResult searchProductByProductName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setProductId")
    public Object setProductId() {
        // TODO
    }

    @GetMapping("setProductName")
    public Object setProductName() {
        // TODO
    }

    @GetMapping("getProductId")
    public Object getProductId() {
        // TODO
    }

    @GetMapping("getProductName")
    public Object getProductName() {
        // TODO
    }

    @GetMapping("getProductType")
    public Object getProductType() {
        // TODO
    }

    @GetMapping("getImage")
    public Object getImage() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("getStatus")
    public Object getStatus() {
        // TODO
    }

    @GetMapping("getData")
    public Object getData() {
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

    @GetMapping("setImage")
    public Object setImage() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("setProductType")
    public Object setProductType() {
        // TODO
    }

    @GetMapping("setStatus")
    public Object setStatus() {
        // TODO
    }

    @GetMapping("edit")
    public Object edit() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setProcessId")
    public Object setProcessId() {
        // TODO
    }

    @GetMapping("getProcessId")
    public Object getProcessId() {
        // TODO
    }

    @GetMapping("getTechnologyPlanId")
    public Object getTechnologyPlanId() {
        // TODO
    }

    @GetMapping("getSequence")
    public Object getSequence() {
        // TODO
    }

    @GetMapping("getQuota")
    public Object getQuota() {
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

    @GetMapping("setTechnologyPlanId")
    public Object setTechnologyPlanId() {
        // TODO
    }

    @GetMapping("setSequence")
    public Object setSequence() {
        // TODO
    }

    @GetMapping("setQuota")
    public Object setQuota() {
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

    @GetMapping("getDeviceFaultMaintenance")
    public Object getDeviceFaultMaintenance() {
        // TODO
    }

    @GetMapping("getDeviceFaultDate")
    public Object getDeviceFaultDate() {
        // TODO
    }

    @GetMapping("getDeviceId")
    public Object getDeviceId() {
        // TODO
    }

    @GetMapping("getDeviceFaultCause")
    public Object getDeviceFaultCause() {
        // TODO
    }

    @GetMapping("getDeviceFaultDetail")
    public Object getDeviceFaultDetail() {
        // TODO
    }

    @GetMapping("getDeviceFaultId")
    public Object getDeviceFaultId() {
        // TODO
    }

    @GetMapping("setDeviceFaultCause")
    public Object setDeviceFaultCause() {
        // TODO
    }

    @GetMapping("setDeviceFaultDate")
    public Object setDeviceFaultDate() {
        // TODO
    }

    @GetMapping("setDeviceFaultDetail")
    public Object setDeviceFaultDetail() {
        // TODO
    }

    @GetMapping("setDeviceFaultId")
    public Object setDeviceFaultId() {
        // TODO
    }

    @GetMapping("setDeviceFaultMaintenance")
    public Object setDeviceFaultMaintenance() {
        // TODO
    }

    @GetMapping("setDeviceId")
    public Object setDeviceId() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getAvailable")
    public Object getAvailable() {
        // TODO
    }

    @GetMapping("setAvailable")
    public Object setAvailable() {
        // TODO
    }

    @GetMapping("getPermission")
    public Object getPermission() {
        // TODO
    }

    @GetMapping("setPermission")
    public Object setPermission() {
        // TODO
    }

    @GetMapping("getRoleId")
    public Object getRoleId() {
        // TODO
    }

    @GetMapping("setRoleId")
    public Object setRoleId() {
        // TODO
    }

    @GetMapping("getRoleName")
    public Object getRoleName() {
        // TODO
    }

    @GetMapping("setRoleName")
    public Object setRoleName() {
        // TODO
    }

}
