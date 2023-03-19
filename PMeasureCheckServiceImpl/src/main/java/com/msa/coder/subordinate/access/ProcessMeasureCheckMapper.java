package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessMeasureCheckMapper {
    /**
    * methods.
    */
    public int updateByPrimaryKeySelective(ProcessMeasureCheck arg0);

    public Object selectByExample(ProcessMeasureCheckExample arg0);

    public int countByExample(ProcessMeasureCheckExample arg0);

    public int updateByExample(ProcessMeasureCheckExample arg1, ProcessMeasureCheck arg0);

    public int insertSelective(ProcessMeasureCheck arg0);

    public int deleteBatch(Object arg0);

    public Object searchPMeasureCheckByPMeasureCheckId(String arg0);

    public int insert(ProcessMeasureCheck arg0);

    public int deleteByExample(ProcessMeasureCheckExample arg0);

    public int deleteByPrimaryKey(String arg0);

    public ProcessMeasureCheck selectByPrimaryKey(String arg0);

    public Object find(ProcessMeasureCheck arg0);

    public int updateByExampleSelective(ProcessMeasureCheckExample arg1, ProcessMeasureCheck arg0);

    public int updateByPrimaryKey(ProcessMeasureCheck arg0);

    public int updateNote(ProcessMeasureCheck arg0);

}
