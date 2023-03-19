package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class RoleServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default SysRoleMapper sysRoleMapper;

    @Mock
    default SysRolePermissionMapper sysRolePermissionMapper;

    @Mock
    default SysUserRoleMapper sysUserRoleMapper;

    private RoleServiceImpl RoleServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        RoleServiceImpl roleServiceImplUnderTest = new RoleServiceImpl();
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
        CustomResult result = roleServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchRoleByRoleName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = roleServiceImplUnderTest.searchRoleByRoleName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchRoleByRoleId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = roleServiceImplUnderTest.searchRoleByRoleId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        SysRole arg0 = new SysRole();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = roleServiceImplUnderTest.update(SysRole arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFindRoleByUserId() {
        // input param init
        String arg0 = new String();
        // expect result init
        RoleVO expectedResult = new RoleVO();
        // Run the test
        RoleVO result = roleServiceImplUnderTest.findRoleByUserId(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        RoleVO arg2 = new RoleVO();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = roleServiceImplUnderTest.getList(RoleVO arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeleteBatch() {
        // input param init
        Object arg0 = new Object();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = roleServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        SysRole arg0 = new SysRole();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = roleServiceImplUnderTest.updateAll(SysRole arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        RoleVO expectedResult = new RoleVO();
        // Run the test
        RoleVO result = roleServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        SysRole arg0 = new SysRole();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = roleServiceImplUnderTest.insert(SysRole arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchSysRoleBySysRoleName() {
        // input param init
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.searchSysRoleBySysRoleName(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testRoleServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = roleServiceImplUnderTest.RoleServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFindByRoleNameAndId() {
        // input param init
        String arg1 = new String();
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.findByRoleNameAndId(String arg1, String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchSysRoleBySysRoleId() {
        // input param init
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.searchSysRoleBySysRoleId(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRoleName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getRoleName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetAvailable() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getAvailable();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testCreateCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.createCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAndIdIn() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.andIdIn();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsValid() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.isValid();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsNoValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.isNoValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsSingleValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.isSingleValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsBetweenValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.isBetweenValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsListValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.isListValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCondition() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getCondition();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProcessNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setProcessNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRating() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setRating();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProduct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getProduct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProduct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setProduct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProcess() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getProcess();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProcess() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setProcess();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDevice() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getDevice();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDevice() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setDevice();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProcessNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getProcessNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRating() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getRating();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProcessNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getProcessNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProcessNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setProcessNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProductId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getProductId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProductId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setProductId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRating() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getRating();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRating() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setRating();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.setWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchpCountCheckBypCountCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.searchpCountCheckBypCountCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = roleServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

