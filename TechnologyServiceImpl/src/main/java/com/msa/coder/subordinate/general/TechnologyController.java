package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class TechnologyController {
    /**
    * object fields.
    */
    @Autowired
    private TechnologyService technologyService;

    /**
    * methods.
    */
    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public Technology getItemById(String arg0) {
    // TODO
    }

    public EUDataGridResult searchTechnologyByTechnologyId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    private CustomResult insert(Object arg1, Technology arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Technology arg0) {
    // TODO
    }

    public  TechnologyController() {
    // TODO
    }

    public EUDataGridResult getItemList(Technology arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

    public EUDataGridResult searchTechnologyByTechnologyName(String arg2, int arg1, int arg0) {
    // TODO
    }

}
