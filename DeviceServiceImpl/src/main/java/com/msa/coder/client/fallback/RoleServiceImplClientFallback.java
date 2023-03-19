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
    public EUDataGridResult searchRoleByRoleId(String arg2, int arg1, int arg0) {
    // TODO
    }

    @Override
    public Object searchpCountCheckBypCountCheckId() {
    // TODO
    }

    @Override
    public Object getRoleId() {
    // TODO
    }

    @Override
    public Object getDevice() {
    // TODO
    }

    @Override
    public Object getProcessNumber() {
    // TODO
    }

    @Override
    public Object getProcess() {
    // TODO
    }

    @Override
    public Object getRating() {
    // TODO
    }

    @Override
    public Object getProduct() {
    // TODO
    }

}
