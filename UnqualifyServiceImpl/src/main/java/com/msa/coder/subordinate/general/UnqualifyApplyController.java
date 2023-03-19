package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class UnqualifyApplyController {
    /**
    * object fields.
    */
    @Autowired
    private UnqualifyService unqualifyService;

    /**
    * methods.
    */
    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public EUDataGridResult searchUnqualifyByUnqualifyId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, UnqualifyApply arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public EUDataGridResult getItemList(UnqualifyApply arg2, int arg1, int arg0) {
    // TODO
    }

    public  UnqualifyApplyController() {
    // TODO
    }

    private CustomResult updateAll(Object arg1, UnqualifyApply arg0) {
    // TODO
    }

    public EUDataGridResult searchUnqualifyByProductName(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, UnqualifyApply arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
