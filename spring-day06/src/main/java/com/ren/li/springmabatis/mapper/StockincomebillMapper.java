package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Stockincomebill;
import java.util.List;

public interface StockincomebillMapper {
    int deleteByPrimaryKey(Integer sibid);

    int insert(Stockincomebill record);

    Stockincomebill selectByPrimaryKey(Integer sibid);

    List<Stockincomebill> selectAll();

    int updateByPrimaryKey(Stockincomebill record);
}