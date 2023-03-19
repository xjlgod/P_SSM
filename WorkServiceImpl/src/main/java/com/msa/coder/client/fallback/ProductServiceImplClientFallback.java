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
    public Object getOredCriteria() {
    // TODO
    }

    @Override
    public Object setProductId() {
    // TODO
    }

    @Override
    public Object setProcessId() {
    // TODO
    }

    @Override
    public Object getOrderByClause() {
    // TODO
    }

    @Override
    public Object isDistinct() {
    // TODO
    }

}
