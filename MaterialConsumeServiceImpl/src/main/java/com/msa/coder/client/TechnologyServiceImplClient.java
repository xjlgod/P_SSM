package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "TechnologyServiceImpl", fallback = TechnologyServiceImplClientFallback.class)
public interface TechnologyServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getConsumeDate")
    public Object getConsumeDate();

    @GetMapping("getSender")
    public Object getSender();

    @GetMapping("getMaterialId")
    public Object getMaterialId();

    @GetMapping("getReceiver")
    public Object getReceiver();

    @GetMapping("getConsumeAmount")
    public Object getConsumeAmount();

    @GetMapping("getConsumeId")
    public Object getConsumeId();

}
