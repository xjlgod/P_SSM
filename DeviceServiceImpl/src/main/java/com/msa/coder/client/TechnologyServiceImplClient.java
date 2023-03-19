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
    @GetMapping("getOvertimeOverfulfilCapacity")
    public Object getOvertimeOverfulfilCapacity();

    @GetMapping("setReceiver")
    public Object setReceiver();

    @GetMapping("searchTechnologyByTechnologyId")
    public EUDataGridResult searchTechnologyByTechnologyId(String arg2, int arg1, int arg0);

    @GetMapping("setMaterialId")
    public Object setMaterialId();

    @GetMapping("getOverfulfilCapacity")
    public Object getOverfulfilCapacity();

    @GetMapping("getStandardCapacity")
    public Object getStandardCapacity();

    @GetMapping("setConsumeAmount")
    public Object setConsumeAmount();

    @GetMapping("getTechnologyName")
    public Object getTechnologyName();

    @GetMapping("getTechnologyId")
    public Object getTechnologyId();

    @GetMapping("getVitalProcessPeriod")
    public Object getVitalProcessPeriod();

    @GetMapping("setOvertimeOverfulfilCapacity")
    public Object setOvertimeOverfulfilCapacity();

    @GetMapping("setConsumeDate")
    public Object setConsumeDate();

    @GetMapping("setDoubleCapacity")
    public Object setDoubleCapacity();

    @GetMapping("setOvertimeStandardCapacity")
    public Object setOvertimeStandardCapacity();

    @GetMapping("getDoubleCapacity")
    public Object getDoubleCapacity();

    @GetMapping("setConsumeId")
    public Object setConsumeId();

    @GetMapping("setOverfulfilCapacity")
    public Object setOverfulfilCapacity();

    @GetMapping("getPrice")
    public Object getPrice();

    @GetMapping("setStandardCapacity")
    public Object setStandardCapacity();

    @GetMapping("setSender")
    public Object setSender();

    @GetMapping("setPrice")
    public Object setPrice();

    @GetMapping("setVitalProcessPeriod")
    public Object setVitalProcessPeriod();

    @GetMapping("getOvertimeStandardCapacity")
    public Object getOvertimeStandardCapacity();

}
