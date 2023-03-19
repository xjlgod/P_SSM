package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceMaintainMapper {
    /**
    * methods.
    */
    public Object searchDeviceMaintainByDeviceFaultId(String arg0);

    public DeviceMaintain selectByPrimaryKey(String arg0);

    public Object find(DeviceMaintain arg0);

    public int updateByExample(DeviceMaintainExample arg1, DeviceMaintain arg0);

    public int updateByPrimaryKeySelective(DeviceMaintain arg0);

    public int deleteBatch(Object arg0);

    public int insert(DeviceMaintain arg0);

    public int insertSelective(DeviceMaintain arg0);

    public Object searchDeviceMaintainByDeviceMaintainId(String arg0);

    public Object selectByExample(DeviceMaintainExample arg0);

    public int updateByPrimaryKey(DeviceMaintain arg0);

    public int deleteByPrimaryKey(String arg0);

    public int deleteByExample(DeviceMaintainExample arg0);

    public int updateByExampleSelective(DeviceMaintainExample arg1, DeviceMaintain arg0);

    public int countByExample(DeviceMaintainExample arg0);

    public int updateNote(DeviceMaintain arg0);

}
