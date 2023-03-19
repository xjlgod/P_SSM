package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialConsumeMapper {
    /**
    * methods.
    */
    public Object searchMaterialConsumeByConsumeId(String arg0);

    public MaterialConsume selectByPrimaryKey(String arg0);

    public int insert(MaterialConsume arg0);

    public int updateByExample(MaterialConsumeExample arg1, MaterialConsume arg0);

    public int updateNote(MaterialConsume arg0);

    public Object searchMaterialConsumeByMaterialId(String arg0);

    public int deleteBatch(Object arg0);

    public Object find(MaterialConsumeVO arg0);

    public Object selectByExample(MaterialConsumeExample arg0);

    public Object searchMaterialConsumeByWorkId(String arg0);

    public int insertSelective(MaterialConsume arg0);

    public int updateByPrimaryKey(MaterialConsume arg0);

    public int updateByExampleSelective(MaterialConsumeExample arg1, MaterialConsume arg0);

    public int countByExample(MaterialConsumeExample arg0);

    public int deleteByExample(MaterialConsumeExample arg0);

    public int deleteByPrimaryKey(String arg0);

    public int updateByPrimaryKeySelective(MaterialConsume arg0);

}
