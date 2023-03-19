package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class PictureServiceImplTest {
    private PictureServiceImpl PictureServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        PictureServiceImpl pictureServiceImplUnderTest = new PictureServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testPictureServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = pictureServiceImplUnderTest.PictureServiceImpl();
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
        boolean result = pictureServiceImplUnderTest.deleteFile(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUploadPicture() {
        // input param init
        Object arg0 = new Object();
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.uploadPicture(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testCreateCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.createCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAndSysUserIdEqualTo() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.andSysUserIdEqualTo();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsValid() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.isValid();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsNoValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.isNoValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsSingleValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.isSingleValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCondition() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getCondition();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetBeginDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getBeginDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetBeginDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.setBeginDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEndDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getEndDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEndDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.setEndDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetLaunchQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getLaunchQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetLaunchQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.setLaunchQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetManufactureSn() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getManufactureSn();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetManufactureSn() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.setManufactureSn();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.setOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getTechnologyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetTechnologyId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.setTechnologyId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testCreateCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.createCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAndRoleNameEqualTo() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.andRoleNameEqualTo();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAndRoleIdNotEqualTo() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.andRoleIdNotEqualTo();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsValid() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.isValid();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsNoValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.isNoValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsSingleValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.isSingleValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCondition() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getCondition();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetValue() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = pictureServiceImplUnderTest.getValue();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

