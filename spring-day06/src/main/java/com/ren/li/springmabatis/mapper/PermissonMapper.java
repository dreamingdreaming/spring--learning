package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Permisson;
import java.util.List;

public interface PermissonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permisson record);

    Permisson selectByPrimaryKey(Integer id);

    List<Permisson> selectAll();

    int updateByPrimaryKey(Permisson record);
}