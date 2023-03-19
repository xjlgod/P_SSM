package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class UnqualifyServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default UnqualifyApplyMapper unqualifyApplyMapper;

    private UnqualifyServiceImpl UnqualifyServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        UnqualifyServiceImpl unqualifyServiceImplUnderTest = new UnqualifyServiceImpl();
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
        CustomResult result = unqualifyServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        UnqualifyApply arg2 = new UnqualifyApply();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = unqualifyServiceImplUnderTest.getList(UnqualifyApply arg2, int arg1, int arg0);
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
        CustomResult result = unqualifyServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        UnqualifyApply arg0 = new UnqualifyApply();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = unqualifyServiceImplUnderTest.insert(UnqualifyApply arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        UnqualifyApply expectedResult = new UnqualifyApply();
        // Run the test
        UnqualifyApply result = unqualifyServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchUnqualifyByUnqualifyId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = unqualifyServiceImplUnderTest.searchUnqualifyByUnqualifyId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        UnqualifyApply arg0 = new UnqualifyApply();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = unqualifyServiceImplUnderTest.update(UnqualifyApply arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        UnqualifyApply arg0 = new UnqualifyApply();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = unqualifyServiceImplUnderTest.updateNote(UnqualifyApply arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUnqualifyServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = unqualifyServiceImplUnderTest.UnqualifyServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchUnqualifyByProductName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = unqualifyServiceImplUnderTest.searchUnqualifyByProductName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        UnqualifyApply arg0 = new UnqualifyApply();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = unqualifyServiceImplUnderTest.updateAll(UnqualifyApply arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnqualifyApplyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getUnqualifyApplyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProductId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getProductId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnqualifyItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getUnqualifyItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnqualifyCount() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getUnqualifyCount();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetAssemblyDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getAssemblyDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetApplyDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getApplyDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProductName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getProductName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.getEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetApplyDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.setApplyDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetAssemblyDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.setAssemblyDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.setEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProductId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.setProductId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUnqualifyApplyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.setUnqualifyApplyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUnqualifyCount() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.setUnqualifyCount();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUnqualifyItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.setUnqualifyItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = unqualifyServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

