package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "DeviceTypeServiceImpl", fallback = DeviceTypeServiceImplClientFallback.class)
public interface DeviceTypeServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getWork")
    public Object getWork();

    @GetMapping("getDeviceTypeSpec")
    public Object getDeviceTypeSpec();

    @GetMapping("deviceType")
    public Object deviceType();

    @GetMapping("deviceCheck")
    public Object deviceCheck();

    @GetMapping("getListType")
    public Object getListType();

    @GetMapping("getDeviceTypeWarranty")
    public Object getDeviceTypeWarranty();

    @GetMapping("deviceList")
    public Object deviceList();

    @GetMapping("update")
    public CustomResult update(Department arg0);

    @GetMapping("deviceMaintain")
    public Object deviceMaintain();

    @GetMapping("getDeviceTypeSupplier")
    public Object getDeviceTypeSupplier();

    @GetMapping("searchDeviceTypeByDeviceTypeId")
    public EUDataGridResult searchDeviceTypeByDeviceTypeId(String arg2, int arg1, int arg0);

    @GetMapping("getMaterial")
    public Object getMaterial();

    @GetMapping("getDeviceTypeQuantity")
    public Object getDeviceTypeQuantity();

    @GetMapping("getDeviceTypeModel")
    public Object getDeviceTypeModel();

    @GetMapping("getDeviceTypeProducer")
    public Object getDeviceTypeProducer();

    @GetMapping("deviceFault")
    public Object deviceFault();

    @GetMapping("getDeviceTypeName")
    public Object getDeviceTypeName();

    @GetMapping("getDeviceTypeIdd")
    public Object getDeviceTypeIdd();

}
