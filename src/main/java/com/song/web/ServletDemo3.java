package com.song.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/demo3")
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        resp.setCharacterEncoding("UTF-8");
        System.out.println(req.getMethod());
        //虚拟目录
        System.out.println(req.getContextPath());
        //统一资源定位符
        System.out.println(req.getRequestURL().toString());
        //统一资源标识符
        System.out.println(req.getRequestURI());
        System.out.println(req.getQueryString());
        //请求头
        System.out.println(req.getHeader("use-agent"));

        String username = req.getParameter("username");

//        byte[] bytes = username.getBytes(StandardCharsets.ISO_8859_1);
//        username = new String(bytes, StandardCharsets.UTF_8);

        username=new String(username.getBytes(StandardCharsets.ISO_8859_1),StandardCharsets.UTF_8);
        System.out.println(username);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
//        BufferedReader reader = req.getReader();
//        System.out.println(reader.readLine());
        this.doGet(req, resp);

    }
}
