package com.song.web.servlet;

import com.alibaba.fastjson.JSON;
import com.song.pojo.Recipe;
import com.song.service.RecipeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/AddRecipeServlet")
public class AddRecipeServlet extends HttpServlet {
    private RecipeService recipeService=new RecipeService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        this.doGet(request, response);
        request.setCharacterEncoding("UTF-8");
        BufferedReader r = request.getReader();
        String params = r.readLine();

        System.out.println(params);
        Recipe recipe = JSON.parseObject(params, Recipe.class);

        recipeService.addRecipe(recipe);

        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("success");
    }
}
