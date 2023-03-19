package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class FCountCheckServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default FinalCountCheckMapper finalCountCheckMapper;

    private FCountCheckServiceImpl FCountCheckServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        FCountCheckServiceImpl fCountCheckServiceImplUnderTest = new FCountCheckServiceImpl();
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
        CustomResult result = fCountCheckServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        FinalCountCheck arg0 = new FinalCountCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = fCountCheckServiceImplUnderTest.updateAll(FinalCountCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        FinalCountCheck expectedResult = new FinalCountCheck();
        // Run the test
        FinalCountCheck result = fCountCheckServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchFCountCheckByFCountCheckId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = fCountCheckServiceImplUnderTest.searchFCountCheckByFCountCheckId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        FinalCountCheck arg2 = new FinalCountCheck();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = fCountCheckServiceImplUnderTest.getList(FinalCountCheck arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        FinalCountCheck arg0 = new FinalCountCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = fCountCheckServiceImplUnderTest.updateNote(FinalCountCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        FinalCountCheck arg0 = new FinalCountCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = fCountCheckServiceImplUnderTest.insert(FinalCountCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFCountCheckServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = fCountCheckServiceImplUnderTest.FCountCheckServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchFCountCheckByOrderId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = fCountCheckServiceImplUnderTest.searchFCountCheckByOrderId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.getOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.getCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.getMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.getResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.getCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetfMeasureCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.getfMeasureCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.setCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.setCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.setEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetfMeasureCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.setfMeasureCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.setMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.setOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fCountCheckServiceImplUnderTest.setResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

