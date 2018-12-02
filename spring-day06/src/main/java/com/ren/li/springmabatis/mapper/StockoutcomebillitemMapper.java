package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Stockoutcomebillitem;
import java.util.List;

public interface StockoutcomebillitemMapper {
    int deleteByPrimaryKey(Integer sobtid);

    int insert(Stockoutcomebillitem record);

    Stockoutcomebillitem selectByPrimaryKey(Integer sobtid);

    List<Stockoutcomebillitem> selectAll();

    int updateByPrimaryKey(Stockoutcomebillitem record);
}