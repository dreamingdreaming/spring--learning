package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Orderbillitem;
import java.util.List;

public interface OrderbillitemMapper {
    int deleteByPrimaryKey(Integer obtid);

    int insert(Orderbillitem record);

    Orderbillitem selectByPrimaryKey(Integer obtid);

    List<Orderbillitem> selectAll();

    int updateByPrimaryKey(Orderbillitem record);
}