package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Product;
import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Product record);

    Product selectByPrimaryKey(Integer pid);

    List<Product> selectAll();

    int updateByPrimaryKey(Product record);
}