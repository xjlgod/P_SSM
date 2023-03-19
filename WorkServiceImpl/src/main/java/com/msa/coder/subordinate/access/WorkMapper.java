package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkMapper {
    /**
    * methods.
    */
    public int updateByExample(WorkExample arg1, Work arg0);

    public int updateByExampleSelective(WorkExample arg1, Work arg0);

    public int countByExample(WorkExample arg0);

    public int deleteByExample(WorkExample arg0);

    public int insert(Work arg0);

    public int deleteBatch(Object arg0);

    public Object searchWorkByWorkProcess(String arg0);

    public Object searchWorkByWorkId(String arg0);

    public Object find();

    public int insertSelective(Work arg0);

    public Object searchWorkByWorkDevice(String arg0);

    public int updateByPrimaryKeySelective(Work arg0);

    public int deleteByPrimaryKey(String arg0);

    public Object searchWorkByWorkProduct(String arg0);

    public WorkVO selectByPrimaryKey(String arg0);

    public int updateByPrimaryKey(Work arg0);

    public Object selectByExample(WorkExample arg0);

}
