package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class TechnologyRequirementServiceImplClientFallback implements TechnologyRequirementServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object getRequirement() {
    // TODO
    }

    @Override
    public Object getTechnologyRequirementId() {
    // TODO
    }

    @Override
    public EUDataGridResult searchTechnologyRequirementByTechnologyRequirementId(String arg2, int arg1, int arg0) {
    // TODO
    }

    @Override
    public Object getAddTime() {
    // TODO
    }

    @Override
    public Object getReviseTime() {
    // TODO
    }

}
