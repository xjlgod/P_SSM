package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class DeviceFaultServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default DeviceFaultMapper deviceFaultMapper;

    private DeviceFaultServiceImpl DeviceFaultServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        DeviceFaultServiceImpl deviceFaultServiceImplUnderTest = new DeviceFaultServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testDeviceFaultServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = deviceFaultServiceImplUnderTest.DeviceFaultServiceImpl();
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
        CustomResult result = deviceFaultServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        DeviceFault expectedResult = new DeviceFault();
        // Run the test
        DeviceFault result = deviceFaultServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        DeviceFault arg2 = new DeviceFault();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceFaultServiceImplUnderTest.getList(DeviceFault arg2, int arg1, int arg0);
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
        CustomResult result = deviceFaultServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceFaultByDeviceFaultId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceFaultServiceImplUnderTest.searchDeviceFaultByDeviceFaultId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceFaultByDeviceName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceFaultServiceImplUnderTest.searchDeviceFaultByDeviceName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        DeviceFault arg0 = new DeviceFault();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceFaultServiceImplUnderTest.update(DeviceFault arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        DeviceFault arg0 = new DeviceFault();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceFaultServiceImplUnderTest.updateAll(DeviceFault arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        DeviceFault arg0 = new DeviceFault();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceFaultServiceImplUnderTest.updateNote(DeviceFault arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceFaultServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        DeviceFault arg0 = new DeviceFault();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceFaultServiceImplUnderTest.insert(DeviceFault arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceFaultServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceByDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceFaultServiceImplUnderTest.searchDeviceByDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

