package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    /**
    * methods.
    */
    public int updateByExampleSelective(ProductExample arg1, Product arg0);

    public int insert(Product arg0);

    public int updateByPrimaryKey(Product arg0);

    public Object selectByExample(ProductExample arg0);

    public Object searchProductByProductId(String arg0);

    public int deleteByExample(ProductExample arg0);

    public int deleteBatch(Object arg0);

    public int updateByPrimaryKeySelective(Product arg0);

    public int changeStatus(Object arg0);

    public int insertSelective(Product arg0);

    public int updateByExample(ProductExample arg1, Product arg0);

    public int deleteByPrimaryKey(String arg0);

    public Object searchProductByProductName(String arg0);

    public int countByExample(ProductExample arg0);

    public Product selectByPrimaryKey(String arg0);

    public Object searchProductByProductType(String arg0);

    public int updateNote(Product arg0);

}
