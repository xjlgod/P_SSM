package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface FinalCountCheckMapper {
    /**
    * methods.
    */
    public Object searchFCountCheckByFCountCheckId(String arg0);

    public int updateByExample(FinalCountCheckExample arg1, FinalCountCheck arg0);

    public int deleteBatch(Object arg0);

    public int insertSelective(FinalCountCheck arg0);

    public FinalCountCheck selectByPrimaryKey(String arg0);

    public Object find(FinalCountCheck arg0);

    public int updateByPrimaryKeySelective(FinalCountCheck arg0);

    public int updateByPrimaryKey(FinalCountCheck arg0);

    public int deleteByPrimaryKey(String arg0);

    public int countByExample(FinalCountCheckExample arg0);

    public int deleteByExample(FinalCountCheckExample arg0);

    public int updateNote(FinalCountCheck arg0);

    public Object searchFCountCheckByOrderId(String arg0);

    public Object selectByExample(FinalCountCheckExample arg0);

    public int insert(FinalCountCheck arg0);

    public int updateByExampleSelective(FinalCountCheckExample arg1, FinalCountCheck arg0);

}
