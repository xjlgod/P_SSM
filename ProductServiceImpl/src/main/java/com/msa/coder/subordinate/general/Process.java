package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Process {
    /**
    * object fields.
    */
    @Autowired
    private String processId;

    @Autowired
    private String technologyPlanId;

    /**
    * not object fields.
    */
    private int sequence;

    private int quota;

    /**
    * methods.
    */
    public  Process() {
    // TODO
    }

    public void setTechnologyPlanId(String arg0) {
    // TODO
    }

    public String getTechnologyPlanId() {
    // TODO
    }

    public String getProcessId() {
    // TODO
    }

    public void setSequence(int arg0) {
    // TODO
    }

    public void setQuota(int arg0) {
    // TODO
    }

    public int getSequence() {
    // TODO
    }

    public int getQuota() {
    // TODO
    }

    public void setProcessId(String arg0) {
    // TODO
    }

}
