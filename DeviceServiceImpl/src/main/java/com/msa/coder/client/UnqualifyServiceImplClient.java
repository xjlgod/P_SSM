package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "UnqualifyServiceImpl", fallback = UnqualifyServiceImplClientFallback.class)
public interface UnqualifyServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("getApplyDate")
    public Object getApplyDate();

    @GetMapping("getUnqualifyItem")
    public Object getUnqualifyItem();

    @GetMapping("setAssemblyDate")
    public Object setAssemblyDate();

    @GetMapping("setUnqualifyApplyId")
    public Object setUnqualifyApplyId();

    @GetMapping("getUnqualifyCount")
    public Object getUnqualifyCount();

    @GetMapping("setUnqualifyCount")
    public Object setUnqualifyCount();

    @GetMapping("getAssemblyDate")
    public Object getAssemblyDate();

    @GetMapping("searchUnqualifyByUnqualifyId")
    public EUDataGridResult searchUnqualifyByUnqualifyId(String arg2, int arg1, int arg0);

    @GetMapping("getUnqualifyApplyId")
    public Object getUnqualifyApplyId();

    @GetMapping("setUnqualifyItem")
    public Object setUnqualifyItem();

    @GetMapping("setApplyDate")
    public Object setApplyDate();

}
