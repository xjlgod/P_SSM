package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "RoleServiceImpl", fallback = RoleServiceImplClientFallback.class)
public interface RoleServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("setProduct")
    public Object setProduct();

    @GetMapping("setRating")
    public Object setRating();

    @GetMapping("setProcess")
    public Object setProcess();

    @GetMapping("setProcessNumber")
    public Object setProcessNumber();

    @GetMapping("setDevice")
    public Object setDevice();

}
