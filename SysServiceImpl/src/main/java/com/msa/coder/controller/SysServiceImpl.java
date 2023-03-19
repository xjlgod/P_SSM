package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("SysServiceImpl")
public class SysServiceImpl {
    /**
    * object fields.
    */
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysPermissionMapperCustom sysPermissionMapperCustom;

    /**
    * interface methods in controller class, default query way is get.
    */
    @GetMapping("findPermissionListByUserId")
    public Object findPermissionListByUserId(String arg0) {
        // TODO
    }

    @GetMapping("getSysUserByName")
    public SysUser getSysUserByName(String arg0) {
        // TODO
    }

    @GetMapping("findMenuListByUserId")
    public Object findMenuListByUserId(String arg0) {
        // TODO
    }

    @GetMapping("SysServiceImpl")
    public  SysServiceImpl() {
        // TODO
    }

    @GetMapping("getPercode")
    public Object getPercode() {
        // TODO
    }

}
