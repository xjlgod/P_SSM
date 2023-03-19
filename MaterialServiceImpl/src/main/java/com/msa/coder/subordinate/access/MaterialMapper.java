package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialMapper {
    /**
    * methods.
    */
    public Object selectByExample(MaterialExample arg0);

    public int countByExample(MaterialExample arg0);

    public int deleteByExample(MaterialExample arg0);

    public int updateByExample(MaterialExample arg1, Material arg0);

    public int deleteBatch(Object arg0);

    public int changeStatus(Object arg0);

    public int updateNote(Material arg0);

    public int updateByPrimaryKeySelective(Material arg0);

    public int insertSelective(Material arg0);

    public int deleteByPrimaryKey(String arg0);

    public int updateByPrimaryKey(Material arg0);

    public int insert(Material arg0);

    public Object searchMaterialByMaterialId(String arg0);

    public Object searchMaterialByMaterialType(String arg0);

    public Material selectByPrimaryKey(String arg0);

    public int updateByExampleSelective(MaterialExample arg1, Material arg0);

}
