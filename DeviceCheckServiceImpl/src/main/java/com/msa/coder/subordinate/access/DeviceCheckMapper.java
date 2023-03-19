package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceCheckMapper {
    /**
    * methods.
    */
    public Object searchDeviceCheckByDeviceCheckId(String arg0);

    public int updateByExampleSelective(DeviceCheckExample arg1, DeviceCheck arg0);

    public int insertSelective(DeviceCheck arg0);

    public int updateNote(DeviceCheck arg0);

    public Object searchDeviceCheckByDeviceName(String arg0);

    public Object selectByExample(DeviceCheckExample arg0);

    public int deleteBatch(Object arg0);

    public int updateByPrimaryKey(DeviceCheck arg0);

    public int updateByExample(DeviceCheckExample arg1, DeviceCheck arg0);

    public DeviceCheck selectByPrimaryKey(String arg0);

    public int insert(DeviceCheck arg0);

    public int deleteByPrimaryKey(String arg0);

    public int countByExample(DeviceCheckExample arg0);

    public int updateByPrimaryKeySelective(DeviceCheck arg0);

    public int deleteByExample(DeviceCheckExample arg0);

    public Object find(DeviceCheck arg0);

}
