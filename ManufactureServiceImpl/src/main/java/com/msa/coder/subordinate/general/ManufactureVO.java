package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class ManufactureVO {
    /**
    * object fields.
    */
    @Autowired
    private Object beginDate;

    @Autowired
    private COrder cOrder;

    @Autowired
    private Object endDate;

    @Autowired
    private String manufactureSn;

    @Autowired
    private Technology technology;

    /**
    * not object fields.
    */
    private int launchQuantity;

    /**
    * methods.
    */
    public void setcOrder(COrder arg0) {
    // TODO
    }

    public Object getBeginDate() {
    // TODO
    }

    public void setTechnology(Technology arg0) {
    // TODO
    }

    public int getLaunchQuantity() {
    // TODO
    }

    public void setLaunchQuantity(int arg0) {
    // TODO
    }

    public  ManufactureVO() {
    // TODO
    }

    public String getManufactureSn() {
    // TODO
    }

    public void setManufactureSn(String arg0) {
    // TODO
    }

    public Object getEndDate() {
    // TODO
    }

    public COrder getcOrder() {
    // TODO
    }

    public void setBeginDate(Object arg0) {
    // TODO
    }

    public void setEndDate(Object arg0) {
    // TODO
    }

    public Technology getTechnology() {
    // TODO
    }

}
