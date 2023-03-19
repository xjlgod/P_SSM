package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceMapper {
    /**
    * methods.
    */
    public int countByExample(DeviceExample arg0);

    public int updateByExampleSelective(DeviceExample arg1, Device arg0);

    public Object searchDeviceByDeviceId(String arg0);

    public Object selectByExample(DeviceExample arg0);

    public int updateByExample(DeviceExample arg1, Device arg0);

    public int deleteByExample(DeviceExample arg0);

    public Device selectByPrimaryKey(String arg0);

    public Object searchDeviceByDeviceName(String arg0);

    public int deleteBatch(Object arg0);

    public int insert(Device arg0);

    public int insertSelective(Device arg0);

    public int updateByPrimaryKeySelective(Device arg0);

    public Object searchDeviceByDeviceTypeName(String arg0);

    public int deleteByPrimaryKey(String arg0);

    public int updateByPrimaryKey(Device arg0);

    public Object getData();

    public Object find(Device arg0);

    public int updateNote(Device arg0);

}
