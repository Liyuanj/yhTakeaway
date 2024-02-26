package com.yunheng.service;

import com.yunheng.entity.Dish;
import com.yunheng.mapper.MenuMapper;
import com.yunheng.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MenuService implements MenuMapper {
    @Override
    public List<Dish> getMenuByBusinessName(String businessName) {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);
        List<Dish> menuByBusinessName = mapper.getMenuByBusinessName(businessName);

        return menuByBusinessName;

    }
}
