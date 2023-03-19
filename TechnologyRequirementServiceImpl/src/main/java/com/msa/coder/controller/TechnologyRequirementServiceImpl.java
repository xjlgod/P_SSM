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
@RequestMapping("TechnologyRequirementServiceImpl")
public class TechnologyRequirementServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default TechnologyMapper technologyMapper;

    @Autowired
    default TechnologyRequirementMapper technologyRequirementMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("searchTechnologyRequirementByTechnologyRequirementId")
    public EUDataGridResult searchTechnologyRequirementByTechnologyRequirementId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("TechnologyRequirementServiceImpl")
    public  TechnologyRequirementServiceImpl() {
        // TODO
    }

    @GetMapping("updateRequirement")
    public CustomResult updateRequirement(TechnologyRequirement arg0) {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(TechnologyRequirement arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(TechnologyRequirement arg0) {
        // TODO
    }

    @GetMapping("get")
    public TechnologyRequirement get(String arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(TechnologyRequirement arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("searchTechnologyRequirementByTechnologyName")
    public EUDataGridResult searchTechnologyRequirementByTechnologyName(String arg2, int arg1, int arg0) {
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

    @GetMapping("getTechnologyRequirementId")
    public Object getTechnologyRequirementId() {
        // TODO
    }

    @GetMapping("getTechnologyId")
    public Object getTechnologyId() {
        // TODO
    }

    @GetMapping("getRequirement")
    public Object getRequirement() {
        // TODO
    }

    @GetMapping("getAddTime")
    public Object getAddTime() {
        // TODO
    }

    @GetMapping("getReviseTime")
    public Object getReviseTime() {
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

    @GetMapping("getData")
    public Object getData() {
        // TODO
    }

    @GetMapping("edit")
    public Object edit() {
        // TODO
    }

}
