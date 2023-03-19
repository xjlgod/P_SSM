package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class ProductExample {
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

    public Object getOredCriteria() {
    // TODO
    }

    protected Object createCriteriaInternal() {
    // TODO
    }

    public String getOrderByClause() {
    // TODO
    }

    public void or(Object arg0) {
    // TODO
    }

    public  ProductExample() {
    // TODO
    }

    public Object createCriteria() {
    // TODO
    }

    public void clear() {
    // TODO
    }

    public boolean isDistinct() {
    // TODO
    }

    public Object or() {
    // TODO
    }

}
