package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class ManufactureController {
    /**
    * object fields.
    */
    @Autowired
    private ManufactureService manufactureService;

    /**
    * methods.
    */
    private CustomResult delete(String arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Manufacture arg0) {
    // TODO
    }

    public ManufactureVO getItemById(String arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, Manufacture arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, Manufacture arg0) {
    // TODO
    }

    public EUDataGridResult getList(int arg1, int arg0) {
    // TODO
    }

    public  ManufactureController() {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public EUDataGridResult searchManufactureByManufactureTechnologyName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public EUDataGridResult searchManufactureByManufactureOrderId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public EUDataGridResult searchManufactureByManufactureSn(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
