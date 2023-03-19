package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class DeviceServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default DeviceMapper deviceMapper;

    private DeviceServiceImpl DeviceServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        DeviceServiceImpl deviceServiceImplUnderTest = new DeviceServiceImpl();
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
        CustomResult result = deviceServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        Device arg2 = new Device();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceServiceImplUnderTest.getList(Device arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceByDeviceId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceServiceImplUnderTest.searchDeviceByDeviceId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceByDeviceName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceServiceImplUnderTest.searchDeviceByDeviceName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        Device arg0 = new Device();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceServiceImplUnderTest.update(Device arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceByDeviceTypeName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceServiceImplUnderTest.searchDeviceByDeviceTypeName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Device arg0 = new Device();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceServiceImplUnderTest.insert(Device arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        Device expectedResult = new Device();
        // Run the test
        Device result = deviceServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeviceServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = deviceServiceImplUnderTest.DeviceServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Device arg0 = new Device();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceServiceImplUnderTest.updateAll(Device arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        Device arg0 = new Device();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceServiceImplUnderTest.updateNote(Device arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyRequirementId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceServiceImplUnderTest.getTechnologyRequirementId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceServiceImplUnderTest.getTechnologyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRequirement() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceServiceImplUnderTest.getRequirement();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetAddTime() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceServiceImplUnderTest.getAddTime();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetReviseTime() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceServiceImplUnderTest.getReviseTime();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

