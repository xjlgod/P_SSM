package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class DepartmentController {
    /**
    * object fields.
    */
    @Autowired
    private DepartmentService departmentService;

    /**
    * methods.
    */
    public EUDataGridResult getItemList(Department arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    public Department getItemById(String arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, Department arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Department arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, Department arg0) {
    // TODO
    }

    public EUDataGridResult searchDepartmentByDepartmentId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public  DepartmentController() {
    // TODO
    }

    private CustomResult update(Object arg1, Department arg0) {
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

    public Object getData() {
    // TODO
    }

    public EUDataGridResult searchDepartmentByDepartmentName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
