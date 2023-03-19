package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class PermissionServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default SysRolePermissionMapper sysRolePermissionMapper;

    private PermissionServiceImpl PermissionServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        PermissionServiceImpl permissionServiceImplUnderTest = new PermissionServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testDelete() {
        // input param init
        String arg0 = new String();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = permissionServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        SysRolePermission arg0 = new SysRolePermission();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = permissionServiceImplUnderTest.updateAll(SysRolePermission arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetByRoleId() {
        // input param init
        String arg0 = new String();
        // expect result init
        SysRolePermission expectedResult = new SysRolePermission();
        // Run the test
        SysRolePermission result = permissionServiceImplUnderTest.getByRoleId(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        SysRolePermission arg0 = new SysRolePermission();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = permissionServiceImplUnderTest.insert(SysRolePermission arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateByRoleId() {
        // input param init
        String arg1 = new String();
        String arg0 = new String();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = permissionServiceImplUnderTest.updateByRoleId(String arg1, String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        SysRolePermission expectedResult = new SysRolePermission();
        // Run the test
        SysRolePermission result = permissionServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        SysRolePermission arg0 = new SysRolePermission();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = permissionServiceImplUnderTest.update(SysRolePermission arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        SysRolePermission arg2 = new SysRolePermission();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = permissionServiceImplUnderTest.getList(SysRolePermission arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testPermissionServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = permissionServiceImplUnderTest.PermissionServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnqualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getUnqualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetQualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getQualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getCheckNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSample() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getSample();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetpCountCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getpCountCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCheckNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setCheckNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetpCountCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setpCountCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetQualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setQualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSample() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setSample();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUnqualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setUnqualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSysRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setSysRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSysPermissionId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.setSysPermissionId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSysRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getSysRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSysPermissionId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = permissionServiceImplUnderTest.getSysPermissionId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

