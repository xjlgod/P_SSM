package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class TechnologyPlanServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default TechnologyMapper technologyMapper;

    @Mock
    default TechnologyPlanMapper technologyPlanMapper;

    private TechnologyPlanServiceImpl TechnologyPlanServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        TechnologyPlanServiceImpl technologyPlanServiceImplUnderTest = new TechnologyPlanServiceImpl();
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
        CustomResult result = technologyPlanServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        TechnologyPlan expectedResult = new TechnologyPlan();
        // Run the test
        TechnologyPlan result = technologyPlanServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchTechnologyPlanByTechnologyName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = technologyPlanServiceImplUnderTest.searchTechnologyPlanByTechnologyName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchTechnologyPlanByTechnologyPlanId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = technologyPlanServiceImplUnderTest.searchTechnologyPlanByTechnologyPlanId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        TechnologyPlan arg2 = new TechnologyPlan();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = technologyPlanServiceImplUnderTest.getList(TechnologyPlan arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testTechnologyPlanServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = technologyPlanServiceImplUnderTest.TechnologyPlanServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        TechnologyPlan arg0 = new TechnologyPlan();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = technologyPlanServiceImplUnderTest.updateAll(TechnologyPlan arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        TechnologyPlan arg0 = new TechnologyPlan();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = technologyPlanServiceImplUnderTest.insert(TechnologyPlan arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyPlanId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getTechnologyPlanId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getTechnologyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetBatchAmount() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getBatchAmount();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStartPlan() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getStartPlan();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEndPlan() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getEndPlan();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCommitPlan() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getCommitPlan();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyPlanStart() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getTechnologyPlanStart();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyPlanEnd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getTechnologyPlanEnd();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.getTechnologyName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetBatchAmount() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.setBatchAmount();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCommitPlan() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.setCommitPlan();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEndPlan() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.setEndPlan();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetStartPlan() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.setStartPlan();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetTechnologyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.setTechnologyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetTechnologyPlanId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.setTechnologyPlanId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyPlanServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

