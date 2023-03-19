package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeMapper {
    /**
    * methods.
    */
    public Object searchEmployeeByDepartmentName(String arg0);

    public Object searchEmployeeByEmployeeName(String arg0);

    public int insert(Employee arg0);

    public int insertSelective(Employee arg0);

    public int deleteBatch(Object arg0);

    public Object find();

    public Object searchEmployeeByEmployeeId(String arg0);

    public int updateByExampleSelective(EmployeeExample arg1, Employee arg0);

    public int countByExample(EmployeeExample arg0);

    public int deleteByPrimaryKey(String arg0);

    public Employee selectByPrimaryKey(String arg0);

    public EmployeeVO selectSingleEmployee(String arg0);

    public Object selectByExample(EmployeeExample arg0);

    public int deleteByExample(EmployeeExample arg0);

    public int updateByPrimaryKeySelective(Employee arg0);

    public int updateByExample(EmployeeExample arg1, Employee arg0);

    public int updateByPrimaryKey(Employee arg0);

}
