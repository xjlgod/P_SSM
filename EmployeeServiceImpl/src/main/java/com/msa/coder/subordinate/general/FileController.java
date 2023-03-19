package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class FileController {
    /**
    * object fields.
    */
    @Autowired
    private FileService fileService;

    /**
    * methods.
    */
    public String handleFileDelete(String arg0) {
    // TODO
    }

    public  FileController() {
    // TODO
    }

    public void handleFileDownload(Object arg1, String arg0) {
    // TODO
    }

    public String handleFileUpload(Object arg0) {
    // TODO
    }

}
