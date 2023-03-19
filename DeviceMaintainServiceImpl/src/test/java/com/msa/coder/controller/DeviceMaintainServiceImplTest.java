package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class DeviceMaintainServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default DeviceMaintainMapper deviceMaintainMapper;

    private DeviceMaintainServiceImpl DeviceMaintainServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        DeviceMaintainServiceImpl deviceMaintainServiceImplUnderTest = new DeviceMaintainServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testDeleteBatch() {
        // input param init
        Object arg0 = new Object();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceMaintainServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDelete() {
        // input param init
        String arg0 = new String();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceMaintainServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceMaintainByDeviceFaultId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceMaintainServiceImplUnderTest.searchDeviceMaintainByDeviceFaultId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeviceMaintainServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = deviceMaintainServiceImplUnderTest.DeviceMaintainServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        DeviceMaintain expectedResult = new DeviceMaintain();
        // Run the test
        DeviceMaintain result = deviceMaintainServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        DeviceMaintain arg0 = new DeviceMaintain();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceMaintainServiceImplUnderTest.insert(DeviceMaintain arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        DeviceMaintain arg0 = new DeviceMaintain();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceMaintainServiceImplUnderTest.updateNote(DeviceMaintain arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceMaintainByDeviceMaintainId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceMaintainServiceImplUnderTest.searchDeviceMaintainByDeviceMaintainId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        DeviceMaintain arg0 = new DeviceMaintain();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceMaintainServiceImplUnderTest.update(DeviceMaintain arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        DeviceMaintain arg2 = new DeviceMaintain();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceMaintainServiceImplUnderTest.getList(DeviceMaintain arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUsername() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setUsername();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetPassword() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setPassword();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetLocked() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setLocked();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetPassword() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getPassword();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUserid() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setUserid();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUsername() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getUsername();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUsername() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setUsername();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetLocked() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getLocked();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUserStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setUserStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRolename() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setRolename();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRoleStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setRoleStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUsername() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getUsername();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMenus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setMenus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUserid() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getUserid();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRolename() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getRolename();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getDeviceMaintainId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getDeviceFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getDeviceMaintainEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getDeviceMaintainDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getDeviceMaintainResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainCost() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getDeviceMaintainCost();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainEmp() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getDeviceMaintainEmp();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRoleName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.getRoleName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceMaintainServiceImplUnderTest.setRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

