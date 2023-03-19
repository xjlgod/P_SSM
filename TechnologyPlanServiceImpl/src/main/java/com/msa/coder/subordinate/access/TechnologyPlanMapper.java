package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyPlanMapper {
    /**
    * methods.
    */
    public Object searchTechnologyPlanByTechnologyName(String arg0);

    public Object find(TechnologyPlan arg0);

    public TechnologyPlan selectByPrimaryKey(String arg0);

    public int insert(TechnologyPlan arg0);

    public int deleteBatch(Object arg0);

    public int updateByPrimaryKeySelective(TechnologyPlan arg0);

    public Object searchTechnologyPlanByTechnologyPlanId(String arg0);

    public int deleteByExample(TechnologyPlanExample arg0);

    public int deleteByPrimaryKey(String arg0);

    public int insertSelective(TechnologyPlan arg0);

    public int updateByExample(TechnologyPlanExample arg1, TechnologyPlan arg0);

    public Object selectByExample(TechnologyPlanExample arg0);

    public int countByExample(TechnologyPlanExample arg0);

    public int updateByPrimaryKey(TechnologyPlan arg0);

    public int updateByExampleSelective(TechnologyPlanExample arg1, TechnologyPlan arg0);

}
