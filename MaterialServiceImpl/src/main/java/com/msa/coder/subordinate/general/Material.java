package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Material {
    /**
    * object fields.
    */
    @Autowired
    private String note;

    @Autowired
    private String materialType;

    @Autowired
    private String materialId;

    @Autowired
    private String workId;

    @Autowired
    private String status;

    /**
    * not object fields.
    */
    private int remaining;

    /**
    * methods.
    */
    public void setRemaining(int arg0) {
    // TODO
    }

    public String getWorkId() {
    // TODO
    }

    public  Material() {
    // TODO
    }

    public String getMaterialId() {
    // TODO
    }

    public String getStatus() {
    // TODO
    }

    public void setStatus(String arg0) {
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

    public int getRemaining() {
    // TODO
    }

    public void setMaterialId(String arg0) {
    // TODO
    }

    public void setMaterialType(String arg0) {
    // TODO
    }

    public String getMaterialType() {
    // TODO
    }

}
