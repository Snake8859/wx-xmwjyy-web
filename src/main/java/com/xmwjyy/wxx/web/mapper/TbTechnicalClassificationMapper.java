package com.xmwjyy.wxx.web.mapper;

import com.xmwjyy.wxx.web.pojo.TbTechnicalClassification;
import com.xmwjyy.wxx.web.pojo.TbTechnicalClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTechnicalClassificationMapper {
    int countByExample(TbTechnicalClassificationExample example);

    int deleteByExample(TbTechnicalClassificationExample example);

    int deleteByPrimaryKey(Integer tcid);

    int insert(TbTechnicalClassification record);

    int insertSelective(TbTechnicalClassification record);

    List<TbTechnicalClassification> selectByExample(TbTechnicalClassificationExample example);

    TbTechnicalClassification selectByPrimaryKey(Integer tcid);

    int updateByExampleSelective(@Param("record") TbTechnicalClassification record, @Param("example") TbTechnicalClassificationExample example);

    int updateByExample(@Param("record") TbTechnicalClassification record, @Param("example") TbTechnicalClassificationExample example);

    int updateByPrimaryKeySelective(TbTechnicalClassification record);

    int updateByPrimaryKey(TbTechnicalClassification record);
}