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
@RequestMapping("WorkServiceImpl")
public class WorkServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default WorkMapper workMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("WorkServiceImpl")
    public  WorkServiceImpl() {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("get")
    public WorkVO get(String arg0) {
        // TODO
    }

    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("searchWorkByWorkProcess")
    public EUDataGridResult searchWorkByWorkProcess(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(WorkVO arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchWorkByWorkId")
    public EUDataGridResult searchWorkByWorkId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(Work arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Work arg0) {
        // TODO
    }

    @GetMapping("searchWorkByWorkProduct")
    public EUDataGridResult searchWorkByWorkProduct(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Work arg0) {
        // TODO
    }

    @GetMapping("searchWorkByWorkDevice")
    public EUDataGridResult searchWorkByWorkDevice(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("ajaxLogin")
    public Object ajaxLogin() {
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

    @GetMapping("getData")
    public Object getData() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getCustomId")
    public Object getCustomId() {
        // TODO
    }

    @GetMapping("setCustomId")
    public Object setCustomId() {
        // TODO
    }

    @GetMapping("getFile")
    public Object getFile() {
        // TODO
    }

    @GetMapping("setFile")
    public Object setFile() {
        // TODO
    }

    @GetMapping("getImage")
    public Object getImage() {
        // TODO
    }

    @GetMapping("setImage")
    public Object setImage() {
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

    @GetMapping("getOrderDate")
    public Object getOrderDate() {
        // TODO
    }

    @GetMapping("setOrderDate")
    public Object setOrderDate() {
        // TODO
    }

    @GetMapping("getOrderId")
    public Object getOrderId() {
        // TODO
    }

    @GetMapping("setOrderId")
    public Object setOrderId() {
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

    @GetMapping("getQuantity")
    public Object getQuantity() {
        // TODO
    }

    @GetMapping("setQuantity")
    public Object setQuantity() {
        // TODO
    }

    @GetMapping("getRequestDate")
    public Object getRequestDate() {
        // TODO
    }

    @GetMapping("setRequestDate")
    public Object setRequestDate() {
        // TODO
    }

    @GetMapping("getStatus")
    public Object getStatus() {
        // TODO
    }

    @GetMapping("setStatus")
    public Object setStatus() {
        // TODO
    }

    @GetMapping("getUnit")
    public Object getUnit() {
        // TODO
    }

    @GetMapping("setUnit")
    public Object setUnit() {
        // TODO
    }

    @GetMapping("getUnitPrice")
    public Object getUnitPrice() {
        // TODO
    }

    @GetMapping("setUnitPrice")
    public Object setUnitPrice() {
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

    @GetMapping("searchCustomByCustomId")
    public Object searchCustomByCustomId() {
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

    @GetMapping("searchProcessByProcessId")
    public Object searchProcessByProcessId() {
        // TODO
    }

}
