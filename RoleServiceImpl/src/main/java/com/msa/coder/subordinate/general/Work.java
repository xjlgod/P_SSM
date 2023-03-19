package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Work {
    /**
    * object fields.
    */
    @Autowired
    private String productId;

    @Autowired
    private String processId;

    @Autowired
    private String processNumber;

    @Autowired
    private String deviceId;

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

    public void setRating(int arg0) {
    // TODO
    }

    public String getWorkId() {
    // TODO
    }

    public String getDeviceId() {
    // TODO
    }

    public String getProcessNumber() {
    // TODO
    }

    public  Work() {
    // TODO
    }

    public void setWorkId(String arg0) {
    // TODO
    }

    public String getProcessId() {
    // TODO
    }

    public String getProductId() {
    // TODO
    }

    public void setDeviceId(String arg0) {
    // TODO
    }

    public void setProductId(String arg0) {
    // TODO
    }

    public void setProcessId(String arg0) {
    // TODO
    }

    public void setProcessNumber(String arg0) {
    // TODO
    }

}
