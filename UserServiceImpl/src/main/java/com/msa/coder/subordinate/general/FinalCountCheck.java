package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class FinalCountCheck {
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
    private Object qualify;

    @Autowired
    private String fCountCheckId;

    /**
    * not object fields.
    */
    private int checkNumber;

    private int unqualify;

    private int sample;

    /**
    * methods.
    */
    public String getEmpId() {
    // TODO
    }

    public void setCheckNumber(int arg0) {
    // TODO
    }

    public void setSample(int arg0) {
    // TODO
    }

    public String getOrderId() {
    // TODO
    }

    public  FinalCountCheck() {
    // TODO
    }

    public int getSample() {
    // TODO
    }

    public void setfCountCheckId(String arg0) {
    // TODO
    }

    public void setMeasureData(String arg0) {
    // TODO
    }

    public void setOrderId(String arg0) {
    // TODO
    }

    public void setQualify(Object arg0) {
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

    public String getMeasureData() {
    // TODO
    }

    public void setResult(String arg0) {
    // TODO
    }

    public Object getCdate() {
    // TODO
    }

    public void setUnqualify(int arg0) {
    // TODO
    }

    public String getCheckItem() {
    // TODO
    }

    public Object getQualify() {
    // TODO
    }

    public int getUnqualify() {
    // TODO
    }

    public String getfCountCheckId() {
    // TODO
    }

    public void setCdate(Object arg0) {
    // TODO
    }

    public int getCheckNumber() {
    // TODO
    }

    public void setCheckItem(String arg0) {
    // TODO
    }

    public void setEmpId(String arg0) {
    // TODO
    }

}
