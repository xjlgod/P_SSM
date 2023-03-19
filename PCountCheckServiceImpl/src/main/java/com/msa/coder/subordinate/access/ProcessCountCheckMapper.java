package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessCountCheckMapper {
    /**
    * methods.
    */
    public int deleteByExample(ProcessCountCheckExample arg0);

    public int insert(ProcessCountCheck arg0);

    public int deleteBatch(Object arg0);

    public int updateByExample(ProcessCountCheckExample arg1, ProcessCountCheck arg0);

    public Object selectByExample(ProcessCountCheckExample arg0);

    public int updateNote(ProcessCountCheck arg0);

    public int updateByExampleSelective(ProcessCountCheckExample arg1, ProcessCountCheck arg0);

    public int deleteByPrimaryKey(String arg0);

    public int updateByPrimaryKeySelective(ProcessCountCheck arg0);

    public ProcessCountCheck selectByPrimaryKey(String arg0);

    public int insertSelective(ProcessCountCheck arg0);

    public int countByExample(ProcessCountCheckExample arg0);

    public int updateByPrimaryKey(ProcessCountCheck arg0);

    public Object searchPCountCheckByPCountCheckId(String arg0);

    public Object find(ProcessCountCheck arg0);

}
