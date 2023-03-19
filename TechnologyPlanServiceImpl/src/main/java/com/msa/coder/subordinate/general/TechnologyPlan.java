package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class TechnologyPlan {
    /**
    * object fields.
    */
    @Autowired
    private Object endPlan;

    @Autowired
    private Object technologyPlanStart;

    @Autowired
    private Object startPlan;

    @Autowired
    private Object technologyPlanEnd;

    @Autowired
    private String technologyId;

    @Autowired
    private String technologyPlanId;

    @Autowired
    private Object commitPlan;

    /**
    * not object fields.
    */
    private int batchAmount;

    /**
    * methods.
    */
    public Object getEndPlan() {
    // TODO
    }

    public int getBatchAmount() {
    // TODO
    }

    public void setCommitPlan(Object arg0) {
    // TODO
    }

    public void setTechnologyId(String arg0) {
    // TODO
    }

    public String getTechnologyId() {
    // TODO
    }

    public void setBatchAmount(int arg0) {
    // TODO
    }

    public Object getTechnologyPlanEnd() {
    // TODO
    }

    public void setTechnologyPlanStart(Object arg0) {
    // TODO
    }

    public Object getCommitPlan() {
    // TODO
    }

    public  TechnologyPlan() {
    // TODO
    }

    public Object getTechnologyPlanStart() {
    // TODO
    }

    public void setTechnologyPlanId(String arg0) {
    // TODO
    }

    public String getTechnologyPlanId() {
    // TODO
    }

    public void setStartPlan(Object arg0) {
    // TODO
    }

    public Object getStartPlan() {
    // TODO
    }

    public void setTechnologyPlanEnd(Object arg0) {
    // TODO
    }

    public void setEndPlan(Object arg0) {
    // TODO
    }

}
