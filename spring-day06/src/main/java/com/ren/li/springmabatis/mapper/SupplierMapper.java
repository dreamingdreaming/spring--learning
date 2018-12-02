package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Supplier;
import java.util.List;

public interface SupplierMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Supplier record);

    Supplier selectByPrimaryKey(Integer sid);

    List<Supplier> selectAll();

    int updateByPrimaryKey(Supplier record);
}