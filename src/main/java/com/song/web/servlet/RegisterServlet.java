package com.song.web.servlet;

import com.song.mapper.UserMapper;
import com.song.pojo.User;
import com.song.service.UserService;
import com.song.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private UserService service = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirm_password = request.getParameter("confirm_password");
        //封装用户对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        if(password.equals(confirm_password)){
            //确认密码
            boolean isAdd = service.add(user);
            if (isAdd) {
                //成功
                request.setAttribute("add_msg","注册成功，请登录");
                //跳转
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
            else {
                //失败
                request.setAttribute("username_error","用户名已存在！");
                //跳转
                request.getRequestDispatcher("register.jsp").forward(request,response);
            }
        }else {
            //失败
            request.setAttribute("password_error","俩次密码不一致！");
            //跳转
            request.getRequestDispatcher("register.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
