package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class MaterialConsumeController {
    /**
    * object fields.
    */
    @Autowired
    private MaterialConsumeService materialConsumeService;

    /**
    * methods.
    */
    public MaterialConsume getItemById(String arg0) {
    // TODO
    }

    private CustomResult update(Object arg1, MaterialConsume arg0) {
    // TODO
    }

    private CustomResult delete(String arg0) {
    // TODO
    }

    public EUDataGridResult searchMaterialConsumeByWorkId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, MaterialConsume arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, MaterialConsume arg0) {
    // TODO
    }

    public EUDataGridResult getList(MaterialConsumeVO arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchMaterialConsumeByConsumeId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchMaterialConsumeByMaterialId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, MaterialConsume arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public  MaterialConsumeController() {
    // TODO
    }

    public String add() {
    // TODO
    }

}
