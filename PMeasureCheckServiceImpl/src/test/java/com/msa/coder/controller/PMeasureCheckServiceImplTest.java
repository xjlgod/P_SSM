package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class PMeasureCheckServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default ProcessMeasureCheckMapper processMeasureCheckMapper;

    private PMeasureCheckServiceImpl PMeasureCheckServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        PMeasureCheckServiceImpl pMeasureCheckServiceImplUnderTest = new PMeasureCheckServiceImpl();
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
        CustomResult result = pMeasureCheckServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testPMeasureCheckServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = pMeasureCheckServiceImplUnderTest.PMeasureCheckServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        ProcessMeasureCheck arg2 = new ProcessMeasureCheck();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = pMeasureCheckServiceImplUnderTest.getList(ProcessMeasureCheck arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        ProcessMeasureCheck arg0 = new ProcessMeasureCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = pMeasureCheckServiceImplUnderTest.updateAll(ProcessMeasureCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        ProcessMeasureCheck arg0 = new ProcessMeasureCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = pMeasureCheckServiceImplUnderTest.insert(ProcessMeasureCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        ProcessMeasureCheck arg0 = new ProcessMeasureCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = pMeasureCheckServiceImplUnderTest.updateNote(ProcessMeasureCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchPMeasureCheckByPMeasureCheckId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = pMeasureCheckServiceImplUnderTest.searchPMeasureCheckByPMeasureCheckId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.getCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.setCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.getCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.setCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.setEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.getMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.setMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetpMeasureCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.getpMeasureCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetpMeasureCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.setpMeasureCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.getProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.setProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.getResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pMeasureCheckServiceImplUnderTest.setResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

