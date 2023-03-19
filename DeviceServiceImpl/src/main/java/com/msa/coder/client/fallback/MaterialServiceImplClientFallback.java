package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class MaterialServiceImplClientFallback implements MaterialServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object getRemaining() {
    // TODO
    }

    @Override
    public Object setRemaining() {
    // TODO
    }

    @Override
    public Object setMaterialType() {
    // TODO
    }

    @Override
    public Object getMaterialType() {
    // TODO
    }

}
