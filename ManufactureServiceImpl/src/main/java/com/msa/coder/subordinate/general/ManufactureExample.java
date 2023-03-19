package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class ManufactureExample {
    /**
    * object fields.
    */
    @Autowired
    protected Object oredCriteria;

    @Autowired
    protected String orderByClause;

    /**
    * not object fields.
    */
    protected boolean distinct;

    /**
    * methods.
    */
    protected Object createCriteriaInternal() {
    // TODO
    }

    public Object or() {
    // TODO
    }

    public void or(Object arg0) {
    // TODO
    }

    public void setDistinct(boolean arg0) {
    // TODO
    }

    public void setOrderByClause(String arg0) {
    // TODO
    }

    public Object getOredCriteria() {
    // TODO
    }

    public  ManufactureExample() {
    // TODO
    }

    public Object createCriteria() {
    // TODO
    }

    public String getOrderByClause() {
    // TODO
    }

    public void clear() {
    // TODO
    }

    public boolean isDistinct() {
    // TODO
    }

}
