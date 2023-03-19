package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class RoleServiceImplClientFallback implements RoleServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object setProduct() {
    // TODO
    }

    @Override
    public Object setRating() {
    // TODO
    }

    @Override
    public Object setProcess() {
    // TODO
    }

    @Override
    public Object setProcessNumber() {
    // TODO
    }

    @Override
    public Object setDevice() {
    // TODO
    }

}
