package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class ProductController {
    /**
    * object fields.
    */
    @Autowired
    private ProductService productService;

    /**
    * methods.
    */
    private CustomResult update(Object arg1, Product arg0) {
    // TODO
    }

    public EUDataGridResult searchProductByProductId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, Product arg0) {
    // TODO
    }

    public  ProductController() {
    // TODO
    }

    public EUDataGridResult getItemList(Product arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchProductByProductName(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public EUDataGridResult searchProductByProductType(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Product arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public Product getItemById(String arg0) {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    private CustomResult insert(Object arg1, Product arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
