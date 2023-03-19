package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class TechnologyPlanServiceImplClientFallback implements TechnologyPlanServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object getCommitPlan() {
    // TODO
    }

    @Override
    public Object getBatchAmount() {
    // TODO
    }

    @Override
    public Object setCommitPlan() {
    // TODO
    }

    @Override
    public Object setEndPlan() {
    // TODO
    }

    @Override
    public Object getTechnologyPlanStart() {
    // TODO
    }

    @Override
    public Object setStartPlan() {
    // TODO
    }

    @Override
    public Object setBatchAmount() {
    // TODO
    }

    @Override
    public EUDataGridResult searchTechnologyPlanByTechnologyPlanId(String arg2, int arg1, int arg0) {
    // TODO
    }

    @Override
    public Object getStartPlan() {
    // TODO
    }

    @Override
    public Object getTechnologyPlanEnd() {
    // TODO
    }

    @Override
    public Object getEndPlan() {
    // TODO
    }

}
