package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class MaterialReceiveServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default MaterialReceiveMapper materialReceiveMapper;

    private MaterialReceiveServiceImpl MaterialReceiveServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        MaterialReceiveServiceImpl materialReceiveServiceImplUnderTest = new MaterialReceiveServiceImpl();
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
        CustomResult result = materialReceiveServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        MaterialReceive arg0 = new MaterialReceive();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialReceiveServiceImplUnderTest.insert(MaterialReceive arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        MaterialReceive arg0 = new MaterialReceive();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialReceiveServiceImplUnderTest.updateNote(MaterialReceive arg0);
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
        CustomResult result = materialReceiveServiceImplUnderTest.delete(String arg0);
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
        EUDataGridResult result = materialReceiveServiceImplUnderTest.getList(int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        MaterialReceive arg0 = new MaterialReceive();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialReceiveServiceImplUnderTest.update(MaterialReceive arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchMaterialReceiveByReceiveId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = materialReceiveServiceImplUnderTest.searchMaterialReceiveByReceiveId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchMaterialReceiveByMaterialId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = materialReceiveServiceImplUnderTest.searchMaterialReceiveByMaterialId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        MaterialReceive arg0 = new MaterialReceive();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialReceiveServiceImplUnderTest.updateAll(MaterialReceive arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        MaterialReceive expectedResult = new MaterialReceive();
        // Run the test
        MaterialReceive result = materialReceiveServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testMaterialReceiveServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = materialReceiveServiceImplUnderTest.MaterialReceiveServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetReceiveId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getReceiveId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMaterial() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getMaterial();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetAmount() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getAmount();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetReceiveDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getReceiveDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSender() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getSender();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetreceiver() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getreceiver();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMaterialId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getMaterialId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMaterialId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.setMaterialId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetReceiveDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getReceiveDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetReceiveDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.setReceiveDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetReceiveId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getReceiveId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetReceiveId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.setReceiveId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetreceiver() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getreceiver();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetreceiver() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.setreceiver();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSender() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.getSender();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSender() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.setSender();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialReceiveServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

