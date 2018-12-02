package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Orderbill;
import java.util.List;

public interface OrderbillMapper {
    int deleteByPrimaryKey(Integer oid);

    int insert(Orderbill record);

    Orderbill selectByPrimaryKey(Integer oid);

    List<Orderbill> selectAll();

    int updateByPrimaryKey(Orderbill record);
}