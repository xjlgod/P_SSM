package com.msa.coder.subordinate.general.*;

import com.msa.coder.subordinate.entity.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.access.*;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.Data;

@Data
public class SysPermission {
    /**
    * object fields.
    */
    @Autowired
    private String percode;

    @Autowired
    private String sortstring;

    @Autowired
    private String available;

    @Autowired
    private String name;

    @Autowired
    private String parentids;

    @Autowired
    private String type;

    @Autowired
    private String url;

    /**
    * not object fields.
    */
    private long id;

    private long parentid;

    /**
    * methods.
    */
    public long getParentid() {
    // TODO
    }

    public long getId() {
    // TODO
    }

    public void setId(long arg0) {
    // TODO
    }

    public void setPercode(String arg0) {
    // TODO
    }

    public String getParentids() {
    // TODO
    }

    public void setType(String arg0) {
    // TODO
    }

    public String getType() {
    // TODO
    }

    public String getAvailable() {
    // TODO
    }

    public void setParentid(long arg0) {
    // TODO
    }

    public String getUrl() {
    // TODO
    }

    public void setUrl(String arg0) {
    // TODO
    }

    public String getName() {
    // TODO
    }

    public String getSortstring() {
    // TODO
    }

    public  SysPermission() {
    // TODO
    }

    public void setAvailable(String arg0) {
    // TODO
    }

    public void setSortstring(String arg0) {
    // TODO
    }

    public void setName(String arg0) {
    // TODO
    }

    public String getPercode() {
    // TODO
    }

    public void setParentids(String arg0) {
    // TODO
    }

}
