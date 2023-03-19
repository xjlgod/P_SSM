package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class SysUserRole {
    /**
    * object fields.
    */
    @Autowired
    private String sysRoleId;

    @Autowired
    private String id;

    @Autowired
    private String sysUserId;

    /**
    * methods.
    */
    public void setSysRoleId(String arg0) {
    // TODO
    }

    public String getId() {
    // TODO
    }

    public void setSysUserId(String arg0) {
    // TODO
    }

    public  SysUserRole() {
    // TODO
    }

    public String getSysRoleId() {
    // TODO
    }

    public void setId(String arg0) {
    // TODO
    }

    public String getSysUserId() {
    // TODO
    }

}
