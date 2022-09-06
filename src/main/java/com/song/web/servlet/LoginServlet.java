package com.song.web.servlet;

import com.song.pojo.User;
import com.song.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //响应response
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        //调用service查询
        User user = service.login(username, password);

        if (user != null) {
            //登陆成功
            HttpSession session = request.getSession();
            session.setAttribute("user",user);

            String contextPath = request.getContextPath();
            response.sendRedirect(contextPath+"/selectAllServlet");
        } else {
            //登录失败
            request.setAttribute("login_error","用户名或密码错误");
            //跳转
            request.getRequestDispatcher("login.html").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
