package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class PMeasureCheckServiceImplClientFallback implements PMeasureCheckServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object isSingleValue() {
    // TODO
    }

    @Override
    public Object getCondition() {
    // TODO
    }

    @Override
    public Object andIdIn() {
    // TODO
    }

    @Override
    public Object getCriteria() {
    // TODO
    }

    @Override
    public Object getValue() {
    // TODO
    }

    @Override
    public Object isNoValue() {
    // TODO
    }

    @Override
    public Object andUsernameEqualTo() {
    // TODO
    }

    @Override
    public Object isValid() {
    // TODO
    }

    @Override
    public Object isBetweenValue() {
    // TODO
    }

    @Override
    public Object isListValue() {
    // TODO
    }

}
