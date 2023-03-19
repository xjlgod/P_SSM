package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class ProcessController {
    /**
    * object fields.
    */
    @Autowired
    private ProcessService processService;

    /**
    * methods.
    */
    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Process arg0) {
    // TODO
    }

    public EUDataGridResult searchProcessByProcessId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchProcessByTechnologyPlanId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public EUDataGridResult getItemList(Process arg2, int arg1, int arg0) {
    // TODO
    }

    public Process getItemById(String arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    private CustomResult insert(Object arg1, Process arg0) {
    // TODO
    }

    public  ProcessController() {
    // TODO
    }

    public String add() {
    // TODO
    }

}
