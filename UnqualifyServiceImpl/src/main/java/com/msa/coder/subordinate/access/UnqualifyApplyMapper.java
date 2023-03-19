package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UnqualifyApplyMapper {
    /**
    * methods.
    */
    public Object selectByExample(UnqualifyApplyExample arg0);

    public int updateByPrimaryKeySelective(UnqualifyApply arg0);

    public UnqualifyApply selectByPrimaryKey(String arg0);

    public Object searchUnqualifyByUnqualifyId(String arg0);

    public Object find(UnqualifyApply arg0);

    public int deleteBatch(Object arg0);

    public int updateNote(UnqualifyApply arg0);

    public Object searchUnqualifyByProductName(String arg0);

    public int updateByExample(UnqualifyApplyExample arg1, UnqualifyApply arg0);

    public int deleteByPrimaryKey(String arg0);

    public int deleteByExample(UnqualifyApplyExample arg0);

    public int updateByPrimaryKey(UnqualifyApply arg0);

    public int insert(UnqualifyApply arg0);

    public int updateByExampleSelective(UnqualifyApplyExample arg1, UnqualifyApply arg0);

    public int countByExample(UnqualifyApplyExample arg0);

    public int insertSelective(UnqualifyApply arg0);

}
