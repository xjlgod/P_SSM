package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class WorkVO {
    /**
    * object fields.
    */
    @Autowired
    private Process process;

    @Autowired
    private Product product;

    @Autowired
    private String processNumber;

    @Autowired
    private Device device;

    @Autowired
    private String workId;

    /**
    * not object fields.
    */
    private int rating;

    /**
    * methods.
    */
    public int getRating() {
    // TODO
    }

    public void setProcess(Process arg0) {
    // TODO
    }

    public void setRating(int arg0) {
    // TODO
    }

    public  WorkVO() {
    // TODO
    }

    public void setProduct(Product arg0) {
    // TODO
    }

    public String getWorkId() {
    // TODO
    }

    public Product getProduct() {
    // TODO
    }

    public void setDevice(Device arg0) {
    // TODO
    }

    public String getProcessNumber() {
    // TODO
    }

    public Device getDevice() {
    // TODO
    }

    public Process getProcess() {
    // TODO
    }

    public void setWorkId(String arg0) {
    // TODO
    }

    public void setProcessNumber(String arg0) {
    // TODO
    }

}
