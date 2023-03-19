package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class MaterialConsumeVO {
    /**
    * object fields.
    */
    @Autowired
    private String consumeId;

    @Autowired
    private String note;

    @Autowired
    private Material material;

    @Autowired
    private String receiver;

    @Autowired
    private String sender;

    @Autowired
    private Work work;

    @Autowired
    private Object consumeDate;

    /**
    * not object fields.
    */
    private int consumeAmount;

    /**
    * methods.
    */
    public void setConsumeId(String arg0) {
    // TODO
    }

    public void setSender(String arg0) {
    // TODO
    }

    public Work getWork() {
    // TODO
    }

    public void setWork(Work arg0) {
    // TODO
    }

    public int getConsumeAmount() {
    // TODO
    }

    public void setMaterial(Material arg0) {
    // TODO
    }

    public Object getConsumeDate() {
    // TODO
    }

    public  MaterialConsumeVO() {
    // TODO
    }

    public String getReceiver() {
    // TODO
    }

    public String getConsumeId() {
    // TODO
    }

    public Material getMaterial() {
    // TODO
    }

    public String getSender() {
    // TODO
    }

    public void setNote(String arg0) {
    // TODO
    }

    public String getNote() {
    // TODO
    }

    public void setReceiver(String arg0) {
    // TODO
    }

    public void setConsumeAmount(int arg0) {
    // TODO
    }

    public void setConsumeDate(Object arg0) {
    // TODO
    }

}
