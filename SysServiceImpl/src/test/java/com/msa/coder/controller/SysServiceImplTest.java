package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class SysServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    private SysPermissionMapper sysPermissionMapper;

    @Mock
    private SysUserMapper sysUserMapper;

    @Mock
    private SysPermissionMapperCustom sysPermissionMapperCustom;

    private SysServiceImpl SysServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        SysServiceImpl sysServiceImplUnderTest = new SysServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testFindPermissionListByUserId() {
        // input param init
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = sysServiceImplUnderTest.findPermissionListByUserId(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSysUserByName() {
        // input param init
        String arg0 = new String();
        // expect result init
        SysUser expectedResult = new SysUser();
        // Run the test
        SysUser result = sysServiceImplUnderTest.getSysUserByName(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFindMenuListByUserId() {
        // input param init
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = sysServiceImplUnderTest.findMenuListByUserId(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSysServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = sysServiceImplUnderTest.SysServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetPercode() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = sysServiceImplUnderTest.getPercode();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

