package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class COrderExample {
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
    public void setDistinct(boolean arg0) {
    // TODO
    }

    public void setOrderByClause(String arg0) {
    // TODO
    }

    public  COrderExample() {
    // TODO
    }

    public Object getOredCriteria() {
    // TODO
    }

    public void or(Object arg0) {
    // TODO
    }

    public String getOrderByClause() {
    // TODO
    }

    protected Object createCriteriaInternal() {
    // TODO
    }

    public void clear() {
    // TODO
    }

    public Object or() {
    // TODO
    }

    public Object createCriteria() {
    // TODO
    }

    public boolean isDistinct() {
    // TODO
    }

}
