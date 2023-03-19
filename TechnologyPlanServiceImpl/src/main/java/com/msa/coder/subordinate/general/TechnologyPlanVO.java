package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class TechnologyPlanVO {
    /**
    * object fields.
    */
    @Autowired
    private String technologyName;

    /**
    * methods.
    */
    public String getTechnologyName() {
    // TODO
    }

    public void setTechnologyName(String arg0) {
    // TODO
    }

    public  TechnologyPlanVO() {
    // TODO
    }

}
