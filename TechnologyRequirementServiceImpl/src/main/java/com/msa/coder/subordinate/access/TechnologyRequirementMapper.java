package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRequirementMapper {
    /**
    * methods.
    */
    public TechnologyRequirement selectByPrimaryKey(String arg0);

    public int updateByExample(TechnologyRequirementExample arg1, TechnologyRequirement arg0);

    public Object selectByExample(TechnologyRequirementExample arg0);

    public int deleteByExample(TechnologyRequirementExample arg0);

    public int countByExample(TechnologyRequirementExample arg0);

    public int updateByExampleSelective(TechnologyRequirementExample arg1, TechnologyRequirement arg0);

    public int deleteBatch(Object arg0);

    public int updateByPrimaryKey(TechnologyRequirement arg0);

    public Object find(TechnologyRequirement arg0);

    public Object searchTechnologyRequirementByTechnologyName(String arg0);

    public int insert(TechnologyRequirement arg0);

    public int deleteByPrimaryKey(String arg0);

    public Object searchTechnologyRequirementByTechnologyRequirementId(String arg0);

    public int updateByPrimaryKeySelective(TechnologyRequirement arg0);

    public int insertSelective(TechnologyRequirement arg0);

    public int updateRequirement(TechnologyRequirement arg0);

}
