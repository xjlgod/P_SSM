package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class EmployeeServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default EmployeeMapper employeeMapper;

    private EmployeeServiceImpl EmployeeServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        EmployeeServiceImpl employeeServiceImplUnderTest = new EmployeeServiceImpl();
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
        CustomResult result = employeeServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchEmployeeByEmployeeName() {
        // input param init
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.searchEmployeeByEmployeeName(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.find();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchEmployeeByEmployeeId() {
        // input param init
        String arg0 = new String();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.searchEmployeeByEmployeeId(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchEmployeeByEmployeeId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = employeeServiceImplUnderTest.searchEmployeeByEmployeeId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEmployeeServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = employeeServiceImplUnderTest.EmployeeServiceImpl();
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
        CustomResult result = employeeServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        EmployeeVO expectedResult = new EmployeeVO();
        // Run the test
        EmployeeVO result = employeeServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        Employee arg0 = new Employee();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = employeeServiceImplUnderTest.update(Employee arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        EmployeeVO arg2 = new EmployeeVO();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = employeeServiceImplUnderTest.getList(EmployeeVO arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Employee arg0 = new Employee();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = employeeServiceImplUnderTest.insert(Employee arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchEmployeeByEmployeeName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = employeeServiceImplUnderTest.searchEmployeeByEmployeeName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Employee arg0 = new Employee();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = employeeServiceImplUnderTest.updateAll(Employee arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchEmployeeByDepartmentName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = employeeServiceImplUnderTest.searchEmployeeByDepartmentName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSex() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getSex();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetIdCode() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getIdCode();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetBirthday() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getBirthday();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetJoinDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getJoinDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEducation() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEducation();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDegree() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDegree();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMajor() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getMajor();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetGraduateSchool() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getGraduateSchool();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEducationForm() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEducationForm();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDepartment() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDepartment();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDeviceMaintainDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainCost() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDeviceMaintainCost();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDeviceMaintainEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDeviceMaintainId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDeviceFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceMaintainResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDeviceMaintainResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setDeviceFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceMaintainCost() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setDeviceMaintainCost();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceMaintainDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setDeviceMaintainDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceMaintainEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setDeviceMaintainEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceMaintainId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setDeviceMaintainId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceMaintainResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setDeviceMaintainResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInitBinder() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.InitBinder();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchFCountCheckByFCountCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.searchFCountCheckByFCountCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetpMeasureCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setpMeasureCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetpMeasureCheckId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getpMeasureCheckId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCheckItem() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getCheckItem();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCdate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getCdate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMeasureData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getMeasureData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetResult() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getResult();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetBirthday() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getBirthday();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetBirthday() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setBirthday();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDegree() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDegree();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDegree() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setDegree();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDepartmentId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getDepartmentId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDepartmentId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setDepartmentId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEducation() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEducation();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEducation() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setEducation();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEducationForm() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEducationForm();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEducationForm() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setEducationForm();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setEmpId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmpName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setEmpName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetIdCode() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getIdCode();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetIdCode() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setIdCode();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetJoinDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getJoinDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetJoinDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setJoinDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetMajor() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getMajor();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetMajor() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setMajor();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSex() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getSex();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSex() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setSex();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.getStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = employeeServiceImplUnderTest.setStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

