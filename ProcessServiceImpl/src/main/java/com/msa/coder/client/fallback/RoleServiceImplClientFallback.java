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
    public Object getRoleName() {
    // TODO
    }

    @Override
    public RoleVO findRoleByUserId(String arg0) {
    // TODO
    }

    @Override
    public Object getAvailable() {
    // TODO
    }

}
