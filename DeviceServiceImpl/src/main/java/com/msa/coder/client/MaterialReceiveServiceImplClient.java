package com.msa.coder.client;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "MaterialReceiveServiceImpl", fallback = MaterialReceiveServiceImplClientFallback.class)
public interface MaterialReceiveServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @GetMapping("setReceiveId")
    public Object setReceiveId();

    @GetMapping("getreceiver")
    public Object getreceiver();

    @GetMapping("setreceiver")
    public Object setreceiver();

    @GetMapping("searchMaterialReceiveByReceiveId")
    public EUDataGridResult searchMaterialReceiveByReceiveId(String arg2, int arg1, int arg0);

    @GetMapping("getReceiveDate")
    public Object getReceiveDate();

    @GetMapping("getAmount")
    public Object getAmount();

    @GetMapping("getReceiveId")
    public Object getReceiveId();

    @GetMapping("setReceiveDate")
    public Object setReceiveDate();

}
