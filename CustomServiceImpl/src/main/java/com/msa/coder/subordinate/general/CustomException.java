package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class CustomException {
    /**
    * object fields.
    */
    @Autowired
    private String message;

    /**
    * not object fields.
    */
    private long serialVersionUID;

    /**
    * methods.
    */
    public void setMessage(String arg0) {
    // TODO
    }

    public String getMessage() {
    // TODO
    }

    public  CustomException(String arg0) {
    // TODO
    }

}
