package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class TechnologyServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default TechnologyMapper technologyMapper;

    private TechnologyServiceImpl TechnologyServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        TechnologyServiceImpl technologyServiceImplUnderTest = new TechnologyServiceImpl();
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
        CustomResult result = technologyServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        Technology arg2 = new Technology();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = technologyServiceImplUnderTest.getList(Technology arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        Technology expectedResult = new Technology();
        // Run the test
        Technology result = technologyServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Technology arg0 = new Technology();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = technologyServiceImplUnderTest.updateAll(Technology arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchTechnologyByTechnologyId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = technologyServiceImplUnderTest.searchTechnologyByTechnologyId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testTechnologyServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = technologyServiceImplUnderTest.TechnologyServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Technology arg0 = new Technology();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = technologyServiceImplUnderTest.insert(Technology arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchTechnologyByTechnologyName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = technologyServiceImplUnderTest.searchTechnologyByTechnologyName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetTechnologyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setTechnologyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetTechnologyName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setTechnologyName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getTechnologyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getTechnologyName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetPrice() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getPrice();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetVitalProcessPeriod() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getVitalProcessPeriod();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStandardCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getStandardCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOvertimeStandardCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getOvertimeStandardCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOvertimeOverfulfilCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getOvertimeOverfulfilCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDoubleCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getDoubleCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOverfulfilCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getOverfulfilCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDoubleCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setDoubleCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOverfulfilCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setOverfulfilCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOvertimeOverfulfilCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setOvertimeOverfulfilCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOvertimeStandardCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setOvertimeStandardCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetPrice() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setPrice();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetStandardCapacity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setStandardCapacity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetVitalProcessPeriod() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setVitalProcessPeriod();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetConsumeAmount() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getConsumeAmount();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetConsumeAmount() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setConsumeAmount();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetConsumeDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getConsumeDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetConsumeDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setConsumeDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetConsumeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getConsumeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetConsumeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setConsumeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMaterialId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getMaterialId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMaterialId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setMaterialId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetReceiver() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getReceiver();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetReceiver() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setReceiver();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSender() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getSender();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSender() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setSender();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.setWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDepartmentByDepartmentId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = technologyServiceImplUnderTest.searchDepartmentByDepartmentId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

