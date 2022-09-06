package com.song.web.servlet;

import com.alibaba.fastjson.JSON;
import com.song.pojo.User;
import com.song.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
    private UserService helloService=new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = helloService.selectAll();
        String string = JSON.toJSONString(users);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(string);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
