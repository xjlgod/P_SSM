package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class PictureController {
    /**
    * object fields.
    */
    @Autowired
    private PictureService pictureService;

    /**
    * methods.
    */
    public  PictureController() {
    // TODO
    }

    public String pictureUpload(Object arg0) {
    // TODO
    }

    public String pictureDelete(String arg0) {
    // TODO
    }

}
