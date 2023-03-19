package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class TechnologyRequirementController {
    /**
    * object fields.
    */
    @Autowired
    private TechnologyRequirementService technologyRequirementService;

    /**
    * methods.
    */
    public TechnologyRequirement getItemById(String arg0) {
    // TODO
    }

    public EUDataGridResult searchTechnologyRequirementByTechnologyRequirementId(String arg2, int arg1, int arg0) {
    // TODO
    }

    private CustomResult deleteBatch(Object arg0) {
    // TODO
    }

    private CustomResult insert(Object arg1, TechnologyRequirement arg0) {
    // TODO
    }

    private CustomResult updateAll(Object arg1, TechnologyRequirement arg0) {
    // TODO
    }

    private CustomResult updateNote(Object arg1, TechnologyRequirement arg0) {
    // TODO
    }

    public String edit() {
    // TODO
    }

    public  TechnologyRequirementController() {
    // TODO
    }

    public String find() {
    // TODO
    }

    public Object getData() {
    // TODO
    }

    public EUDataGridResult getItemList(TechnologyRequirementVO arg2, int arg1, int arg0) {
    // TODO
    }

    public EUDataGridResult searchTechnologyRequirementByTechnologyName(String arg2, int arg1, int arg0) {
    // TODO
    }

    public String add() {
    // TODO
    }

}
