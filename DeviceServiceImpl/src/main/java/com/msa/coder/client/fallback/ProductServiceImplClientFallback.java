package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImplClientFallback implements ProductServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object setRoleName() {
    // TODO
    }

    @Override
    public Object getProductName() {
    // TODO
    }

    @Override
    public Object setRoleId() {
    // TODO
    }

    @Override
    public EUDataGridResult searchProductByProductId(String arg2, int arg1, int arg0) {
    // TODO
    }

    @Override
    public Object setProductType() {
    // TODO
    }

    @Override
    public Object setPermission() {
    // TODO
    }

    @Override
    public Object setAvailable() {
    // TODO
    }

    @Override
    public Object getProductId() {
    // TODO
    }

    @Override
    public Object getProcessId() {
    // TODO
    }

    @Override
    public Object getImage() {
    // TODO
    }

    @Override
    public Object getTechnologyPlanId() {
    // TODO
    }

    @Override
    public Object getProductType() {
    // TODO
    }

    @Override
    public Object getSequence() {
    // TODO
    }

    @Override
    public Object getQuota() {
    // TODO
    }

}
