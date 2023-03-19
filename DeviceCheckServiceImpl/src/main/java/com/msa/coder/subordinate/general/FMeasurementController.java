package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class FMeasurementController {
    /**
    * object fields.
    */
    @Autowired
    private MeasureService measureService;

    /**
    * methods.
    */
    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    public EUDataGridResult searchFMeasureCheckByFMeasureCheckId(String arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchFMeasureCheckByOrderId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, FinalMeasuretCheck arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, FinalMeasuretCheck arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public EUDataGridResult getList(FinalMeasuretCheck arg2, int arg1, int arg0) {
    // TODO
    }

    public  FMeasurementController() {
    // TODO
    }

    public String find() {
    // TODO
    }

    private CustomResult updateNote(Object arg1, FinalMeasuretCheck arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

    public FinalMeasuretCheck getItemById(String arg0) {
    // TODO
    }

}
