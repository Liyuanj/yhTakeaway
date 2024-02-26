package com.yunheng.mapper;

import com.yunheng.entity.Dish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface DishMapper {

    //xml文件出现not find情况，使用注解
    @Select("SELECT * FROM tb_dish WHERE name LIKE CONCAT('%', #{keyword}, '%')")
    List<Dish> searchDishesByKeyword(String keyword);
}
