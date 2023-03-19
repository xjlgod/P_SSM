package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class DepartmentServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default DepartmentMapper departmentMapper;

    private DepartmentServiceImpl DepartmentServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        DepartmentServiceImpl departmentServiceImplUnderTest = new DepartmentServiceImpl();
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
        CustomResult result = departmentServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        Department arg2 = new Department();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = departmentServiceImplUnderTest.getList(Department arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDepartmentByDepartmentId() {
        // input param init
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.searchDepartmentByDepartmentId(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDepartmentByDepartmentId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = departmentServiceImplUnderTest.searchDepartmentByDepartmentId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        Department arg0 = new Department();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = departmentServiceImplUnderTest.update(Department arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        Department expectedResult = new Department();
        // Run the test
        Department result = departmentServiceImplUnderTest.get(String arg0);
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
        CustomResult result = departmentServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testDepartmentServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = departmentServiceImplUnderTest.DepartmentServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Department arg0 = new Department();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = departmentServiceImplUnderTest.insert(Department arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        Department arg0 = new Department();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = departmentServiceImplUnderTest.updateNote(Department arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Department arg0 = new Department();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = departmentServiceImplUnderTest.updateAll(Department arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchDepartmentByDepartmentName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = departmentServiceImplUnderTest.searchDepartmentByDepartmentName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDepartmentId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.setDepartmentId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDepartmentId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.getDepartmentId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDepartmentName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.getDepartmentName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchOrderByOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.searchOrderByOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDepartmentName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.setDepartmentName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = departmentServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

