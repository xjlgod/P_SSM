package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class MaterialReceiveVO {
    /**
    * object fields.
    */
    @Autowired
    private String note;

    @Autowired
    private Material material;

    @Autowired
    private String receiver;

    @Autowired
    private String sender;

    @Autowired
    private Object receiveDate;

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

    public void setMaterial(Material arg0) {
    // TODO
    }

    public String getreceiver() {
    // TODO
    }

    public void setreceiver(String arg0) {
    // TODO
    }

    public  MaterialReceiveVO() {
    // TODO
    }

    public Material getMaterial() {
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

    public String getReceiveId() {
    // TODO
    }

    public Object getReceiveDate() {
    // TODO
    }

}
