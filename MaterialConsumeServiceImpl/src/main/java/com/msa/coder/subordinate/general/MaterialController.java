package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class MaterialController {
    /**
    * object fields.
    */
    @Autowired
    private MaterialService materialService;

    /**
    * methods.
    */
    private CustomResult delete(String arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, Material arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, Material arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public EUDataGridResult searchMaterialByMaterialType(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String find() {
    // TODO
    }

    public Material getItemById(String arg0) {
    // TODO
    }

    public  MaterialController() {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public EUDataGridResult searchMaterialByMaterialId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, Material arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

    public EUDataGridResult getItemList(Material arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, Material arg0) {
    // TODO
    }

}
