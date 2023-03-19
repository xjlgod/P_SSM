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
@RequestMapping("MaterialReceiveServiceImpl")
public class MaterialReceiveServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default MaterialReceiveMapper materialReceiveMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(MaterialReceive arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(MaterialReceive arg0) {
        // TODO
    }

    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(MaterialReceive arg0) {
        // TODO
    }

    @GetMapping("searchMaterialReceiveByReceiveId")
    public EUDataGridResult searchMaterialReceiveByReceiveId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchMaterialReceiveByMaterialId")
    public EUDataGridResult searchMaterialReceiveByMaterialId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(MaterialReceive arg0) {
        // TODO
    }

    @GetMapping("get")
    public MaterialReceive get(String arg0) {
        // TODO
    }

    @GetMapping("MaterialReceiveServiceImpl")
    public  MaterialReceiveServiceImpl() {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("getReceiveId")
    public Object getReceiveId() {
        // TODO
    }

    @GetMapping("getMaterial")
    public Object getMaterial() {
        // TODO
    }

    @GetMapping("getAmount")
    public Object getAmount() {
        // TODO
    }

    @GetMapping("getReceiveDate")
    public Object getReceiveDate() {
        // TODO
    }

    @GetMapping("getSender")
    public Object getSender() {
        // TODO
    }

    @GetMapping("getreceiver")
    public Object getreceiver() {
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

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("getMaterialId")
    public Object getMaterialId() {
        // TODO
    }

    @GetMapping("setMaterialId")
    public Object setMaterialId() {
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

    @GetMapping("getReceiveDate")
    public Object getReceiveDate() {
        // TODO
    }

    @GetMapping("setReceiveDate")
    public Object setReceiveDate() {
        // TODO
    }

    @GetMapping("getReceiveId")
    public Object getReceiveId() {
        // TODO
    }

    @GetMapping("setReceiveId")
    public Object setReceiveId() {
        // TODO
    }

    @GetMapping("getreceiver")
    public Object getreceiver() {
        // TODO
    }

    @GetMapping("setreceiver")
    public Object setreceiver() {
        // TODO
    }

    @GetMapping("getSender")
    public Object getSender() {
        // TODO
    }

    @GetMapping("setSender")
    public Object setSender() {
        // TODO
    }

    @GetMapping("edit")
    public Object edit() {
        // TODO
    }

}
