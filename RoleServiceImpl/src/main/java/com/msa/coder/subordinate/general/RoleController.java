package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class RoleController {
    /**
    * object fields.
    */
    @Autowired
    private RoleService roleService;

    /**
    * methods.
    */
    public RoleVO getItemById(String arg0) {
    // TODO
    }

    public EUDataGridResult searchRoleByRoleName(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, SysRole arg0) {
    // TODO
    }

    public EUDataGridResult searchRoleByRoleId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult update(SysRole arg0) {
    // TODO
    }

    public String permission() {
    // TODO
    }

    public  RoleController() {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public EUDataGridResult getItemList(RoleVO arg2, int arg1, int arg0) {
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

    private CustomResult updateAll(Object arg1, SysRole arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
