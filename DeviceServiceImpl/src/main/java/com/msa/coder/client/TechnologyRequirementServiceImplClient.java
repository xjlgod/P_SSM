package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "TechnologyRequirementServiceImpl", fallback = TechnologyRequirementServiceImplClientFallback.class)
public interface TechnologyRequirementServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getRequirement")
    public Object getRequirement();

    @GetMapping("getTechnologyRequirementId")
    public Object getTechnologyRequirementId();

    @GetMapping("searchTechnologyRequirementByTechnologyRequirementId")
    public EUDataGridResult searchTechnologyRequirementByTechnologyRequirementId(String arg2, int arg1, int arg0);

    @GetMapping("getAddTime")
    public Object getAddTime();

    @GetMapping("getReviseTime")
    public Object getReviseTime();

}
