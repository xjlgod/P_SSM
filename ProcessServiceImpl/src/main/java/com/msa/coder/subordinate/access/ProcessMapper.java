package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessMapper {
    /**
    * methods.
    */
    public int insertSelective(Process arg0);

    public Object searchProcessByTechnologyPlanId(String arg0);

    public Object selectByExample(ProcessExample arg0);

    public Object searchProcessByProcessId(String arg0);

    public int updateByExampleSelective(ProcessExample arg1, Process arg0);

    public int countByExample(ProcessExample arg0);

    public int deleteBatch(Object arg0);

    public int updateByPrimaryKey(Process arg0);

    public int insert(Process arg0);

    public int updateByPrimaryKeySelective(Process arg0);

    public int deleteByExample(ProcessExample arg0);

    public int deleteByPrimaryKey(String arg0);

    public int updateByExample(ProcessExample arg1, Process arg0);

    public Process selectByPrimaryKey(String arg0);

}
