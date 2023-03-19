package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "FileServiceImpl", fallback = FileServiceImplClientFallback.class)
public interface FileServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("setDeviceStatusId")
    public Object setDeviceStatusId();

    @GetMapping("getDevicePurchaseDate")
    public Object getDevicePurchaseDate();

    @GetMapping("getDeviceStatusId")
    public Object getDeviceStatusId();

    @GetMapping("getDeviceId")
    public Object getDeviceId();

    @GetMapping("getDeviceKeeper")
    public Object getDeviceKeeper();

    @GetMapping("setDevicePurchaseDate")
    public Object setDevicePurchaseDate();

    @GetMapping("home")
    public Object home();

    @GetMapping("setDeviceName")
    public Object setDeviceName();

    @GetMapping("setDeviceKeeper")
    public Object setDeviceKeeper();

    @GetMapping("getDeviceServiceLife")
    public Object getDeviceServiceLife();

    @GetMapping("setNote")
    public Object setNote();

    @GetMapping("getDeviceName")
    public Object getDeviceName();

    @GetMapping("getDeviceIdd")
    public Object getDeviceIdd();

    @GetMapping("setDeviceKeeperId")
    public Object setDeviceKeeperId();

    @GetMapping("getDeviceManufactureDate")
    public Object getDeviceManufactureDate();

    @GetMapping("getDevicePurchasePrice")
    public Object getDevicePurchasePrice();

    @GetMapping("first")
    public Object first();

    @GetMapping("getDeviceKeeperId")
    public Object getDeviceKeeperId();

    @GetMapping("setDevicePurchasePrice")
    public Object setDevicePurchasePrice();

    @GetMapping("getDeviceStatus")
    public Object getDeviceStatus();

    @GetMapping("setDeviceManufactureDate")
    public Object setDeviceManufactureDate();

    @GetMapping("setDeviceServiceLife")
    public Object setDeviceServiceLife();

    @GetMapping("getNote")
    public Object getNote();

    @GetMapping("getDeviceTypeId")
    public Object getDeviceTypeId();

}
