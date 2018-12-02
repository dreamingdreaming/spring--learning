package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Brand;
import java.util.List;

public interface BrandMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Brand record);

    Brand selectByPrimaryKey(Integer bid);

    List<Brand> selectAll();

    int updateByPrimaryKey(Brand record);
}