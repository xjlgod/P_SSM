package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class WorkController {
    /**
    * object fields.
    */
    @Autowired
    private WorkService workService;

    /**
    * methods.
    */
    private CustomResult delete(String arg0) {
    // TODO
    }

    public EUDataGridResult getItemList(WorkVO arg2, int arg1, int arg0) {
    // TODO
    }

    public WorkVO getItemById(String arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public EUDataGridResult searchWorkByWorkProcess(String arg2, int arg1, int arg0) {
    // TODO
    }

    public  WorkController() {
    // TODO
    }

    public EUDataGridResult searchWorkByWorkId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, Work arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Work arg0) {
    // TODO
    }

    public String find() {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public EUDataGridResult searchWorkByWorkProduct(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, Work arg0) {
    // TODO
    }

    public EUDataGridResult searchWorkByWorkDevice(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
