package com.yunheng.mapper;

import com.yunheng.entity.Dish;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MenuMapper {
    @Select("select * from tb_dish where businessName = #{businessName}")
    List<Dish> getMenuByBusinessName(String businessName);
}
