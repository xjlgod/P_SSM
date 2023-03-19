package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class MaterialConsume {
    /**
    * object fields.
    */
    @Autowired
    private String consumeId;

    @Autowired
    private String note;

    @Autowired
    private String receiver;

    @Autowired
    private String sender;

    @Autowired
    private Object consumeDate;

    @Autowired
    private String materialId;

    @Autowired
    private String workId;

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

    public String getWorkId() {
    // TODO
    }

    public int getConsumeAmount() {
    // TODO
    }

    public  MaterialConsume() {
    // TODO
    }

    public Object getConsumeDate() {
    // TODO
    }

    public String getMaterialId() {
    // TODO
    }

    public String getReceiver() {
    // TODO
    }

    public String getConsumeId() {
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

    public void setWorkId(String arg0) {
    // TODO
    }

    public void setMaterialId(String arg0) {
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
