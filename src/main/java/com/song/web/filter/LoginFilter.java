//package com.song.web.filter;
//
//import javax.servlet.*;
//import javax.servlet.annotation.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebFilter("index.jsp")
//public class LoginFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
//        HttpServletRequest request1 =(HttpServletRequest)request;
//        HttpSession session = request1.getSession();
//        Object user = session.getAttribute("user");
//        if (user != null) {
//            //放行
//            chain.doFilter(request, response);
//        }else {
//            //登录失败
//            request.setAttribute("login_error","用户名尚未登录！");
//            //跳转
//            request.getRequestDispatcher("login.jsp").forward(request,response);
//        }
//
//    }
//    public void init(FilterConfig config) throws ServletException {
//    }
//
//    public void destroy() {
//    }
//
//
//}
