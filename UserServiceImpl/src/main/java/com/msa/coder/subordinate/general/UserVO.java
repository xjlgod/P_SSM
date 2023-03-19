package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class UserVO {
    /**
    * object fields.
    */
    @Autowired
    private String password;

    @Autowired
    private String roleId;

    @Autowired
    private String roleName;

    @Autowired
    private String id;

    @Autowired
    private String locked;

    @Autowired
    private String username;

    /**
    * methods.
    */
    public String getUsername() {
    // TODO
    }

    public void setLocked(String arg0) {
    // TODO
    }

    public void setPassword(String arg0) {
    // TODO
    }

    public String getRoleName() {
    // TODO
    }

    public void setUsername(String arg0) {
    // TODO
    }

    public String getId() {
    // TODO
    }

    public void setRoleName(String arg0) {
    // TODO
    }

    public void setId(String arg0) {
    // TODO
    }

    public String getLocked() {
    // TODO
    }

    public String getRoleId() {
    // TODO
    }

    public void setRoleId(String arg0) {
    // TODO
    }

    public String getPassword() {
    // TODO
    }

    public  UserVO() {
    // TODO
    }

}
