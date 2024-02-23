package com.yunheng.service;

import com.alibaba.fastjson2.annotation.JSONAutowired;
import com.yunheng.entity.Dish;
import com.yunheng.mapper.DishMapper;
import com.yunheng.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DishService implements DishMapper {

    @Override
    public List<Dish> searchDishesByKeyword(String name) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        DishMapper mapper = sqlSession.getMapper(DishMapper.class);
        List<Dish> dishes = mapper.searchDishesByKeyword(name);

        return dishes;
    }
}
