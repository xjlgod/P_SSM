package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class MaterialServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default MaterialMapper materialMapper;

    private MaterialServiceImpl MaterialServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        MaterialServiceImpl materialServiceImplUnderTest = new MaterialServiceImpl();
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
        CustomResult result = materialServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        Material arg0 = new Material();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialServiceImplUnderTest.updateNote(Material arg0);
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
        CustomResult result = materialServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        Material expectedResult = new Material();
        // Run the test
        Material result = materialServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        Material arg2 = new Material();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = materialServiceImplUnderTest.getList(Material arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchMaterialByMaterialType() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = materialServiceImplUnderTest.searchMaterialByMaterialType(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        Material arg0 = new Material();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialServiceImplUnderTest.update(Material arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testMaterialServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = materialServiceImplUnderTest.MaterialServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Material arg0 = new Material();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialServiceImplUnderTest.insert(Material arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchMaterialByMaterialId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = materialServiceImplUnderTest.searchMaterialByMaterialId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Material arg0 = new Material();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialServiceImplUnderTest.updateAll(Material arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMaterialId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.getMaterialId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.getWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMaterialType() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.getMaterialType();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.getStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRemaining() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.getRemaining();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMaterialId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.setMaterialId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMaterialType() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.setMaterialType();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRemaining() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.setRemaining();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialServiceImplUnderTest.setStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

