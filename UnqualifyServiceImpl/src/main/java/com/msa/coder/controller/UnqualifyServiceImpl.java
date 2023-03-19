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
@RequestMapping("UnqualifyServiceImpl")
public class UnqualifyServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default UnqualifyApplyMapper unqualifyApplyMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(UnqualifyApply arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(UnqualifyApply arg0) {
        // TODO
    }

    @GetMapping("get")
    public UnqualifyApply get(String arg0) {
        // TODO
    }

    @GetMapping("searchUnqualifyByUnqualifyId")
    public EUDataGridResult searchUnqualifyByUnqualifyId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(UnqualifyApply arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(UnqualifyApply arg0) {
        // TODO
    }

    @GetMapping("UnqualifyServiceImpl")
    public  UnqualifyServiceImpl() {
        // TODO
    }

    @GetMapping("searchUnqualifyByProductName")
    public EUDataGridResult searchUnqualifyByProductName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(UnqualifyApply arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
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

    @GetMapping("getUnqualifyApplyId")
    public Object getUnqualifyApplyId() {
        // TODO
    }

    @GetMapping("getProductId")
    public Object getProductId() {
        // TODO
    }

    @GetMapping("getUnqualifyItem")
    public Object getUnqualifyItem() {
        // TODO
    }

    @GetMapping("getUnqualifyCount")
    public Object getUnqualifyCount() {
        // TODO
    }

    @GetMapping("getAssemblyDate")
    public Object getAssemblyDate() {
        // TODO
    }

    @GetMapping("getEmpId")
    public Object getEmpId() {
        // TODO
    }

    @GetMapping("getApplyDate")
    public Object getApplyDate() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("getProductName")
    public Object getProductName() {
        // TODO
    }

    @GetMapping("getEmpName")
    public Object getEmpName() {
        // TODO
    }

    @GetMapping("add")
    public Object add() {
        // TODO
    }

    @GetMapping("setApplyDate")
    public Object setApplyDate() {
        // TODO
    }

    @GetMapping("setAssemblyDate")
    public Object setAssemblyDate() {
        // TODO
    }

    @GetMapping("setEmpId")
    public Object setEmpId() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("setProductId")
    public Object setProductId() {
        // TODO
    }

    @GetMapping("setUnqualifyApplyId")
    public Object setUnqualifyApplyId() {
        // TODO
    }

    @GetMapping("setUnqualifyCount")
    public Object setUnqualifyCount() {
        // TODO
    }

    @GetMapping("setUnqualifyItem")
    public Object setUnqualifyItem() {
        // TODO
    }

    @GetMapping("edit")
    public Object edit() {
        // TODO
    }

}
