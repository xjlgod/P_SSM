package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class DeviceMaintainServiceImplClientFallback implements DeviceMaintainServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object getDeviceMaintainDate() {
    // TODO
    }

    @Override
    public Object getDeviceMaintainCost() {
    // TODO
    }

    @Override
    public Object getDeviceMaintainResult() {
    // TODO
    }

    @Override
    public Object getUsername() {
    // TODO
    }

    @Override
    public Object getDeviceMaintainId() {
    // TODO
    }

    @Override
    public Object getDeviceMaintainEmp() {
    // TODO
    }

    @Override
    public Object getDeviceMaintainEmpId() {
    // TODO
    }

    @Override
    public Object getRolename() {
    // TODO
    }

}
