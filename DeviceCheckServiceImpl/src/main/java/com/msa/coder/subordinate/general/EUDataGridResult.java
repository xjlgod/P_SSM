package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class EUDataGridResult {
    /**
    * object fields.
    */
    @Autowired
    private Object rows;

    /**
    * not object fields.
    */
    private long total;

    /**
    * methods.
    */
    public  EUDataGridResult() {
    // TODO
    }

    public void setRows(Object arg0) {
    // TODO
    }

    public void setTotal(long arg0) {
    // TODO
    }

    public Object getRows() {
    // TODO
    }

    public long getTotal() {
    // TODO
    }

}
