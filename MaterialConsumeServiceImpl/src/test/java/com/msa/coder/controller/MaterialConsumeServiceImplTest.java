package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class MaterialConsumeServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default MaterialConsumeMapper materialConsumeMapper;

    private MaterialConsumeServiceImpl MaterialConsumeServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        MaterialConsumeServiceImpl materialConsumeServiceImplUnderTest = new MaterialConsumeServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        MaterialConsume expectedResult = new MaterialConsume();
        // Run the test
        MaterialConsume result = materialConsumeServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        MaterialConsumeVO arg2 = new MaterialConsumeVO();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = materialConsumeServiceImplUnderTest.getList(MaterialConsumeVO arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        MaterialConsume arg0 = new MaterialConsume();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialConsumeServiceImplUnderTest.insert(MaterialConsume arg0);
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
        CustomResult result = materialConsumeServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchMaterialConsumeByMaterialId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = materialConsumeServiceImplUnderTest.searchMaterialConsumeByMaterialId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialConsumeServiceImplUnderTest.find();
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
        CustomResult result = materialConsumeServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        MaterialConsume arg0 = new MaterialConsume();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialConsumeServiceImplUnderTest.updateNote(MaterialConsume arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testMaterialConsumeServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = materialConsumeServiceImplUnderTest.MaterialConsumeServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchMaterialConsumeByConsumeId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = materialConsumeServiceImplUnderTest.searchMaterialConsumeByConsumeId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchMaterialConsumeByWorkId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = materialConsumeServiceImplUnderTest.searchMaterialConsumeByWorkId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        MaterialConsume arg0 = new MaterialConsume();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialConsumeServiceImplUnderTest.update(MaterialConsume arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        MaterialConsume arg0 = new MaterialConsume();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = materialConsumeServiceImplUnderTest.updateAll(MaterialConsume arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialConsumeServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialConsumeServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialConsumeServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchMaterialByMaterialId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialConsumeServiceImplUnderTest.searchMaterialByMaterialId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialConsumeServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialConsumeServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = materialConsumeServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

