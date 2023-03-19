package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "ManufactureServiceImpl", fallback = ManufactureServiceImplClientFallback.class)
public interface ManufactureServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getBeginDate")
    public Object getBeginDate();

    @GetMapping("getcOrder")
    public Object getcOrder();

    @GetMapping("searchManufactureByManufactureSn")
    public EUDataGridResult searchManufactureByManufactureSn(String arg2, int arg1, int arg0);

    @GetMapping("getEndDate")
    public Object getEndDate();

    @GetMapping("getTechnology")
    public Object getTechnology();

    @GetMapping("getLaunchQuantity")
    public Object getLaunchQuantity();

}
