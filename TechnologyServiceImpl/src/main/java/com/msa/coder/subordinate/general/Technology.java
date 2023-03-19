package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class Technology {
    /**
    * object fields.
    */
    @Autowired
    private String vitalProcessPeriod;

    @Autowired
    private Object price;

    @Autowired
    private String technologyName;

    @Autowired
    private String technologyId;

    /**
    * not object fields.
    */
    private int doubleCapacity;

    private int overtimeOverfulfilCapacity;

    private int overtimeStandardCapacity;

    private int standardCapacity;

    private int overfulfilCapacity;

    /**
    * methods.
    */
    public void setOvertimeOverfulfilCapacity(int arg0) {
    // TODO
    }

    public void setTechnologyId(String arg0) {
    // TODO
    }

    public int getStandardCapacity() {
    // TODO
    }

    public  Technology() {
    // TODO
    }

    public int getOverfulfilCapacity() {
    // TODO
    }

    public String getTechnologyId() {
    // TODO
    }

    public String getVitalProcessPeriod() {
    // TODO
    }

    public void setPrice(Object arg0) {
    // TODO
    }

    public Object getPrice() {
    // TODO
    }

    public void setOvertimeStandardCapacity(int arg0) {
    // TODO
    }

    public String getTechnologyName() {
    // TODO
    }

    public void setTechnologyName(String arg0) {
    // TODO
    }

    public int getOvertimeStandardCapacity() {
    // TODO
    }

    public void setDoubleCapacity(int arg0) {
    // TODO
    }

    public void setStandardCapacity(int arg0) {
    // TODO
    }

    public int getDoubleCapacity() {
    // TODO
    }

    public void setOverfulfilCapacity(int arg0) {
    // TODO
    }

    public int getOvertimeOverfulfilCapacity() {
    // TODO
    }

    public void setVitalProcessPeriod(String arg0) {
    // TODO
    }

}
