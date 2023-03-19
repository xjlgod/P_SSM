package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Product {
    /**
    * object fields.
    */
    @Autowired
    private String image;

    @Autowired
    private String note;

    @Autowired
    private String productId;

    @Autowired
    private String productName;

    @Autowired
    private String productType;

    /**
    * not object fields.
    */
    private int status;

    /**
    * methods.
    */
    public void setStatus(int arg0) {
    // TODO
    }

    public String getImage() {
    // TODO
    }

    public String getProductName() {
    // TODO
    }

    public int getStatus() {
    // TODO
    }

    public void setProductType(String arg0) {
    // TODO
    }

    public  Product() {
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

    public String getProductId() {
    // TODO
    }

    public void setProductId(String arg0) {
    // TODO
    }

    public String getProductType() {
    // TODO
    }

    public void setProductName(String arg0) {
    // TODO
    }

}
