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
@RequestMapping("MaterialConsumeServiceImpl")
public class MaterialConsumeServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default MaterialConsumeMapper materialConsumeMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("get")
    public MaterialConsume get(String arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(MaterialConsumeVO arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(MaterialConsume arg0) {
        // TODO
    }

    @GetMapping("delete")
    public CustomResult delete(String arg0) {
        // TODO
    }

    @GetMapping("searchMaterialConsumeByMaterialId")
    public EUDataGridResult searchMaterialConsumeByMaterialId(String arg2, int arg1, int arg0) {
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

    @GetMapping("updateNote")
    public CustomResult updateNote(MaterialConsume arg0) {
        // TODO
    }

    @GetMapping("MaterialConsumeServiceImpl")
    public  MaterialConsumeServiceImpl() {
        // TODO
    }

    @GetMapping("searchMaterialConsumeByConsumeId")
    public EUDataGridResult searchMaterialConsumeByConsumeId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchMaterialConsumeByWorkId")
    public EUDataGridResult searchMaterialConsumeByWorkId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("update")
    public CustomResult update(MaterialConsume arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(MaterialConsume arg0) {
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

    @GetMapping("searchMaterialByMaterialId")
    public Object searchMaterialByMaterialId() {
        // TODO
    }

    @GetMapping("getData")
    public Object getData() {
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
