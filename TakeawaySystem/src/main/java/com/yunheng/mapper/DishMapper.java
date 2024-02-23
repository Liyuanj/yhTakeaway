package com.yunheng.mapper;

import com.yunheng.entity.Dish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface DishMapper {
    @Select("SELECT * FROM tb_dish WHERE name LIKE CONCAT('%', #{keyword}, '%')")
    List<Dish> searchDishesByKeyword(String keyword);
}
