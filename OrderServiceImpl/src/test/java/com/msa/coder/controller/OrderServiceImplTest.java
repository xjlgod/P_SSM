package com.msa.coder.controller;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.MockitoAnnotations.initMocks;

public class OrderServiceImplTest {
    /**
    * mock fields.
    */
    @Mock
    default CustomService customService;

    @Mock
    default COrderMapper cOrderMapper;

    @Mock
    default ProductService productService;

    private OrderServiceImpl OrderServiceImplUnderTest;

    @BeforeEach
    public void setUp() {
        initMocks(this);
        // set up the controller class
        OrderServiceImpl orderServiceImplUnderTest = new OrderServiceImpl();
    }

    /**
    * interface methods in controller class, these interface methods should be test.
    */
    @Test
    public testSearchOrderByOrderId() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = orderServiceImplUnderTest.searchOrderByOrderId(String arg2, int arg1, int arg0);
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
        CustomResult result = orderServiceImplUnderTest.delete(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchOrderByProductName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = orderServiceImplUnderTest.searchOrderByProductName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateAll() {
        // input param init
        COrder arg0 = new COrder();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = orderServiceImplUnderTest.updateAll(COrder arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdateNote() {
        // input param init
        COrder arg0 = new COrder();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = orderServiceImplUnderTest.updateNote(COrder arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInsert() {
        // input param init
        COrder arg0 = new COrder();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = orderServiceImplUnderTest.insert(COrder arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGet() {
        // input param init
        String arg0 = new String();
        // expect result init
        COrderVO expectedResult = new COrderVO();
        // Run the test
        COrderVO result = orderServiceImplUnderTest.get(String arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testFind() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.find();
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
        CustomResult result = orderServiceImplUnderTest.changeStatus(Object arg0);
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
        CustomResult result = orderServiceImplUnderTest.deleteBatch(Object arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetList() {
        // input param init
        COrderVO arg2 = new COrderVO();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = orderServiceImplUnderTest.getList(COrderVO arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSearchOrderByCustomName() {
        // input param init
        String arg2 = new String();
        int arg1 = new int();
        int arg0 = new int();
        // expect result init
        EUDataGridResult expectedResult = new EUDataGridResult();
        // Run the test
        EUDataGridResult result = orderServiceImplUnderTest.searchOrderByCustomName(String arg2, int arg1, int arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testOrderServiceImpl() {
        // input param init
        // expect result init
         expectedResult = new ();
        // Run the test
         result = orderServiceImplUnderTest.OrderServiceImpl();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testUpdate() {
        // input param init
        COrder arg0 = new COrder();
        // expect result init
        CustomResult expectedResult = new CustomResult();
        // Run the test
        CustomResult result = orderServiceImplUnderTest.update(COrder arg0);
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getOrderId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOrderDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getOrderDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetRequestDate() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getRequestDate();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetQuantity() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getQuantity();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnitPrice() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getUnitPrice();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetUnit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getUnit();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetImage() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getImage();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetFile() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getFile();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCustom() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getCustom();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCustomId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getCustomId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetCustomName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getCustomName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetFullName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getFullName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetAddress() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getAddress();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetFax() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getFax();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetEmail() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getEmail();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOwnerName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getOwnerName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetOwnerTel() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getOwnerTel();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGetProduct() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.getProduct();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testInit() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.init();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCustomId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setCustomId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetCustomName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setCustomName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetFullName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setFullName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetAddress() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setAddress();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetFax() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setFax();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetEmail() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setEmail();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOwnerName() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setOwnerName();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetOwnerTel() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setOwnerTel();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetStatus() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setStatus();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testSetNote() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.setNote();
        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    public testGenStringId() {
        // input param init
        // expect result init
        Object expectedResult = new Object();
        // Run the test
        Object result = orderServiceImplUnderTest.genStringId();
        // Verify the results
        assertEquals(expectedResult, result);
    }

}

