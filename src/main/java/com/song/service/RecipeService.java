package com.song.service;
import com.song.mapper.RecipeMapper;
import com.song.mapper.UserMapper;
import com.song.pojo.Recipe;
import com.song.pojo.User;
import com.song.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
public class RecipeService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Recipe> selectAll(){
        //工厂对象
        SqlSession openSession = sqlSessionFactory.openSession();
        //获取mapper
        RecipeMapper mapper = openSession.getMapper(RecipeMapper.class);
        List<Recipe> recipes = mapper.selectAll();
        openSession.close();
        return recipes;
    }

    public List<Recipe> selectRegionalCuisines(String regionalCuisines){
        //按菜系查询
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RecipeMapper mapper = sqlSession.getMapper(RecipeMapper.class);
        List<Recipe> recipes = mapper.selectRegionalCuisines(regionalCuisines);
        sqlSession.close();
        return recipes;
    }

    public void addRecipe(Recipe recipe){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        RecipeMapper mapper = sqlSession.getMapper(RecipeMapper.class);
        mapper.add(recipe);
        sqlSession.commit();
        sqlSession.close();
    }
}
