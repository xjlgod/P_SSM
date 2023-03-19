package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default SysUserMapper sysUserMapper;

    @Mock
    default SysUserRoleMapper sysUserRoleMapper;

    private UserServiceImpl UserServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        UserServiceImpl userServiceImplUnderTest = new UserServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testSearchUserByRoleName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = userServiceImplUnderTest.searchUserByRoleName(String arg2, int arg1, int arg0);
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
        CustomResult result = userServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchUserByUserId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = userServiceImplUnderTest.searchUserByUserId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUserServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = userServiceImplUnderTest.UserServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        SysUser arg0 = new SysUser();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = userServiceImplUnderTest.update(SysUser arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testChangeStatus() {
        // input param init
        Object arg0 = new Object();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = userServiceImplUnderTest.changeStatus(Object arg0);
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
        CustomResult result = userServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchSysUserBySysUserName() {
        // input param init
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.searchSysUserBySysUserName(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        SysUser arg2 = new SysUser();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = userServiceImplUnderTest.getList(SysUser arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        SysUser arg0 = new SysUser();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = userServiceImplUnderTest.insert(SysUser arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchUserByUserName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = userServiceImplUnderTest.searchUserByUserName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        SysUser arg0 = new SysUser();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = userServiceImplUnderTest.updateAll(SysUser arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        SysUser expectedResult = new SysUser();
        // Run the test
        SysUser result = userServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchSysUserBySysUserId() {
        // input param init
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.searchSysUserBySysUserId(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFindByUserNameAndId() {
        // input param init
        String arg1 = new String();
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.findByUserNameAndId(String arg1, String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testCreateCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.createCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAndUsernameEqualTo() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.andUsernameEqualTo();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsValid() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.isValid();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsNoValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.isNoValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsSingleValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.isSingleValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCondition() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getCondition();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchOrderByOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.searchOrderByOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnqualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getUnqualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetQualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getQualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getCheckNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSample() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getSample();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetfCountCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getfCountCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCheckNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setCheckNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetfCountCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setfCountCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetQualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setQualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSample() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setSample();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUnqualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.setUnqualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUsername() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getUsername();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetPassword() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getPassword();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetLocked() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getLocked();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRoleName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getRoleName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.getRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = userServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

