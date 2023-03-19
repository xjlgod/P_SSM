package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialReceiveMapper {
    /**
    * methods.
    */
    public Object searchMaterialReceiveByReceiveId(String arg0);

    public int updateByExample(MaterialReceiveExample arg1, MaterialReceive arg0);

    public int updateByPrimaryKeySelective(MaterialReceive arg0);

    public int insertSelective(MaterialReceive arg0);

    public Object searchMaterialReceiveByMaterialId(String arg0);

    public MaterialReceive selectByPrimaryKey(String arg0);

    public int updateNote(MaterialReceive arg0);

    public int insert(MaterialReceive arg0);

    public int deleteBatch(Object arg0);

    public Object find();

    public int updateByPrimaryKey(MaterialReceive arg0);

    public int countByExample(MaterialReceiveExample arg0);

    public int deleteByPrimaryKey(String arg0);

    public int deleteByExample(MaterialReceiveExample arg0);

    public Object selectByExample(MaterialReceiveExample arg0);

    public int updateByExampleSelective(MaterialReceiveExample arg1, MaterialReceive arg0);

}
