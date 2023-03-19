package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class TechnologyRequirement {
    /**
    * object fields.
    */
    @Autowired
    private String technologyRequirementId;

    @Autowired
    private Object addTime;

    @Autowired
    private Object reviseTime;

    @Autowired
    private String requirement;

    @Autowired
    private String technologyId;

    /**
    * methods.
    */
    public void setAddTime(Object arg0) {
    // TODO
    }

    public Object getReviseTime() {
    // TODO
    }

    public void setTechnologyRequirementId(String arg0) {
    // TODO
    }

    public String getRequirement() {
    // TODO
    }

    public  TechnologyRequirement() {
    // TODO
    }

    public String getTechnologyRequirementId() {
    // TODO
    }

    public void setTechnologyId(String arg0) {
    // TODO
    }

    public Object getAddTime() {
    // TODO
    }

    public void setRequirement(String arg0) {
    // TODO
    }

    public void setReviseTime(Object arg0) {
    // TODO
    }

    public String getTechnologyId() {
    // TODO
    }

}
