package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class FileServiceImplTest {
    private FileServiceImpl FileServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        FileServiceImpl fileServiceImplUnderTest = new FileServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testFileServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = fileServiceImplUnderTest.FileServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUploadFile() {
        // input param init
        Object arg0 = new Object();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.uploadFile(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeleteFile() {
        // input param init
        String arg0 = new String();
        // expect result init
        boolean expectedResult = new boolean();
        // Run the test
        boolean result = fileServiceImplUnderTest.deleteFile(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFirst() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.first();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSysUserId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setSysUserId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSysRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setSysRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSysRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getSysRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testHome() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.home();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDeviceName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceTypeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceStatusId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceStatusId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDevicePurchaseDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDevicePurchaseDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDevicePurchasePrice() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDevicePurchasePrice();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceManufactureDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceManufactureDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceServiceLife() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceServiceLife();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceKeeperId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceKeeperId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDeviceTypeName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceKeeper() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDeviceKeeper();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceTypeId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDeviceTypeId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceStatusId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDeviceStatusId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDevicePurchaseDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDevicePurchaseDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDevicePurchasePrice() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDevicePurchasePrice();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceManufactureDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDeviceManufactureDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceServiceLife() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDeviceServiceLife();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceKeeperId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setDeviceKeeperId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceIdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceIdd();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceTypeName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceTypeName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceKeeper() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getDeviceKeeper();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetListType() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getListType();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.insert();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.update();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDeleteBatch() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.deleteBatch();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceFaultByDeviceFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.searchDeviceFaultByDeviceFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSysUserId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = fileServiceImplUnderTest.getSysUserId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

