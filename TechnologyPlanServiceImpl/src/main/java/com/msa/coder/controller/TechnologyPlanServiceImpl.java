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
@RequestMapping("TechnologyPlanServiceImpl")
public class TechnologyPlanServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default TechnologyMapper technologyMapper;

    @Autowired
    default TechnologyPlanMapper technologyPlanMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("get")
    public TechnologyPlan get(String arg0) {
        // TODO
    }

    @GetMapping("searchTechnologyPlanByTechnologyName")
    public EUDataGridResult searchTechnologyPlanByTechnologyName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("searchTechnologyPlanByTechnologyPlanId")
    public EUDataGridResult searchTechnologyPlanByTechnologyPlanId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(TechnologyPlan arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("TechnologyPlanServiceImpl")
    public  TechnologyPlanServiceImpl() {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(TechnologyPlan arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(TechnologyPlan arg0) {
        // TODO
    }

    @GetMapping("getData")
    public Object getData() {
        // TODO
    }

    @GetMapping("getTechnologyPlanId")
    public Object getTechnologyPlanId() {
        // TODO
    }

    @GetMapping("getTechnologyId")
    public Object getTechnologyId() {
        // TODO
    }

    @GetMapping("getBatchAmount")
    public Object getBatchAmount() {
        // TODO
    }

    @GetMapping("getStartPlan")
    public Object getStartPlan() {
        // TODO
    }

    @GetMapping("getEndPlan")
    public Object getEndPlan() {
        // TODO
    }

    @GetMapping("getCommitPlan")
    public Object getCommitPlan() {
        // TODO
    }

    @GetMapping("getTechnologyPlanStart")
    public Object getTechnologyPlanStart() {
        // TODO
    }

    @GetMapping("getTechnologyPlanEnd")
    public Object getTechnologyPlanEnd() {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
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

    @GetMapping("getTechnologyName")
    public Object getTechnologyName() {
        // TODO
    }

    @GetMapping("add")
    public Object add() {
        // TODO
    }

    @GetMapping("setBatchAmount")
    public Object setBatchAmount() {
        // TODO
    }

    @GetMapping("setCommitPlan")
    public Object setCommitPlan() {
        // TODO
    }

    @GetMapping("setEndPlan")
    public Object setEndPlan() {
        // TODO
    }

    @GetMapping("setStartPlan")
    public Object setStartPlan() {
        // TODO
    }

    @GetMapping("setTechnologyId")
    public Object setTechnologyId() {
        // TODO
    }

    @GetMapping("setTechnologyPlanId")
    public Object setTechnologyPlanId() {
        // TODO
    }

    @GetMapping("edit")
    public Object edit() {
        // TODO
    }

}
