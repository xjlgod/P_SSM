package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class TechnologyServiceImplClientFallback implements TechnologyServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object getConsumeDate() {
    // TODO
    }

    @Override
    public Object getSender() {
    // TODO
    }

    @Override
    public Object getMaterialId() {
    // TODO
    }

    @Override
    public Object getReceiver() {
    // TODO
    }

    @Override
    public Object getConsumeAmount() {
    // TODO
    }

    @Override
    public Object getConsumeId() {
    // TODO
    }

}
