package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class COrderVO {
    /**
    * object fields.
    */
    @Autowired
    private Object unitPrice;

    @Autowired
    private String image;

    @Autowired
    private String note;

    @Autowired
    private Product product;

    @Autowired
    private String unit;

    @Autowired
    private String file;

    @Autowired
    private String orderId;

    @Autowired
    private Custom custom;

    @Autowired
    private Object requestDate;

    @Autowired
    private Object orderDate;

    /**
    * not object fields.
    */
    private int quantity;

    private int status;

    /**
    * methods.
    */
    public void setProduct(Product arg0) {
    // TODO
    }

    public Product getProduct() {
    // TODO
    }

    public void setCustom(Custom arg0) {
    // TODO
    }

    public String getUnit() {
    // TODO
    }

    public String getOrderId() {
    // TODO
    }

    public  COrderVO() {
    // TODO
    }

    public void setOrderId(String arg0) {
    // TODO
    }

    public void setImage(String arg0) {
    // TODO
    }

    public void setNote(String arg0) {
    // TODO
    }

    public String getNote() {
    // TODO
    }

    public void setFile(String arg0) {
    // TODO
    }

    public void setUnitPrice(Object arg0) {
    // TODO
    }

    public void setQuantity(int arg0) {
    // TODO
    }

    public void setStatus(int arg0) {
    // TODO
    }

    public int getQuantity() {
    // TODO
    }

    public void setOrderDate(Object arg0) {
    // TODO
    }

    public String getImage() {
    // TODO
    }

    public int getStatus() {
    // TODO
    }

    public Object getOrderDate() {
    // TODO
    }

    public Custom getCustom() {
    // TODO
    }

    public void setRequestDate(Object arg0) {
    // TODO
    }

    public String getFile() {
    // TODO
    }

    public Object getRequestDate() {
    // TODO
    }

    public Object getUnitPrice() {
    // TODO
    }

    public void setUnit(String arg0) {
    // TODO
    }

}
