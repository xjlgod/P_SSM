package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class ProductServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default ProductMapper productMapper;

    private ProductServiceImpl ProductServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        ProductServiceImpl productServiceImplUnderTest = new ProductServiceImpl();
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
        CustomResult result = productServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        Product expectedResult = new Product();
        // Run the test
        Product result = productServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        Product arg0 = new Product();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = productServiceImplUnderTest.updateNote(Product arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        Product arg2 = new Product();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = productServiceImplUnderTest.getList(Product arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchProductByProductType() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = productServiceImplUnderTest.searchProductByProductType(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        Product arg0 = new Product();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = productServiceImplUnderTest.updateAll(Product arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.find();
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
        CustomResult result = productServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testProductServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = productServiceImplUnderTest.ProductServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        Product arg0 = new Product();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = productServiceImplUnderTest.insert(Product arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        Product arg0 = new Product();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = productServiceImplUnderTest.update(Product arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchProductByProductId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = productServiceImplUnderTest.searchProductByProductId(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchProductByProductName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = productServiceImplUnderTest.searchProductByProductName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProductId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setProductId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProductName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setProductName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProductId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getProductId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProductName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getProductName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProductType() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getProductType();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetImage() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getImage();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetData() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getData();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetItemList() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getItemList();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testAdd() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.add();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetImage() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setImage();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProductType() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setProductType();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testEdit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.edit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProcessId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getProcessId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetTechnologyPlanId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getTechnologyPlanId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetSequence() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getSequence();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetQuota() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getQuota();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetTechnologyPlanId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setTechnologyPlanId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetSequence() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setSequence();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetQuota() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setQuota();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testIsDistinct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.isDistinct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOredCriteria() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getOredCriteria();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderByClause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getOrderByClause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultMaintenance() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getDeviceFaultMaintenance();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getDeviceFaultDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultCause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getDeviceFaultCause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultDetail() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getDeviceFaultDetail();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetDeviceFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getDeviceFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultCause() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setDeviceFaultCause();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setDeviceFaultDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultDetail() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setDeviceFaultDetail();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setDeviceFaultId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceFaultMaintenance() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setDeviceFaultMaintenance();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetDeviceId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setDeviceId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetAvailable() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getAvailable();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetAvailable() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setAvailable();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetPermission() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getPermission();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetPermission() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setPermission();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRoleId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setRoleId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRoleName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.getRoleName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetRoleName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = productServiceImplUnderTest.setRoleName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

