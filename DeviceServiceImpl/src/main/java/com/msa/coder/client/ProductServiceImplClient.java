package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "ProductServiceImpl", fallback = ProductServiceImplClientFallback.class)
public interface ProductServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("setRoleName")
    public Object setRoleName();

    @GetMapping("getProductName")
    public Object getProductName();

    @GetMapping("setRoleId")
    public Object setRoleId();

    @GetMapping("searchProductByProductId")
    public EUDataGridResult searchProductByProductId(String arg2, int arg1, int arg0);

    @GetMapping("setProductType")
    public Object setProductType();

    @GetMapping("setPermission")
    public Object setPermission();

    @GetMapping("setAvailable")
    public Object setAvailable();

    @GetMapping("getProductId")
    public Object getProductId();

    @GetMapping("getProcessId")
    public Object getProcessId();

    @GetMapping("getImage")
    public Object getImage();

    @GetMapping("getTechnologyPlanId")
    public Object getTechnologyPlanId();

    @GetMapping("getProductType")
    public Object getProductType();

    @GetMapping("getSequence")
    public Object getSequence();

    @GetMapping("getQuota")
    public Object getQuota();

}
