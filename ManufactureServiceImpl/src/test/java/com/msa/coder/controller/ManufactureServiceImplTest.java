package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class ManufactureServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default ManufactureMapper manufactureMapper;

    private ManufactureServiceImpl ManufactureServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        ManufactureServiceImpl manufactureServiceImplUnderTest = new ManufactureServiceImpl();
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
        CustomResult result = manufactureServiceImplUnderTest.deleteBatch(Object arg0);
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
        CustomResult result = manufactureServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = manufactureServiceImplUnderTest.getList(int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Manufacture arg0 = new Manufacture();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = manufactureServiceImplUnderTest.insert(Manufacture arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchManufactureByManufactureTechnologyName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = manufactureServiceImplUnderTest.searchManufactureByManufactureTechnologyName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testManufactureServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = manufactureServiceImplUnderTest.ManufactureServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        Manufacture arg0 = new Manufacture();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = manufactureServiceImplUnderTest.update(Manufacture arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Manufacture arg0 = new Manufacture();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = manufactureServiceImplUnderTest.updateAll(Manufacture arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchManufactureByManufactureOrderId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = manufactureServiceImplUnderTest.searchManufactureByManufactureOrderId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchManufactureByManufactureSn() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = manufactureServiceImplUnderTest.searchManufactureByManufactureSn(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        ManufactureVO expectedResult = new ManufactureVO();
        // Run the test
        ManufactureVO result = manufactureServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetManufactureSn() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.getManufactureSn();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetLaunchQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.getLaunchQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetBeginDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.getBeginDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEndDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.getEndDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetcOrder() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.getcOrder();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnology() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.getTechnology();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = manufactureServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

