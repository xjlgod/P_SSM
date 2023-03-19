package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class CustomController {
    /**
    * object fields.
    */
    @Autowired
    private CustomService customService;

    /**
    * methods.
    */
    public Custom getItemById(String arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Custom arg0) {
    // TODO
    }

    public EUDataGridResult getItemList(Custom arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchCustomByCustomName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchCustomByCustomId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public CustomResult changeStatus(Object arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, Custom arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    private CustomResult insert(Object arg1, Custom arg0) {
    // TODO
    }

    public  CustomController() {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    private CustomResult updateNote(Object arg1, Custom arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
