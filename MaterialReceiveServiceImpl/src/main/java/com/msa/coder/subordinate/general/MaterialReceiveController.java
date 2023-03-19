package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class MaterialReceiveController {
    /**
    * object fields.
    */
    @Autowired
    private MaterialReceiveService materialReceiveService;

    /**
    * methods.
    */
    private CustomResult updateAll(Object arg1, MaterialReceive arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    public EUDataGridResult searchMaterialReceiveByMaterialId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult getList(int arg1, int arg0) {
    // TODO
    }

    public MaterialReceive getItemById(String arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, MaterialReceive arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, MaterialReceive arg0) {
    // TODO
    }

    public EUDataGridResult searchMaterialReceiveByReceiveId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public  MaterialReceiveController() {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    private CustomResult update(Object arg1, MaterialReceive arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
