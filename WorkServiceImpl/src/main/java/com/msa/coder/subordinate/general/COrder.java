package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class COrder {
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
    private String unit;

    @Autowired
    private String file;

    @Autowired
    private String productId;

    @Autowired
    private String orderId;

    @Autowired
    private Object requestDate;

    @Autowired
    private String customId;

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
    public String getUnit() {
    // TODO
    }

    public String getOrderId() {
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

    public void setCustomId(String arg0) {
    // TODO
    }

    public String getCustomId() {
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

    public  COrder() {
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

    public String getProductId() {
    // TODO
    }

    public void setProductId(String arg0) {
    // TODO
    }

    public void setUnit(String arg0) {
    // TODO
    }

}
