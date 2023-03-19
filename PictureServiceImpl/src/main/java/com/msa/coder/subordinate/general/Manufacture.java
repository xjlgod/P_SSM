package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Manufacture {
    /**
    * object fields.
    */
    @Autowired
    private Object beginDate;

    @Autowired
    private Object endDate;

    @Autowired
    private String orderId;

    @Autowired
    private String manufactureSn;

    @Autowired
    private String technologyId;

    /**
    * not object fields.
    */
    private int launchQuantity;

    /**
    * methods.
    */
    public Object getBeginDate() {
    // TODO
    }

    public void setTechnologyId(String arg0) {
    // TODO
    }

    public  Manufacture() {
    // TODO
    }

    public int getLaunchQuantity() {
    // TODO
    }

    public void setLaunchQuantity(int arg0) {
    // TODO
    }

    public String getTechnologyId() {
    // TODO
    }

    public String getManufactureSn() {
    // TODO
    }

    public String getOrderId() {
    // TODO
    }

    public void setManufactureSn(String arg0) {
    // TODO
    }

    public void setOrderId(String arg0) {
    // TODO
    }

    public Object getEndDate() {
    // TODO
    }

    public void setBeginDate(Object arg0) {
    // TODO
    }

    public void setEndDate(Object arg0) {
    // TODO
    }

}
