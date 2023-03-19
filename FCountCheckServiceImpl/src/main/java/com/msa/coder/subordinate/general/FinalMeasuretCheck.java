package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class FinalMeasuretCheck {
    /**
    * object fields.
    */
    @Autowired
    private String result;

    @Autowired
    private String empId;

    @Autowired
    private String note;

    @Autowired
    private Object cdate;

    @Autowired
    private String orderId;

    @Autowired
    private String checkItem;

    @Autowired
    private String measureData;

    @Autowired
    private String fMeasureCheckId;

    /**
    * methods.
    */
    public void setfMeasureCheckId(String arg0) {
    // TODO
    }

    public String getEmpId() {
    // TODO
    }

    public Object getCdate() {
    // TODO
    }

    public String getCheckItem() {
    // TODO
    }

    public String getOrderId() {
    // TODO
    }

    public void setCdate(Object arg0) {
    // TODO
    }

    public void setMeasureData(String arg0) {
    // TODO
    }

    public void setOrderId(String arg0) {
    // TODO
    }

    public void setNote(String arg0) {
    // TODO
    }

    public String getNote() {
    // TODO
    }

    public String getResult() {
    // TODO
    }

    public String getfMeasureCheckId() {
    // TODO
    }

    public  FinalMeasuretCheck() {
    // TODO
    }

    public String getMeasureData() {
    // TODO
    }

    public void setCheckItem(String arg0) {
    // TODO
    }

    public void setResult(String arg0) {
    // TODO
    }

    public void setEmpId(String arg0) {
    // TODO
    }

}
