package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "TechnologyPlanServiceImpl", fallback = TechnologyPlanServiceImplClientFallback.class)
public interface TechnologyPlanServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getCommitPlan")
    public Object getCommitPlan();

    @GetMapping("getBatchAmount")
    public Object getBatchAmount();

    @GetMapping("setCommitPlan")
    public Object setCommitPlan();

    @GetMapping("setEndPlan")
    public Object setEndPlan();

    @GetMapping("getTechnologyPlanStart")
    public Object getTechnologyPlanStart();

    @GetMapping("setStartPlan")
    public Object setStartPlan();

    @GetMapping("setBatchAmount")
    public Object setBatchAmount();

    @GetMapping("searchTechnologyPlanByTechnologyPlanId")
    public EUDataGridResult searchTechnologyPlanByTechnologyPlanId(String arg2, int arg1, int arg0);

    @GetMapping("getStartPlan")
    public Object getStartPlan();

    @GetMapping("getTechnologyPlanEnd")
    public Object getTechnologyPlanEnd();

    @GetMapping("getEndPlan")
    public Object getEndPlan();

}
