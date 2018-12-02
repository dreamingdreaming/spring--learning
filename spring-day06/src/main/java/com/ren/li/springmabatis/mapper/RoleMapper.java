package com.ren.li.springmabatis.mapper;

import com.ren.li.springmabatis.pojo.Role;
import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Role record);

    Role selectByPrimaryKey(Integer rid);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);
}