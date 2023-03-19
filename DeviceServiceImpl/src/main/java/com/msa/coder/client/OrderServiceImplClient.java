package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "OrderServiceImpl", fallback = OrderServiceImplClientFallback.class)
public interface OrderServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getFullName")
    public Object getFullName();

    @GetMapping("getCustomName")
    public Object getCustomName();

    @GetMapping("getFax")
    public Object getFax();

    @GetMapping("getCustom")
    public Object getCustom();

    @GetMapping("getAddress")
    public Object getAddress();

    @GetMapping("getOwnerTel")
    public Object getOwnerTel();

    @GetMapping("getOwnerName")
    public Object getOwnerName();

    @GetMapping("getEmail")
    public Object getEmail();

}
