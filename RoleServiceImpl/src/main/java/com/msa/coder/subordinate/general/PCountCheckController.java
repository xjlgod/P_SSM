package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class PCountCheckController {
    /**
    * object fields.
    */
    @Autowired
    private PCountCheckService pCountCheckService;

    /**
    * methods.
    */
    public COrderVO getItemById(String arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, ProcessCountCheck arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, ProcessCountCheck arg0) {
    // TODO
    }

    public  PCountCheckController() {
    // TODO
    }

    public CustomResult changeStatus(Object arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, ProcessCountCheck arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public EUDataGridResult searchpCountCheckBypCountCheckId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String find() {
    // TODO
    }

    private CustomResult update(Object arg1, ProcessCountCheck arg0) {
    // TODO
    }

    public EUDataGridResult getList(ProcessCountCheck arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
