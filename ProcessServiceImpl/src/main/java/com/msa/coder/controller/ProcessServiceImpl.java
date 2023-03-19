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
@RequestMapping("ProcessServiceImpl")
public class ProcessServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default ProcessMapper processMapper;

    @Autowired
    default TechnologyPlanMapper technologyPlanMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("ProcessServiceImpl")
    public  ProcessServiceImpl() {
        // TODO
    }

    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(Process arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchProcessByProcessId")
    public EUDataGridResult searchProcessByProcessId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchProcessByTechnologyPlanId")
    public EUDataGridResult searchProcessByTechnologyPlanId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("get")
    public Process get(String arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Process arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Process arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("convert")
    public Object convert() {
        // TODO
    }

    @GetMapping("doGetAuthenticationInfo")
    public Object doGetAuthenticationInfo() {
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

    @GetMapping("edit")
    public Object edit() {
        // TODO
    }

    @GetMapping("searchEmployeeByEmployeeId")
    public Object searchEmployeeByEmployeeId() {
        // TODO
    }

    @GetMapping("getPermission")
    public Object getPermission() {
        // TODO
    }

}
