package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class ActiveUser {
    /**
    * object fields.
    */
    @Autowired
    private String userStatus;

    @Autowired
    private SysPermission permissions;

    @Autowired
    private String rolename;

    @Autowired
    private SysPermission menus;

    @Autowired
    private String userid;

    @Autowired
    private String roleStatus;

    @Autowired
    private String username;

    /**
    * not object fields.
    */
    private long serialVersionUID;

    /**
    * methods.
    */
    public String getUsername() {
    // TODO
    }

    public void setUsername(String arg0) {
    // TODO
    }

    public String getUserid() {
    // TODO
    }

    public  ActiveUser() {
    // TODO
    }

    public Object getMenus() {
    // TODO
    }

    public String getRoleStatus() {
    // TODO
    }

    public String getUserStatus() {
    // TODO
    }

    public void setPermissions(SysPermission arg0) {
    // TODO
    }

    public void setRolename(String arg0) {
    // TODO
    }

    public void setMenus(SysPermission arg0) {
    // TODO
    }

    public void setRoleStatus(String arg0) {
    // TODO
    }

    public void setUserStatus(String arg0) {
    // TODO
    }

    public Object getPermissions() {
    // TODO
    }

    public void setUserid(String arg0) {
    // TODO
    }

    public String getRolename() {
    // TODO
    }

}
