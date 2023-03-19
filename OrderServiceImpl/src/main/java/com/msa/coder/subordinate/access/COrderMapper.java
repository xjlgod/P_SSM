package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface COrderMapper {
    /**
    * methods.
    */
    public int updateNote(COrder arg0);

    public int updateByPrimaryKey(COrder arg0);

    public int updateByPrimaryKeySelective(COrder arg0);

    public int deleteBatch(Object arg0);

    public int changeStatus(Object arg0);

    public int insertSelective(COrder arg0);

    public int countByExample(COrderExample arg0);

    public int updateByExample(COrderExample arg1, COrder arg0);

    public int updateByExampleSelective(COrderExample arg1, COrder arg0);

    public int deleteByExample(COrderExample arg0);

    public COrderVO selectByPrimaryKey(String arg0);

    public int insert(COrder arg0);

    public int deleteByPrimaryKey(String arg0);

    public Object searchOrderByOrderId(String arg0);

    public Object selectByExample(COrderExample arg0);

    public Object find(COrderVO arg0);

    public Object searchOrderByCustomName(String arg0);

    public Object searchOrderByProductName(String arg0);

}
