package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskMapper {
    /**
    * methods.
    */
    public int insert(Task arg0);

    public int deleteByExample(TaskExample arg0);

    public Object searchTaskByTaskManufactureSn(String arg0);

    public int countByExample(TaskExample arg0);

    public int deleteBatch(Object arg0);

    public int updateByExample(TaskExample arg1, Task arg0);

    public Object find();

    public Object selectByExample(TaskExample arg0);

    public Object searchTaskByTaskId(String arg0);

    public int updateByPrimaryKeySelective(Task arg0);

    public int deleteByPrimaryKey(String arg0);

    public int insertSelective(Task arg0);

    public int updateByPrimaryKey(Task arg0);

    public Object searchTaskByTaskWorkId(String arg0);

    public Task selectByPrimaryKey(String arg0);

    public int updateByExampleSelective(TaskExample arg1, Task arg0);

}
