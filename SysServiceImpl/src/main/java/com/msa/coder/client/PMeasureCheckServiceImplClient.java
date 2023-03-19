package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "PMeasureCheckServiceImpl", fallback = PMeasureCheckServiceImplClientFallback.class)
public interface PMeasureCheckServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("isSingleValue")
    public Object isSingleValue();

    @GetMapping("getCondition")
    public Object getCondition();

    @GetMapping("andIdIn")
    public Object andIdIn();

    @GetMapping("getCriteria")
    public Object getCriteria();

    @GetMapping("getValue")
    public Object getValue();

    @GetMapping("isNoValue")
    public Object isNoValue();

    @GetMapping("andUsernameEqualTo")
    public Object andUsernameEqualTo();

    @GetMapping("isValid")
    public Object isValid();

    @GetMapping("isBetweenValue")
    public Object isBetweenValue();

    @GetMapping("isListValue")
    public Object isListValue();

}
