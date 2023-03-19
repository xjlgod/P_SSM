package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class MaterialReceive {
    /**
    * object fields.
    */
    @Autowired
    private String note;

    @Autowired
    private String receiver;

    @Autowired
    private String sender;

    @Autowired
    private Object receiveDate;

    @Autowired
    private String materialId;

    @Autowired
    private String receiveId;

    /**
    * not object fields.
    */
    private int amount;

    /**
    * methods.
    */
    public void setReceiveDate(Object arg0) {
    // TODO
    }

    public void setSender(String arg0) {
    // TODO
    }

    public int getAmount() {
    // TODO
    }

    public String getreceiver() {
    // TODO
    }

    public void setreceiver(String arg0) {
    // TODO
    }

    public String getMaterialId() {
    // TODO
    }

    public void setReceiveId(String arg0) {
    // TODO
    }

    public String getSender() {
    // TODO
    }

    public void setAmount(int arg0) {
    // TODO
    }

    public void setNote(String arg0) {
    // TODO
    }

    public String getNote() {
    // TODO
    }

    public void setMaterialId(String arg0) {
    // TODO
    }

    public  MaterialReceive() {
    // TODO
    }

    public String getReceiveId() {
    // TODO
    }

    public Object getReceiveDate() {
    // TODO
    }

}
