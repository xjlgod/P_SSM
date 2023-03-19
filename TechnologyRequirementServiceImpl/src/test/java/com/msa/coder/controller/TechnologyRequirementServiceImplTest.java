package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class TechnologyRequirementServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default TechnologyMapper technologyMapper;

    @Mock
    default TechnologyRequirementMapper technologyRequirementMapper;

    private TechnologyRequirementServiceImpl TechnologyRequirementServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        TechnologyRequirementServiceImpl technologyRequirementServiceImplUnderTest = new TechnologyRequirementServiceImpl();
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
        CustomResult result = technologyRequirementServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchTechnologyRequirementByTechnologyRequirementId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = technologyRequirementServiceImplUnderTest.searchTechnologyRequirementByTechnologyRequirementId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testTechnologyRequirementServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = technologyRequirementServiceImplUnderTest.TechnologyRequirementServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateRequirement() {
        // input param init
        TechnologyRequirement arg0 = new TechnologyRequirement();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = technologyRequirementServiceImplUnderTest.updateRequirement(TechnologyRequirement arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        TechnologyRequirement arg0 = new TechnologyRequirement();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = technologyRequirementServiceImplUnderTest.insert(TechnologyRequirement arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        TechnologyRequirement arg0 = new TechnologyRequirement();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = technologyRequirementServiceImplUnderTest.updateAll(TechnologyRequirement arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        TechnologyRequirement expectedResult = new TechnologyRequirement();
        // Run the test
        TechnologyRequirement result = technologyRequirementServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        TechnologyRequirement arg2 = new TechnologyRequirement();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = technologyRequirementServiceImplUnderTest.getList(TechnologyRequirement arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchTechnologyRequirementByTechnologyName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = technologyRequirementServiceImplUnderTest.searchTechnologyRequirementByTechnologyName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyRequirementId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.getTechnologyRequirementId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.getTechnologyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRequirement() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.getRequirement();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetAddTime() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.getAddTime();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetReviseTime() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.getReviseTime();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.getTechnologyName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyRequirementServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

