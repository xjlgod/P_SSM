package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "MeasureServiceImpl", fallback = MeasureServiceImplClientFallback.class)
public interface MeasureServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("setDeviceTypeSpec")
    public Object setDeviceTypeSpec();

    @GetMapping("setDeviceTypeId")
    public Object setDeviceTypeId();

    @GetMapping("setDeviceTypeProducer")
    public Object setDeviceTypeProducer();

    @GetMapping("getStatus")
    public Object getStatus();

    @GetMapping("setDeviceTypeModel")
    public Object setDeviceTypeModel();

    @GetMapping("setDeviceTypeQuantity")
    public Object setDeviceTypeQuantity();

    @GetMapping("getData")
    public Object getData();

    @GetMapping("setDeviceTypeWarranty")
    public Object setDeviceTypeWarranty();

    @GetMapping("getMsg")
    public Object getMsg();

    @GetMapping("setDeviceTypeName")
    public Object setDeviceTypeName();

    @GetMapping("setDeviceTypeSupplier")
    public Object setDeviceTypeSupplier();

    @GetMapping("getfMeasureCheckId")
    public Object getfMeasureCheckId();

}
