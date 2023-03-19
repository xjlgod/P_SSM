package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Custom {
    /**
    * object fields.
    */
    @Autowired
    private String note;

    @Autowired
    private String address;

    @Autowired
    private String ownerName;

    @Autowired
    private String fullName;

    @Autowired
    private String ownerTel;

    @Autowired
    private String customName;

    @Autowired
    private String fax;

    @Autowired
    private String customId;

    @Autowired
    private String email;

    /**
    * not object fields.
    */
    private int status;

    /**
    * methods.
    */
    public void setOwnerTel(String arg0) {
    // TODO
    }

    public void setOwnerName(String arg0) {
    // TODO
    }

    public void setStatus(int arg0) {
    // TODO
    }

    public String getEmail() {
    // TODO
    }

    public String getOwnerName() {
    // TODO
    }

    public  Custom() {
    // TODO
    }

    public String getAddress() {
    // TODO
    }

    public String getFax() {
    // TODO
    }

    public int getStatus() {
    // TODO
    }

    public void setCustomName(String arg0) {
    // TODO
    }

    public String getFullName() {
    // TODO
    }

    public void setNote(String arg0) {
    // TODO
    }

    public String getNote() {
    // TODO
    }

    public void setAddress(String arg0) {
    // TODO
    }

    public void setCustomId(String arg0) {
    // TODO
    }

    public String getCustomId() {
    // TODO
    }

    public String getOwnerTel() {
    // TODO
    }

    public void setFullName(String arg0) {
    // TODO
    }

    public void setFax(String arg0) {
    // TODO
    }

    public String getCustomName() {
    // TODO
    }

    public void setEmail(String arg0) {
    // TODO
    }

}
