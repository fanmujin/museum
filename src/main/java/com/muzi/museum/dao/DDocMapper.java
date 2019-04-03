package com.muzi.museum.dao;

import com.muzi.museum.bean.DDoc;
import com.muzi.museum.bean.DDocExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DDocMapper {
    int countByExample(DDocExample example);

    int deleteByExample(DDocExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DDoc record);

    int insertSelective(DDoc record);

    List<DDoc> selectByExample(DDocExample example);

    DDoc selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DDoc record, @Param("example") DDocExample example);

    int updateByExample(@Param("record") DDoc record, @Param("example") DDocExample example);

    int updateByPrimaryKeySelective(DDoc record);

    int updateByPrimaryKey(DDoc record);
}