package com.yanxi.anim.sys.mapper;

import com.yanxi.anim.sys.pojo.AnimAttence;
import com.yanxi.anim.sys.pojo.AnimAttenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnimAttenceMapper {
    int countByExample(AnimAttenceExample example);

    int deleteByExample(AnimAttenceExample example);

    int deleteByPrimaryKey(String attenceId);

    int insert(AnimAttence record);

    int insertSelective(AnimAttence record);

    List<AnimAttence> selectByExample(AnimAttenceExample example);

    AnimAttence selectByPrimaryKey(String attenceId);

    int updateByExampleSelective(@Param("record") AnimAttence record, @Param("example") AnimAttenceExample example);

    int updateByExample(@Param("record") AnimAttence record, @Param("example") AnimAttenceExample example);

    int updateByPrimaryKeySelective(AnimAttence record);

    int updateByPrimaryKey(AnimAttence record);
}