package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class UserController {
    /**
    * object fields.
    */
    @Autowired
    private UserService userService;

    /**
    * methods.
    */
    public EUDataGridResult searchUserByRoleName(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, SysUser arg0) {
    // TODO
    }

    public EUDataGridResult searchUserByUserId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, SysUser arg0) {
    // TODO
    }

    public EUDataGridResult getList(SysUser arg2, int arg1, int arg0) {
    // TODO
    }

    public  UserController() {
    // TODO
    }

    public CustomResult changeStatus(Object arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public String userRole() {
    // TODO
    }

    public EUDataGridResult searchUserByUserName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public SysUser getItemById(String arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, SysUser arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
