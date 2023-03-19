package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Constants {
    /**
    * object fields.
    */
    @Autowired
    public String NO_PERMISSION;

    @Autowired
    public String VALIDATE_CODE;

    @Autowired
    public String ACTIVE_USER;

    @Autowired
    public String ERROR_HAPPENS;

    /**
    * methods.
    */
    public  Constants() {
    // TODO
    }

}
