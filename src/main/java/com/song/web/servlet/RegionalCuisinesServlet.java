package com.song.web.servlet;

import com.alibaba.fastjson.JSON;
import com.song.pojo.Recipe;
import com.song.service.RecipeService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/RegionalCuisinesServlet")
public class RegionalCuisinesServlet extends HttpServlet {
    private RecipeService recipeService=new RecipeService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Cuisines = request.getParameter("Cuisines");

        List<Recipe> recipes =recipeService.selectRegionalCuisines(Cuisines);

        String string = JSON.toJSONString(recipes);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(string);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
