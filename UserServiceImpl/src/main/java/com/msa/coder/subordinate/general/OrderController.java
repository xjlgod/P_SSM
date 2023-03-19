package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class OrderController {
    /**
    * object fields.
    */
    @Autowired
    private OrderService orderService;

    /**
    * methods.
    */
    public COrderVO getItemById(String arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    public EUDataGridResult searchOrderByProductName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public  OrderController() {
    // TODO
    }

    private CustomResult updateNote(Object arg1, COrder arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, COrder arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, COrder arg0) {
    // TODO
    }

    public CustomResult changeStatus(Object arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public EUDataGridResult searchOrderByOrderId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public EUDataGridResult searchOrderByOrderCustom(String arg2, int arg1, int arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    private CustomResult updateAll(Object arg1, COrder arg0) {
    // TODO
    }

    public EUDataGridResult getList(COrderVO arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
