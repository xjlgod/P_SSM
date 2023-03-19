package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Department {
    /**
    * object fields.
    */
    @Autowired
    private String departmentName;

    @Autowired
    private String note;

    @Autowired
    private String departmentId;

    /**
    * methods.
    */
    public void setDepartmentName(String arg0) {
    // TODO
    }

    public void setDepartmentId(String arg0) {
    // TODO
    }

    public void setNote(String arg0) {
    // TODO
    }

    public  Department() {
    // TODO
    }

    public String getNote() {
    // TODO
    }

    public String getDepartmentId() {
    // TODO
    }

    public String getDepartmentName() {
    // TODO
    }

}
