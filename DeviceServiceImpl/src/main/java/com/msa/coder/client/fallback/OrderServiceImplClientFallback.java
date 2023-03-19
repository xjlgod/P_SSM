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
    public Object getFullName() {
    // TODO
    }

    @Override
    public Object getCustomName() {
    // TODO
    }

    @Override
    public Object getFax() {
    // TODO
    }

    @Override
    public Object getCustom() {
    // TODO
    }

    @Override
    public Object getAddress() {
    // TODO
    }

    @Override
    public Object getOwnerTel() {
    // TODO
    }

    @Override
    public Object getOwnerName() {
    // TODO
    }

    @Override
    public Object getEmail() {
    // TODO
    }

}
