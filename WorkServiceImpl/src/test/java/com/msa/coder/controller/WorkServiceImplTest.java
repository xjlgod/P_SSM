package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class WorkServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default WorkMapper workMapper;

    private WorkServiceImpl WorkServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        WorkServiceImpl workServiceImplUnderTest = new WorkServiceImpl();
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
        CustomResult result = workServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testWorkServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = workServiceImplUnderTest.WorkServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        WorkVO expectedResult = new WorkVO();
        // Run the test
        WorkVO result = workServiceImplUnderTest.get(String arg0);
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
        CustomResult result = workServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchWorkByWorkProcess() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = workServiceImplUnderTest.searchWorkByWorkProcess(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        WorkVO arg2 = new WorkVO();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = workServiceImplUnderTest.getList(WorkVO arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchWorkByWorkId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = workServiceImplUnderTest.searchWorkByWorkId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        Work arg0 = new Work();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = workServiceImplUnderTest.update(Work arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Work arg0 = new Work();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = workServiceImplUnderTest.updateAll(Work arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchWorkByWorkProduct() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = workServiceImplUnderTest.searchWorkByWorkProduct(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Work arg0 = new Work();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = workServiceImplUnderTest.insert(Work arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchWorkByWorkDevice() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = workServiceImplUnderTest.searchWorkByWorkDevice(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAjaxLogin() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.ajaxLogin();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCustomId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getCustomId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCustomId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setCustomId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetFile() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getFile();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetFile() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setFile();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetImage() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getImage();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetImage() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setImage();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getOrderDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOrderDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setOrderDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProductId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getProductId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProductId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setProductId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRequestDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getRequestDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRequestDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setRequestDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getUnit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUnit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setUnit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnitPrice() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getUnitPrice();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetUnitPrice() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.setUnitPrice();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchCustomByCustomId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.searchCustomByCustomId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchProcessByProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = workServiceImplUnderTest.searchProcessByProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

