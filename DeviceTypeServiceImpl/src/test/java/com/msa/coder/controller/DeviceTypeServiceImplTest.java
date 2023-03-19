package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class DeviceTypeServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default DeviceTypeMapper deviceTypeMapper;

    private DeviceTypeServiceImpl DeviceTypeServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        DeviceTypeServiceImpl deviceTypeServiceImplUnderTest = new DeviceTypeServiceImpl();
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
        CustomResult result = deviceTypeServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceTypeByDeviceTypeId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceTypeServiceImplUnderTest.searchDeviceTypeByDeviceTypeId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeviceTypeServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = deviceTypeServiceImplUnderTest.DeviceTypeServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        DeviceType arg2 = new DeviceType();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceTypeServiceImplUnderTest.getList(DeviceType arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceTypeByDeviceTypeName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = deviceTypeServiceImplUnderTest.searchDeviceTypeByDeviceTypeName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        DeviceType arg0 = new DeviceType();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceTypeServiceImplUnderTest.insert(DeviceType arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        DeviceType arg0 = new DeviceType();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceTypeServiceImplUnderTest.update(DeviceType arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        DeviceType expectedResult = new DeviceType();
        // Run the test
        DeviceType result = deviceTypeServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        DeviceType arg0 = new DeviceType();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = deviceTypeServiceImplUnderTest.updateAll(DeviceType arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeviceList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.deviceList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeviceType() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.deviceType();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetListType() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getListType();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getDeviceTypeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getDeviceTypeName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeModel() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getDeviceTypeModel();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeSpec() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getDeviceTypeSpec();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeSupplier() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getDeviceTypeSupplier();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeProducer() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getDeviceTypeProducer();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getDeviceTypeQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeWarranty() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getDeviceTypeWarranty();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeIdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getDeviceTypeIdd();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeviceCheck() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.deviceCheck();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeviceFault() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.deviceFault();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeviceMaintain() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.deviceMaintain();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetConsumeDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getConsumeDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetConsumeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getConsumeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetConsumeAmount() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getConsumeAmount();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetReceiver() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getReceiver();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetWork() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getWork();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMaterial() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getMaterial();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSender() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.getSender();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetConsumeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.setConsumeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetConsumeAmount() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.setConsumeAmount();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetConsumeDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.setConsumeDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSender() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.setSender();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetReceiver() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.setReceiver();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetWork() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.setWork();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMaterial() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = deviceTypeServiceImplUnderTest.setMaterial();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

