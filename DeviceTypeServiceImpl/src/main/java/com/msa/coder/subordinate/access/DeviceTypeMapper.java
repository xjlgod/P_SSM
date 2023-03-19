package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceTypeMapper {
    /**
    * methods.
    */
    public int updateByExampleSelective(DeviceTypeExample arg1, DeviceType arg0);

    public Object searchDeviceTypeByDeviceTypeName(String arg0);

    public Object listType();

    public int deleteBatch(Object arg0);

    public Object find(DeviceType arg0);

    public int updateByPrimaryKey(DeviceType arg0);

    public int updateByExample(DeviceTypeExample arg1, DeviceType arg0);

    public int updateByPrimaryKeySelective(DeviceType arg0);

    public int deleteByPrimaryKey(String arg0);

    public int insertSelective(DeviceType arg0);

    public Object searchDeviceTypeByDeviceTypeId(String arg0);

    public Object selectByExample(DeviceTypeExample arg0);

    public DeviceType selectByPrimaryKey(String arg0);

    public int countByExample(DeviceTypeExample arg0);

    public int insert(DeviceType arg0);

    public int deleteByExample(DeviceTypeExample arg0);

}
