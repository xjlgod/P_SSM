package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class ProcessServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default ProcessMapper processMapper;

    @Mock
    default TechnologyPlanMapper technologyPlanMapper;

    private ProcessServiceImpl ProcessServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        ProcessServiceImpl processServiceImplUnderTest = new ProcessServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testProcessServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = processServiceImplUnderTest.ProcessServiceImpl();
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
        CustomResult result = processServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        Process arg2 = new Process();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = processServiceImplUnderTest.getList(Process arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchProcessByProcessId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = processServiceImplUnderTest.searchProcessByProcessId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchProcessByTechnologyPlanId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = processServiceImplUnderTest.searchProcessByTechnologyPlanId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        Process expectedResult = new Process();
        // Run the test
        Process result = processServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Process arg0 = new Process();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = processServiceImplUnderTest.insert(Process arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Process arg0 = new Process();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = processServiceImplUnderTest.updateAll(Process arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = processServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testConvert() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = processServiceImplUnderTest.convert();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDoGetAuthenticationInfo() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = processServiceImplUnderTest.doGetAuthenticationInfo();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = processServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = processServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = processServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = processServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchEmployeeByEmployeeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = processServiceImplUnderTest.searchEmployeeByEmployeeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetPermission() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = processServiceImplUnderTest.getPermission();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

