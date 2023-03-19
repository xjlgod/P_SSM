package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufactureMapper {
    /**
    * methods.
    */
    public int insertSelective(Manufacture arg0);

    public int deleteByExample(ManufactureExample arg0);

    public int countByExample(ManufactureExample arg0);

    public int updateByExampleSelective(ManufactureExample arg1, Manufacture arg0);

    public int deleteBatch(Object arg0);

    public Object find();

    public int updateByPrimaryKey(Manufacture arg0);

    public int updateByExample(ManufactureExample arg1, Manufacture arg0);

    public int insert(Manufacture arg0);

    public ManufactureVO selectByPrimaryKey(String arg0);

    public int deleteByPrimaryKey(String arg0);

    public Object searchManufactureByManufactureTechnologyName(String arg0);

    public Object selectByExample(ManufactureExample arg0);

    public int updateByPrimaryKeySelective(Manufacture arg0);

    public Object searchManufactureByManufactureOrderId(String arg0);

    public Object searchManufactureByManufactureSn(String arg0);

}
