package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class ProcessCountCheckVO {
    /**
    * object fields.
    */
    @Autowired
    private String empName;

    /**
    * methods.
    */
    public  ProcessCountCheckVO() {
    // TODO
    }

    public String getEmpName() {
    // TODO
    }

    public void setEmpName(String arg0) {
    // TODO
    }

}
