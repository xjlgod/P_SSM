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
@RequestMapping("TechnologyServiceImpl")
public class TechnologyServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    default TechnologyMapper technologyMapper;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0) {
        // TODO
    }

    @GetMapping("getList")
    public EUDataGridResult getList(Technology arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("get")
    public Technology get(String arg0) {
        // TODO
    }

    @GetMapping("updateAll")
    public CustomResult updateAll(Technology arg0) {
        // TODO
    }

    @GetMapping("searchTechnologyByTechnologyId")
    public EUDataGridResult searchTechnologyByTechnologyId(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("TechnologyServiceImpl")
    public  TechnologyServiceImpl() {
        // TODO
    }

    @GetMapping("insert")
    public CustomResult insert(Technology arg0) {
        // TODO
    }

    @GetMapping("find")
    public Object find() {
        // TODO
    }

    @GetMapping("searchTechnologyByTechnologyName")
    public EUDataGridResult searchTechnologyByTechnologyName(String arg2, int arg1, int arg0) {
        // TODO
    }

    @GetMapping("init")
    public Object init() {
        // TODO
    }

    @GetMapping("setTechnologyId")
    public Object setTechnologyId() {
        // TODO
    }

    @GetMapping("setTechnologyName")
    public Object setTechnologyName() {
        // TODO
    }

    @GetMapping("getTechnologyId")
    public Object getTechnologyId() {
        // TODO
    }

    @GetMapping("getTechnologyName")
    public Object getTechnologyName() {
        // TODO
    }

    @GetMapping("getPrice")
    public Object getPrice() {
        // TODO
    }

    @GetMapping("getVitalProcessPeriod")
    public Object getVitalProcessPeriod() {
        // TODO
    }

    @GetMapping("getStandardCapacity")
    public Object getStandardCapacity() {
        // TODO
    }

    @GetMapping("getOvertimeStandardCapacity")
    public Object getOvertimeStandardCapacity() {
        // TODO
    }

    @GetMapping("getOvertimeOverfulfilCapacity")
    public Object getOvertimeOverfulfilCapacity() {
        // TODO
    }

    @GetMapping("getDoubleCapacity")
    public Object getDoubleCapacity() {
        // TODO
    }

    @GetMapping("getOverfulfilCapacity")
    public Object getOverfulfilCapacity() {
        // TODO
    }

    @GetMapping("getData")
    public Object getData() {
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

    @GetMapping("setDoubleCapacity")
    public Object setDoubleCapacity() {
        // TODO
    }

    @GetMapping("setOverfulfilCapacity")
    public Object setOverfulfilCapacity() {
        // TODO
    }

    @GetMapping("setOvertimeOverfulfilCapacity")
    public Object setOvertimeOverfulfilCapacity() {
        // TODO
    }

    @GetMapping("setOvertimeStandardCapacity")
    public Object setOvertimeStandardCapacity() {
        // TODO
    }

    @GetMapping("setPrice")
    public Object setPrice() {
        // TODO
    }

    @GetMapping("setStandardCapacity")
    public Object setStandardCapacity() {
        // TODO
    }

    @GetMapping("setVitalProcessPeriod")
    public Object setVitalProcessPeriod() {
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

    @GetMapping("getConsumeAmount")
    public Object getConsumeAmount() {
        // TODO
    }

    @GetMapping("setConsumeAmount")
    public Object setConsumeAmount() {
        // TODO
    }

    @GetMapping("getConsumeDate")
    public Object getConsumeDate() {
        // TODO
    }

    @GetMapping("setConsumeDate")
    public Object setConsumeDate() {
        // TODO
    }

    @GetMapping("getConsumeId")
    public Object getConsumeId() {
        // TODO
    }

    @GetMapping("setConsumeId")
    public Object setConsumeId() {
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

    @GetMapping("getReceiver")
    public Object getReceiver() {
        // TODO
    }

    @GetMapping("setReceiver")
    public Object setReceiver() {
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

    @GetMapping("getWorkId")
    public Object getWorkId() {
        // TODO
    }

    @GetMapping("setWorkId")
    public Object setWorkId() {
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

    @GetMapping("searchDepartmentByDepartmentId")
    public Object searchDepartmentByDepartmentId() {
        // TODO
    }

}
