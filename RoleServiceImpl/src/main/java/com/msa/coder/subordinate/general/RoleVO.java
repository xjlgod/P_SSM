package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class RoleVO {
    /**
    * object fields.
    */
    @Autowired
    private String roleId;

    @Autowired
    private String available;

    @Autowired
    private String roleName;

    /**
    * methods.
    */
    public String getRoleName() {
    // TODO
    }

    public  RoleVO() {
    // TODO
    }

    public void setRoleName(String arg0) {
    // TODO
    }

    public String getRoleId() {
    // TODO
    }

    public void setAvailable(String arg0) {
    // TODO
    }

    public void setRoleId(String arg0) {
    // TODO
    }

    public String getAvailable() {
    // TODO
    }

}
