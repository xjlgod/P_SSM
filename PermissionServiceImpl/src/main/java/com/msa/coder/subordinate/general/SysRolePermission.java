package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class SysRolePermission {
    /**
    * object fields.
    */
    @Autowired
    private String sysPermissionId;

    @Autowired
    private String sysRoleId;

    @Autowired
    private String id;

    /**
    * methods.
    */
    public void setSysRoleId(String arg0) {
    // TODO
    }

    public void setSysPermissionId(String arg0) {
    // TODO
    }

    public String getId() {
    // TODO
    }

    public  SysRolePermission() {
    // TODO
    }

    public String getSysPermissionId() {
    // TODO
    }

    public String getSysRoleId() {
    // TODO
    }

    public void setId(String arg0) {
    // TODO
    }

}
