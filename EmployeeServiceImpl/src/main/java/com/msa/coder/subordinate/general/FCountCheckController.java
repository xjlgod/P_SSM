package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class FCountCheckController {
    /**
    * object fields.
    */
    @Autowired
    private FCountCheckService fCountCheckService;

    /**
    * methods.
    */
    private CustomResult insert(Object arg1, FinalCountCheck arg0) {
    // TODO
    }

    public  FCountCheckController() {
    // TODO
    }

    public EUDataGridResult getItemList(FinalCountCheck arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, FinalCountCheck arg0) {
    // TODO
    }

    public EUDataGridResult searchFCountCheckByOrderId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public EUDataGridResult searchFCountCheckByFCountCheckId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, FinalCountCheck arg0) {
    // TODO
    }

    public FinalCountCheck getItemById(String arg0) {
    // TODO
    }

    public void InitBinder(Object arg1, Object arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
