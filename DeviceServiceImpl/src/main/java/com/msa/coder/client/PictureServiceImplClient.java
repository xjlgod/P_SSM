package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "PictureServiceImpl", fallback = PictureServiceImplClientFallback.class)
public interface PictureServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("setBeginDate")
    public Object setBeginDate();

    @GetMapping("setEndDate")
    public Object setEndDate();

    @GetMapping("setLaunchQuantity")
    public Object setLaunchQuantity();

}
