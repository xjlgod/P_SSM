package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyMapper {
    /**
    * methods.
    */
    public int deleteByExample(TechnologyExample arg0);

    public int insert(Technology arg0);

    public int insertSelective(Technology arg0);

    public int updateByPrimaryKey(Technology arg0);

    public Object selectByExample(TechnologyExample arg0);

    public int deleteBatch(Object arg0);

    public Object searchTechnologyByTechnologyId(String arg0);

    public int countByExample(TechnologyExample arg0);

    public Technology selectByPrimaryKey(String arg0);

    public int deleteByPrimaryKey(String arg0);

    public int updateByPrimaryKeySelective(Technology arg0);

    public int updateByExampleSelective(TechnologyExample arg1, Technology arg0);

    public int updateByExample(TechnologyExample arg1, Technology arg0);

    public Object searchTechnologyByTechnologyName(String arg0);

}
