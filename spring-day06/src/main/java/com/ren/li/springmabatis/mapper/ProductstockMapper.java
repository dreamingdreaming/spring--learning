package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Productstock;
import java.util.List;

public interface ProductstockMapper {
    int deleteByPrimaryKey(Integer psid);

    int insert(Productstock record);

    Productstock selectByPrimaryKey(Integer psid);

    List<Productstock> selectAll();

    int updateByPrimaryKey(Productstock record);
}