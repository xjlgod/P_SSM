package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImplClientFallback implements OrderServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object setEmail() {
    // TODO
    }

    @Override
    public Object setOwnerName() {
    // TODO
    }

    @Override
    public Object setFax() {
    // TODO
    }

    @Override
    public Object setOwnerTel() {
    // TODO
    }

    @Override
    public Object setCustomName() {
    // TODO
    }

    @Override
    public Object setFullName() {
    // TODO
    }

    @Override
    public Object setAddress() {
    // TODO
    }

}
