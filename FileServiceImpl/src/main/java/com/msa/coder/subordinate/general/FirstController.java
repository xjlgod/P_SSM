package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class FirstController {
    /**
    * object fields.
    */
    @Autowired
    private SysService sysService;

    @Autowired
    private Object logger;

    /**
    * methods.
    */
    public  FirstController() {
    // TODO
    }

    public String first(Object arg0) {
    // TODO
    }

    public String home(Object arg1, Object arg0) {
    // TODO
    }

}
