package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Task {
    /**
    * object fields.
    */
    @Autowired
    private String manufactureSn;

    @Autowired
    private String taskId;

    @Autowired
    private String workId;

    /**
    * not object fields.
    */
    private int taskQuantity;

    private long workingHours;

    /**
    * methods.
    */
    public int getTaskQuantity() {
    // TODO
    }

    public long getWorkingHours() {
    // TODO
    }

    public void setManufactureSn(String arg0) {
    // TODO
    }

    public  Task() {
    // TODO
    }

    public String getWorkId() {
    // TODO
    }

    public void setWorkId(String arg0) {
    // TODO
    }

    public void setWorkingHours(long arg0) {
    // TODO
    }

    public String getTaskId() {
    // TODO
    }

    public String getManufactureSn() {
    // TODO
    }

    public void setTaskId(String arg0) {
    // TODO
    }

    public void setTaskQuantity(int arg0) {
    // TODO
    }

}
