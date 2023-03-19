package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class PCountCheckServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default ProcessCountCheckMapper processCountCheckMapper;

    private PCountCheckServiceImpl PCountCheckServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        PCountCheckServiceImpl pCountCheckServiceImplUnderTest = new PCountCheckServiceImpl();
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
        CustomResult result = pCountCheckServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchPCountCheckByPCountCheckId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = pCountCheckServiceImplUnderTest.searchPCountCheckByPCountCheckId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        ProcessCountCheck arg0 = new ProcessCountCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = pCountCheckServiceImplUnderTest.insert(ProcessCountCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testPCountCheckServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = pCountCheckServiceImplUnderTest.PCountCheckServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        ProcessCountCheck arg0 = new ProcessCountCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = pCountCheckServiceImplUnderTest.updateAll(ProcessCountCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        ProcessCountCheck arg0 = new ProcessCountCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = pCountCheckServiceImplUnderTest.updateNote(ProcessCountCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        ProcessCountCheck arg2 = new ProcessCountCheck();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = pCountCheckServiceImplUnderTest.getList(ProcessCountCheck arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetfCountCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setfCountCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSample() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setSample();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCheckNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setCheckNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUnqualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setUnqualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetQualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setQualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetfCountCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getfCountCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSample() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getSample();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getCheckNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnqualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getUnqualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetQualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getQualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetpCountCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getpCountCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSample() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getSample();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckNumber() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getCheckNumber();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnqualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getUnqualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetQualify() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getQualify();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pCountCheckServiceImplUnderTest.getEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

