package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "PCountCheckServiceImpl", fallback = PCountCheckServiceImplClientFallback.class)
public interface PCountCheckServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getCheckNumber")
    public Object getCheckNumber();

    @GetMapping("getEmpId")
    public Object getEmpId();

    @GetMapping("getResult")
    public Object getResult();

    @GetMapping("getSample")
    public Object getSample();

    @GetMapping("getCheckItem")
    public Object getCheckItem();

    @GetMapping("getCdate")
    public Object getCdate();

    @GetMapping("getfCountCheckId")
    public Object getfCountCheckId();

    @GetMapping("getMeasureData")
    public Object getMeasureData();

    @GetMapping("getQualify")
    public Object getQualify();

    @GetMapping("getUnqualify")
    public Object getUnqualify();

    @GetMapping("getEmpName")
    public Object getEmpName();

}
