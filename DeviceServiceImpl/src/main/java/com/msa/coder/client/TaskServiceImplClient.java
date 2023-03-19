package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "TaskServiceImpl", fallback = TaskServiceImplClientFallback.class)
public interface TaskServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("edit")
    public Object edit();

    @GetMapping("authorityJudge")
    public Object authorityJudge();

    @GetMapping("setWorkingHours")
    public Object setWorkingHours();

    @GetMapping("add")
    public Object add();

    @GetMapping("setWorkId")
    public Object setWorkId();

    @GetMapping("getTaskId")
    public Object getTaskId();

    @GetMapping("setManufactureSn")
    public Object setManufactureSn();

    @GetMapping("init")
    public Object init();

    @GetMapping("setTaskId")
    public Object setTaskId();

    @GetMapping("getTaskQuantity")
    public Object getTaskQuantity();

    @GetMapping("getWorkId")
    public Object getWorkId();

    @GetMapping("setTaskQuantity")
    public Object setTaskQuantity();

    @GetMapping("getManufactureSn")
    public Object getManufactureSn();

    @GetMapping("getItemList")
    public Object getItemList();

    @GetMapping("insert")
    public CustomResult insert(Department arg0);

    @GetMapping("updateAll")
    public CustomResult updateAll(Department arg0);

    @GetMapping("deleteBatch")
    public CustomResult deleteBatch(Object arg0);

    @GetMapping("getWorkingHours")
    public Object getWorkingHours();

    @GetMapping("searchTaskByTaskId")
    public EUDataGridResult searchTaskByTaskId(String arg2, int arg1, int arg0);

}
