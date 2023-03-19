package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class PMeasureCheckController {
    /**
    * object fields.
    */
    @Autowired
    private PMeasureCheckService pMeasureCheckService;

    /**
    * methods.
    */
    public COrderVO getItemById(String arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, ProcessMeasureCheck arg0) {
    // TODO
    }

    public EUDataGridResult searchOrderByOrderId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, ProcessMeasureCheck arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public EUDataGridResult getList(ProcessMeasureCheck arg2, int arg1, int arg0) {
    // TODO
    }

    public String find() {
    // TODO
    }

    private CustomResult updateAll(Object arg1, ProcessMeasureCheck arg0) {
    // TODO
    }

    public  PMeasureCheckController() {
    // TODO
    }

    public String add() {
    // TODO
    }

}
