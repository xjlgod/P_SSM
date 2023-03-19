package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class PermissionController {
    /**
    * object fields.
    */
    @Autowired
    private PermissionService permissionService;

    /**
    * methods.
    */
    private CustomResult delete(String arg0) {
    // TODO
    }

    public  PermissionController() {
    // TODO
    }

    private CustomResult updateAll(SysRolePermission arg0) {
    // TODO
    }

    private CustomResult insert(SysRolePermission arg0) {
    // TODO
    }

    private CustomResult updateByRoleId(String arg1, String arg0) {
    // TODO
    }

    public SysRolePermission getItemById(String arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    private CustomResult update(SysRolePermission arg0) {
    // TODO
    }

    public String find() {
    // TODO
    }

    public SysRolePermission getPermission(String arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public EUDataGridResult getItemList(SysRolePermission arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
