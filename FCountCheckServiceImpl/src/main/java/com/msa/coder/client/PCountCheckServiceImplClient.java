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
    @GetMapping("setEmpId")
    public Object setEmpId();

    @GetMapping("setMeasureData")
    public Object setMeasureData();

    @GetMapping("setQualify")
    public Object setQualify();

    @GetMapping("setCheckItem")
    public Object setCheckItem();

    @GetMapping("setSample")
    public Object setSample();

    @GetMapping("setUnqualify")
    public Object setUnqualify();

    @GetMapping("setEmpName")
    public Object setEmpName();

    @GetMapping("setCheckNumber")
    public Object setCheckNumber();

    @GetMapping("setfCountCheckId")
    public Object setfCountCheckId();

    @GetMapping("setCdate")
    public Object setCdate();

    @GetMapping("setResult")
    public Object setResult();

}
