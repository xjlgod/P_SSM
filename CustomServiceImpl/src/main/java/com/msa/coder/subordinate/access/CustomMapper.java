package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomMapper {
    /**
    * methods.
    */
    public int updateByExample(CustomExample arg1, Custom arg0);

    public int insert(Custom arg0);

    public int updateByExampleSelective(CustomExample arg1, Custom arg0);

    public int updateByPrimaryKey(Custom arg0);

    public Object selectByExample(CustomExample arg0);

    public int updateByPrimaryKeySelective(Custom arg0);

    public int deleteBatch(Object arg0);

    public int changeStatus(Object arg0);

    public int insertSelective(Custom arg0);

    public int deleteByExample(CustomExample arg0);

    public int updateNote(Custom arg0);

    public Object searchCustomByCustomId(String arg0);

    public int deleteByPrimaryKey(String arg0);

    public Custom selectByPrimaryKey(String arg0);

    public int countByExample(CustomExample arg0);

    public Object searchCustomByCustomName(String arg0);

}
