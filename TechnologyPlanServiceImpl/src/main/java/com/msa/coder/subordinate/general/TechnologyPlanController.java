package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class TechnologyPlanController {
    /**
    * object fields.
    */
    @Autowired
    private TechnologyPlanService technologyPlanService;

    /**
    * methods.
    */
    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, TechnologyPlan arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, TechnologyPlan arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public  TechnologyPlanController() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public EUDataGridResult searchTechnologyPlanByTechnologyName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchTechnologyPlanByTechnologyPlanId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public EUDataGridResult getItemList(TechnologyPlanVO arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

    public TechnologyPlan getItemById(String arg0) {
    // TODO
    }

}
