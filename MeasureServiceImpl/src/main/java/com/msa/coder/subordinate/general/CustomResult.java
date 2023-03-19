package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class CustomResult {
    /**
    * object fields.
    */
    @Autowired
    private String msg;

    @Autowired
    private Object data;

    @Autowired
    private Object MAPPER;

    /**
    * not object fields.
    */
    private int status;

    /**
    * methods.
    */
    public  CustomResult() {
    // TODO
    }

    public void setStatus(int arg0) {
    // TODO
    }

    public String getMsg() {
    // TODO
    }

    public void setData(Object arg0) {
    // TODO
    }

    public  CustomResult(Object arg0) {
    // TODO
    }

    public CustomResult format(String arg0) {
    // TODO
    }

    public CustomResult formatToList(Object arg1, String arg0) {
    // TODO
    }

    public int getStatus() {
    // TODO
    }

    public CustomResult build(String arg1, int arg0) {
    // TODO
    }

    public CustomResult ok() {
    // TODO
    }

    public CustomResult ok(Object arg0) {
    // TODO
    }

    public CustomResult formatToPojo(Object arg1, String arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public  CustomResult(Object arg2, String arg1, int arg0) {
    // TODO
    }

    public void setMsg(String arg0) {
    // TODO
    }

    public CustomResult build(Object arg2, String arg1, int arg0) {
    // TODO
    }

}
