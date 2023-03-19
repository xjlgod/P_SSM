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
@RequestMapping("MaterialServiceImpl")
public class MaterialServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default MaterialMapper materialMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("updateNote")
    public CustomResult updateNote(Material arg0) {
        // TODO
    }

    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("get")
    public Material get(String arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(Material arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchMaterialByMaterialType")
    public EUDataGridResult searchMaterialByMaterialType(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(Material arg0) {
        // TODO
    }

    @GetMapping("MaterialServiceImpl")
    public  MaterialServiceImpl() {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Material arg0) {
        // TODO
    }

    @GetMapping("searchMaterialByMaterialId")
    public EUDataGridResult searchMaterialByMaterialId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Material arg0) {
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

    @GetMapping("getWorkId")
    public Object getWorkId() {
        // TODO
    }

    @GetMapping("getMaterialType")
    public Object getMaterialType() {
        // TODO
    }

    @GetMapping("getStatus")
    public Object getStatus() {
        // TODO
    }

    @GetMapping("getRemaining")
    public Object getRemaining() {
        // TODO
    }

    @GetMapping("getNote")
    public Object getNote() {
        // TODO
    }

    @GetMapping("setMaterialId")
    public Object setMaterialId() {
        // TODO
    }

    @GetMapping("setMaterialType")
    public Object setMaterialType() {
        // TODO
    }

    @GetMapping("setNote")
    public Object setNote() {
        // TODO
    }

    @GetMapping("setRemaining")
    public Object setRemaining() {
        // TODO
    }

    @GetMapping("setStatus")
    public Object setStatus() {
        // TODO
    }

}
