package com.yanxi.anim.sys.mapper;

import com.yanxi.anim.sys.pojo.AnimAssessment;
import com.yanxi.anim.sys.pojo.AnimAssessmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnimAssessmentMapper {
    int countByExample(AnimAssessmentExample example);

    int deleteByExample(AnimAssessmentExample example);

    int deleteByPrimaryKey(String assessmentId);

    int insert(AnimAssessment record);

    int insertSelective(AnimAssessment record);

    List<AnimAssessment> selectByExample(AnimAssessmentExample example);

    AnimAssessment selectByPrimaryKey(String assessmentId);

    int updateByExampleSelective(@Param("record") AnimAssessment record, @Param("example") AnimAssessmentExample example);

    int updateByExample(@Param("record") AnimAssessment record, @Param("example") AnimAssessmentExample example);

    int updateByPrimaryKeySelective(AnimAssessment record);

    int updateByPrimaryKey(AnimAssessment record);
}