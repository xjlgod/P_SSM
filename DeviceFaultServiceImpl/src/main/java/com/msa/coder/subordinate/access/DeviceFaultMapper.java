package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceFaultMapper {
    /**
    * methods.
    */
    public Object selectByExample(DeviceFaultExample arg0);

    public Object searchDeviceFaultByDeviceFaultId(String arg0);

    public Object searchDeviceFaultByDeviceName(String arg0);

    public int updateByPrimaryKeySelective(DeviceFault arg0);

    public int insertSelective(DeviceFault arg0);

    public int updateNote(DeviceFault arg0);

    public int deleteBatch(Object arg0);

    public DeviceFault selectByPrimaryKey(String arg0);

    public Object find(DeviceFault arg0);

    public int insert(DeviceFault arg0);

    public int deleteByPrimaryKey(String arg0);

    public int updateByExample(DeviceFaultExample arg1, DeviceFault arg0);

    public int deleteByExample(DeviceFaultExample arg0);

    public Object getData();

    public int updateByPrimaryKey(DeviceFault arg0);

    public int countByExample(DeviceFaultExample arg0);

    public int updateByExampleSelective(DeviceFaultExample arg1, DeviceFault arg0);

}
