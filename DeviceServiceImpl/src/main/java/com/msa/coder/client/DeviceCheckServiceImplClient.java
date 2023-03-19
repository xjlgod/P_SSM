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
    @GetMapping("getDeviceCheckFaultId")
    public Object getDeviceCheckFaultId();

    @GetMapping("setDeviceCheckId")
    public Object setDeviceCheckId();

    @GetMapping("setDeviceCheckDate")
    public Object setDeviceCheckDate();

    @GetMapping("getDeviceFaultDate")
    public Object getDeviceFaultDate();

    @GetMapping("getDeviceCheckEmpId")
    public Object getDeviceCheckEmpId();

    @GetMapping("searchDeviceCheckByDeviceCheckId")
    public EUDataGridResult searchDeviceCheckByDeviceCheckId(String arg2, int arg1, int arg0);

    @GetMapping("getTotal")
    public Object getTotal();

    @GetMapping("getDeviceFaultCause")
    public Object getDeviceFaultCause();

    @GetMapping("getDeviceFaultMaintenance")
    public Object getDeviceFaultMaintenance();

    @GetMapping("setDeviceCheckFaultId")
    public Object setDeviceCheckFaultId();

    @GetMapping("getDeviceFaultId")
    public Object getDeviceFaultId();

    @GetMapping("getDeviceCheckEmp")
    public Object getDeviceCheckEmp();

    @GetMapping("setDeviceCheckResult")
    public Object setDeviceCheckResult();

    @GetMapping("setDeviceCheckEmpId")
    public Object setDeviceCheckEmpId();

    @GetMapping("getDeviceFaultDetail")
    public Object getDeviceFaultDetail();

    @GetMapping("getDeviceCheckDate")
    public Object getDeviceCheckDate();

    @GetMapping("getDeviceCheckId")
    public Object getDeviceCheckId();

    @GetMapping("getRows")
    public Object getRows();

    @GetMapping("getDeviceCheckResult")
    public Object getDeviceCheckResult();

}
