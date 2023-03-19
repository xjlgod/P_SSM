package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class TaskServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default TaskMapper taskMapper;

    private TaskServiceImpl TaskServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        TaskServiceImpl taskServiceImplUnderTest = new TaskServiceImpl();
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
        CustomResult result = taskServiceImplUnderTest.deleteBatch(Object arg0);
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
        CustomResult result = taskServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Task arg0 = new Task();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = taskServiceImplUnderTest.insert(Task arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchTaskByTaskWorkId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = taskServiceImplUnderTest.searchTaskByTaskWorkId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchTaskByTaskId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = taskServiceImplUnderTest.searchTaskByTaskId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        Task expectedResult = new Task();
        // Run the test
        Task result = taskServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        Task arg2 = new Task();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = taskServiceImplUnderTest.getList(Task arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testTaskServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = taskServiceImplUnderTest.TaskServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Task arg0 = new Task();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = taskServiceImplUnderTest.updateAll(Task arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        Task arg0 = new Task();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = taskServiceImplUnderTest.update(Task arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchTaskByTaskManufactureSn() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = taskServiceImplUnderTest.searchTaskByTaskManufactureSn(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAuthorityJudge() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.authorityJudge();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchWorkByWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.searchWorkByWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTaskId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.getTaskId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetManufactureSn() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.getManufactureSn();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.getWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTaskQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.getTaskQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetWorkingHours() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.getWorkingHours();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetManufactureSn() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.setManufactureSn();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetTaskId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.setTaskId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetTaskQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.setTaskQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetWorkId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.setWorkId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetWorkingHours() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.setWorkingHours();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = taskServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

