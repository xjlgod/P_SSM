package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class DeviceCheckServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default DeviceCheckMapper deviceCheckMapper;

    private DeviceCheckServiceImpl DeviceCheckServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        DeviceCheckServiceImpl deviceCheckServiceImplUnderTest = new DeviceCheckServiceImpl();
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
        CustomResult result = deviceCheckServiceImplUnderTest.deleteBatch(Object arg0);
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
        CustomResult result = deviceCheckServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        DeviceCheck arg0 = new DeviceCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceCheckServiceImplUnderTest.updateNote(DeviceCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        DeviceCheck arg0 = new DeviceCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceCheckServiceImplUnderTest.update(DeviceCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceCheckByDeviceCheckId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceCheckServiceImplUnderTest.searchDeviceCheckByDeviceCheckId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        DeviceCheck arg0 = new DeviceCheck();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceCheckServiceImplUnderTest.insert(DeviceCheck arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        DeviceCheck expectedResult = new DeviceCheck();
        // Run the test
        DeviceCheck result = deviceCheckServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeviceCheckServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = deviceCheckServiceImplUnderTest.DeviceCheckServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        DeviceCheck arg2 = new DeviceCheck();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceCheckServiceImplUnderTest.getList(DeviceCheck arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceCheckByDeviceName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceCheckServiceImplUnderTest.searchDeviceCheckByDeviceName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRows() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setRows();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetTotal() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setTotal();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTotal() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getTotal();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRows() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getRows();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetListType() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getListType();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceCheckEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceCheckEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceCheckDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceCheckDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceCheckResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceCheckResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceCheckFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceCheckFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceCheckEmp() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceCheckEmp();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceCheckDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceCheckDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceCheckEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceCheckEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceCheckFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceCheckFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceCheckResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceCheckResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultCause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceFaultCause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultDetail() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceFaultDetail();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceFaultDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultMaintenance() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceFaultMaintenance();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultCause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceFaultCause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultDetail() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceFaultDetail();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceFaultDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultMaintenance() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceFaultMaintenance();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.getDeviceName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.setDeviceName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.updateAll();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchFMeasureCheckByFMeasureCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceCheckServiceImplUnderTest.searchFMeasureCheckByFMeasureCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

