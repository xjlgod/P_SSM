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
@RequestMapping("OrderServiceImpl")
public class OrderServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default CustomService customService;

    @Autowired
    default COrderMapper cOrderMapper;

    @Autowired
    default ProductService productService;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("searchOrderByOrderId")
    public EUDataGridResult searchOrderByOrderId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("searchOrderByProductName")
    public EUDataGridResult searchOrderByProductName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(COrder arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(COrder arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(COrder arg0) {
        // TODO
    }

    @GetMapping("get")
    public COrderVO get(String arg0) {
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

    @GetMapping("getList")
    public EUDataGridResult getList(COrderVO arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchOrderByCustomName")
    public EUDataGridResult searchOrderByCustomName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("OrderServiceImpl")
    public  OrderServiceImpl() {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(COrder arg0) {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getOrderId")
    public Object getOrderId() {
        // TODO
    }

    @GetMapping("getOrderDate")
    public Object getOrderDate() {
        // TODO
    }

    @GetMapping("getRequestDate")
    public Object getRequestDate() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("getQuantity")
    public Object getQuantity() {
        // TODO
    }

    @GetMapping("getUnitPrice")
    public Object getUnitPrice() {
        // TODO
    }

    @GetMapping("getUnit")
    public Object getUnit() {
        // TODO
    }

    @GetMapping("getImage")
    public Object getImage() {
        // TODO
    }

    @GetMapping("getFile")
    public Object getFile() {
        // TODO
    }

    @GetMapping("getStatus")
    public Object getStatus() {
        // TODO
    }

    @GetMapping("getCustom")
    public Object getCustom() {
        // TODO
    }

    @GetMapping("getCustomId")
    public Object getCustomId() {
        // TODO
    }

    @GetMapping("getCustomName")
    public Object getCustomName() {
        // TODO
    }

    @GetMapping("getFullName")
    public Object getFullName() {
        // TODO
    }

    @GetMapping("getAddress")
    public Object getAddress() {
        // TODO
    }

    @GetMapping("getFax")
    public Object getFax() {
        // TODO
    }

    @GetMapping("getEmail")
    public Object getEmail() {
        // TODO
    }

    @GetMapping("getOwnerName")
    public Object getOwnerName() {
        // TODO
    }

    @GetMapping("getOwnerTel")
    public Object getOwnerTel() {
        // TODO
    }

    @GetMapping("getStatus")
    public Object getStatus() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("getProduct")
    public Object getProduct() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setCustomId")
    public Object setCustomId() {
        // TODO
    }

    @GetMapping("setCustomName")
    public Object setCustomName() {
        // TODO
    }

    @GetMapping("setFullName")
    public Object setFullName() {
        // TODO
    }

    @GetMapping("setAddress")
    public Object setAddress() {
        // TODO
    }

    @GetMapping("setFax")
    public Object setFax() {
        // TODO
    }

    @GetMapping("setEmail")
    public Object setEmail() {
        // TODO
    }

    @GetMapping("setOwnerName")
    public Object setOwnerName() {
        // TODO
    }

    @GetMapping("setOwnerTel")
    public Object setOwnerTel() {
        // TODO
    }

    @GetMapping("setStatus")
    public Object setStatus() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("genStringId")
    public Object genStringId() {
        // TODO
    }

}
