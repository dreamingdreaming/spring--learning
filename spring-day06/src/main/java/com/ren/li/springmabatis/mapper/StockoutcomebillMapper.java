package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Stockoutcomebill;
import java.util.List;

public interface StockoutcomebillMapper {
    int deleteByPrimaryKey(Integer sobid);

    int insert(Stockoutcomebill record);

    Stockoutcomebill selectByPrimaryKey(Integer sobid);

    List<Stockoutcomebill> selectAll();

    int updateByPrimaryKey(Stockoutcomebill record);
}