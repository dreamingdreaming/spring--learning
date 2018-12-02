package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Depot;
import java.util.List;

public interface DepotMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Depot record);

    Depot selectByPrimaryKey(Integer did);

    List<Depot> selectAll();

    int updateByPrimaryKey(Depot record);
}