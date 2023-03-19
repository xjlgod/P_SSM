package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class UnqualifyApply {
    /**
    * object fields.
    */
    @Autowired
    private String empId;

    @Autowired
    private String note;

    @Autowired
    private String unqualifyApplyId;

    @Autowired
    private String productId;

    @Autowired
    private Object assemblyDate;

    @Autowired
    private String unqualifyItem;

    @Autowired
    private Object applyDate;

    /**
    * not object fields.
    */
    private int unqualifyCount;

    /**
    * methods.
    */
    public String getEmpId() {
    // TODO
    }

    public String getUnqualifyApplyId() {
    // TODO
    }

    public void setAssemblyDate(Object arg0) {
    // TODO
    }

    public Object getAssemblyDate() {
    // TODO
    }

    public String getUnqualifyItem() {
    // TODO
    }

    public void setNote(String arg0) {
    // TODO
    }

    public String getNote() {
    // TODO
    }

    public void setUnqualifyCount(int arg0) {
    // TODO
    }

    public  UnqualifyApply() {
    // TODO
    }

    public Object getApplyDate() {
    // TODO
    }

    public int getUnqualifyCount() {
    // TODO
    }

    public void setApplyDate(Object arg0) {
    // TODO
    }

    public void setUnqualifyApplyId(String arg0) {
    // TODO
    }

    public String getProductId() {
    // TODO
    }

    public void setEmpId(String arg0) {
    // TODO
    }

    public void setProductId(String arg0) {
    // TODO
    }

    public void setUnqualifyItem(String arg0) {
    // TODO
    }

}
