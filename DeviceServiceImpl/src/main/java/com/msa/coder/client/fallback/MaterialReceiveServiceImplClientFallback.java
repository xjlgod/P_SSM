package com.msa.coder.client.fallback;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.subordinate.access.*;
import com.msa.coder.subordinate.entity.*;
import com.msa.coder.client.*;
import org.springframework.stereotype.Component;

@Component
public class MaterialReceiveServiceImplClientFallback implements MaterialReceiveServiceImplClient {
    /**
    * interface methods, if the return param is Object, please check return param and need params
    according to corresponding service interface, maybe controller class not implement this interface.
    */
    @Override
    public Object setReceiveId() {
    // TODO
    }

    @Override
    public Object getreceiver() {
    // TODO
    }

    @Override
    public Object setreceiver() {
    // TODO
    }

    @Override
    public EUDataGridResult searchMaterialReceiveByReceiveId(String arg2, int arg1, int arg0) {
    // TODO
    }

    @Override
    public Object getReceiveDate() {
    // TODO
    }

    @Override
    public Object getAmount() {
    // TODO
    }

    @Override
    public Object getReceiveId() {
    // TODO
    }

    @Override
    public Object setReceiveDate() {
    // TODO
    }

}
