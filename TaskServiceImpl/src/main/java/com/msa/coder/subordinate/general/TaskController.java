package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class TaskController {
    /**
    * object fields.
    */
    @Autowired
    private TaskService taskService;

    /**
    * methods.
    */
    public Task getItemById(String arg0) {
    // TODO
    }

    public EUDataGridResult getItemList(Task arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    public EUDataGridResult searchTaskByTaskId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public  TaskController() {
    // TODO
    }

    public EUDataGridResult searchTaskByTaskManufactureSn(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, Task arg0) {
    // TODO
    }

    public EUDataGridResult searchTaskByTaskWorkId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Task arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    private CustomResult update(Object arg1, Task arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
