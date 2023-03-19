package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class MeasureServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default FinalMeasuretCheckMapper finalMeasuretCheckMapper;

    private MeasureServiceImpl MeasureServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        MeasureServiceImpl measureServiceImplUnderTest = new MeasureServiceImpl();
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
        CustomResult result = measureServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchFMeasureCheckByOrderId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = measureServiceImplUnderTest.searchFMeasureCheckByOrderId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        FinalMeasuretCheck arg2 = new FinalMeasuretCheck();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = measureServiceImplUnderTest.getList(FinalMeasuretCheck arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testMeasureServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = measureServiceImplUnderTest.MeasureServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        FinalMeasuretCheck arg0 = new FinalMeasuretCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = measureServiceImplUnderTest.updateAll(FinalMeasuretCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        FinalMeasuretCheck arg0 = new FinalMeasuretCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = measureServiceImplUnderTest.updateNote(FinalMeasuretCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        FinalMeasuretCheck arg0 = new FinalMeasuretCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = measureServiceImplUnderTest.insert(FinalMeasuretCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        FinalMeasuretCheck expectedResult = new FinalMeasuretCheck();
        // Run the test
        FinalMeasuretCheck result = measureServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchFMeasureCheckByFMeasureCheckId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = measureServiceImplUnderTest.searchFMeasureCheckByFMeasureCheckId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testOk() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.ok();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMsg() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getMsg();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.setDeviceTypeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.setDeviceTypeName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getDeviceTypeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getDeviceTypeName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeModel() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getDeviceTypeModel();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeSpec() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getDeviceTypeSpec();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeSupplier() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getDeviceTypeSupplier();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeProducer() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getDeviceTypeProducer();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getDeviceTypeQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeWarranty() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getDeviceTypeWarranty();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testBuild() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.build();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeModel() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.setDeviceTypeModel();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeProducer() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.setDeviceTypeProducer();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.setDeviceTypeQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeSpec() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.setDeviceTypeSpec();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeSupplier() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.setDeviceTypeSupplier();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeWarranty() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.setDeviceTypeWarranty();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetfMeasureCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getfMeasureCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = measureServiceImplUnderTest.getEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

