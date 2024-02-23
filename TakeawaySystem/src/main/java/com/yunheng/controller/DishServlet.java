package com.yunheng.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yunheng.entity.Dish;
import com.yunheng.mapper.DishMapper;
import com.yunheng.service.DishService;
import com.yunheng.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/dish_search")
public class DishServlet extends HttpServlet {
    private DishService dishService = new DishService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        List<Dish> dishes = dishService.searchDishesByKeyword(name);

        ObjectMapper mapper = new ObjectMapper();
        String jsonDishes = mapper.writeValueAsString(dishes);

        resp.getWriter().write(jsonDishes);
    }
}
