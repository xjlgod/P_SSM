package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "DeviceCheckServiceImpl", fallback = DeviceCheckServiceImplClientFallback.class)
public interface DeviceCheckServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("setDeviceFaultDate")
    public Object setDeviceFaultDate();

    @GetMapping("setDeviceFaultId")
    public Object setDeviceFaultId();

    @GetMapping("setDeviceFaultMaintenance")
    public Object setDeviceFaultMaintenance();

    @GetMapping("setDeviceFaultDetail")
    public Object setDeviceFaultDetail();

    @GetMapping("setDeviceFaultCause")
    public Object setDeviceFaultCause();

}
