package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class CustomServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default CustomMapper customMapper;

    private CustomServiceImpl CustomServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        CustomServiceImpl customServiceImplUnderTest = new CustomServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testDelete() {
        // input param init
        String arg0 = new String();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = customServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testCustomServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = customServiceImplUnderTest.CustomServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        Custom arg0 = new Custom();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = customServiceImplUnderTest.update(Custom arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        Custom arg2 = new Custom();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = customServiceImplUnderTest.getList(Custom arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchCustomByCustomId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = customServiceImplUnderTest.searchCustomByCustomId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testChangeStatus() {
        // input param init
        Object arg0 = new Object();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = customServiceImplUnderTest.changeStatus(Object arg0);
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
        CustomResult result = customServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Custom arg0 = new Custom();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = customServiceImplUnderTest.insert(Custom arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        Custom arg0 = new Custom();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = customServiceImplUnderTest.updateNote(Custom arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        Custom expectedResult = new Custom();
        // Run the test
        Custom result = customServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchCustomByCustomName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = customServiceImplUnderTest.searchCustomByCustomName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Custom arg0 = new Custom();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = customServiceImplUnderTest.updateAll(Custom arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testNewHashMap() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.newHashMap();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testNewArrayList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.newArrayList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMessage() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.getMessage();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testConvert() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.convert();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetListType() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.getListType();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDeviceMaintainByDeviceMaintainId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = customServiceImplUnderTest.searchDeviceMaintainByDeviceMaintainId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

