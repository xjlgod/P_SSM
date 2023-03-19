package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "DeviceMaintainServiceImpl", fallback = DeviceMaintainServiceImplClientFallback.class)
public interface DeviceMaintainServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getDeviceMaintainDate")
    public Object getDeviceMaintainDate();

    @GetMapping("getDeviceMaintainCost")
    public Object getDeviceMaintainCost();

    @GetMapping("getDeviceMaintainResult")
    public Object getDeviceMaintainResult();

    @GetMapping("getUsername")
    public Object getUsername();

    @GetMapping("getDeviceMaintainId")
    public Object getDeviceMaintainId();

    @GetMapping("getDeviceMaintainEmp")
    public Object getDeviceMaintainEmp();

    @GetMapping("getDeviceMaintainEmpId")
    public Object getDeviceMaintainEmpId();

    @GetMapping("getRolename")
    public Object getRolename();

}
