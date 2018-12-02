package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Stockincomeitem;
import java.util.List;

public interface StockincomeitemMapper {
    int deleteByPrimaryKey(Integer sibtid);

    int insert(Stockincomeitem record);

    Stockincomeitem selectByPrimaryKey(Integer sibtid);

    List<Stockincomeitem> selectAll();

    int updateByPrimaryKey(Stockincomeitem record);
}