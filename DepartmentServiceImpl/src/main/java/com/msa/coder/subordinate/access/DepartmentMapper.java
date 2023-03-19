package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentMapper {
    /**
    * methods.
    */
    public int updateByPrimaryKey(Department arg0);

    public int updateByPrimaryKeySelective(Department arg0);

    public Object searchDepartmentByDepartmentId(String arg0);

    public Object selectByExample(DepartmentExample arg0);

    public int updateByExampleSelective(DepartmentExample arg1, Department arg0);

    public int updateByExample(DepartmentExample arg1, Department arg0);

    public int deleteBatch(Object arg0);

    public int countByExample(DepartmentExample arg0);

    public int insert(Department arg0);

    public int deleteByExample(DepartmentExample arg0);

    public int updateNote(Department arg0);

    public int deleteByPrimaryKey(String arg0);

    public int insertSelective(Department arg0);

    public Department selectByPrimaryKey(String arg0);

    public Object searchDepartmentByDepartmentName(String arg0);

}
