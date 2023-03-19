package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class EmployeeController {
    /**
    * object fields.
    */
    @Autowired
    private EmployeeService employeeService;

    /**
    * methods.
    */
    private CustomResult delete(String arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, Employee arg0) {
    // TODO
    }

    public  EmployeeController() {
    // TODO
    }

    public EUDataGridResult searchEmployeeByEmployeeId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, Employee arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public EUDataGridResult getItemList(EmployeeVO arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchEmployeeByEmployeeName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Employee arg0) {
    // TODO
    }

    public EmployeeVO getItemById(String arg0) {
    // TODO
    }

    public EUDataGridResult searchEmployeeByDepartmentName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
