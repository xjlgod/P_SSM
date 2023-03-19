package com.msa.coder.subordinate.access;

import com.msa.coder.subordinate.general.*;
import com.msa.coder.controller.*;
import com.msa.coder.subordinate.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface FinalMeasuretCheckMapper {
    /**
    * methods.
    */
    public int updateByPrimaryKey(FinalMeasuretCheck arg0);

    public int updateNote(FinalMeasuretCheck arg0);

    public int updateByPrimaryKeySelective(FinalMeasuretCheck arg0);

    public int deleteBatch(Object arg0);

    public Object searchFMeasureCheckByOrderId(String arg0);

    public Object find(FinalMeasuretCheck arg0);

    public Object searchFMeasureCheckByFMeasureCheckId(String arg0);

    public int deleteByPrimaryKey(String arg0);

    public int updateByExample(FinalMeasuretCheckExample arg1, FinalMeasuretCheck arg0);

    public int countByExample(FinalMeasuretCheckExample arg0);

    public int insert(FinalMeasuretCheck arg0);

    public Object selectByExample(FinalMeasuretCheckExample arg0);

    public FinalMeasuretCheck selectByPrimaryKey(String arg0);

    public int deleteByExample(FinalMeasuretCheckExample arg0);

    public int insertSelective(FinalMeasuretCheck arg0);

    public int updateByExampleSelective(FinalMeasuretCheckExample arg1, FinalMeasuretCheck arg0);

}
