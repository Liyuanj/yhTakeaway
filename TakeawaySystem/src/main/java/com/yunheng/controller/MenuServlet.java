package com.yunheng.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yunheng.entity.Dish;
import com.yunheng.service.MenuService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/menu")
public class MenuServlet extends HttpServlet {
    private MenuService menuService = new MenuService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        String businessName = req.getParameter("businessName");
        List<Dish> menuByBusinessName = menuService.getMenuByBusinessName(businessName);

        ObjectMapper mapper = new ObjectMapper();
        String jsonMenu = mapper.writeValueAsString(menuByBusinessName);

        resp.getWriter().write(jsonMenu);
    }
}
