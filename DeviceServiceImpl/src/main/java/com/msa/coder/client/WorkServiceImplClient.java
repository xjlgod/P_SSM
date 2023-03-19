package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "WorkServiceImpl", fallback = WorkServiceImplClientFallback.class)
public interface WorkServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getCustomId")
    public Object getCustomId();

    @GetMapping("setCustomId")
    public Object setCustomId();

    @GetMapping("getUnit")
    public Object getUnit();

    @GetMapping("getFile")
    public Object getFile();

    @GetMapping("ajaxLogin")
    public Object ajaxLogin();

    @GetMapping("setFile")
    public Object setFile();

    @GetMapping("setQuantity")
    public Object setQuantity();

    @GetMapping("getOrderId")
    public Object getOrderId();

    @GetMapping("getUnitPrice")
    public Object getUnitPrice();

    @GetMapping("setUnitPrice")
    public Object setUnitPrice();

    @GetMapping("setImage")
    public Object setImage();

    @GetMapping("getQuantity")
    public Object getQuantity();

    @GetMapping("setUnit")
    public Object setUnit();

    @GetMapping("getOrderDate")
    public Object getOrderDate();

    @GetMapping("setOrderDate")
    public Object setOrderDate();

    @GetMapping("setRequestDate")
    public Object setRequestDate();

    @GetMapping("setStatus")
    public Object setStatus();

    @GetMapping("getRequestDate")
    public Object getRequestDate();

}
