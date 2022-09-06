package com.song.service;

import com.song.mapper.UserMapper;
import com.song.pojo.User;
import com.song.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class UserService {

    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    public User login(String username, String password) {

        //调用mybatis
        /*
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
         */
        //SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用方法
        User user = userMapper.select(username, password);
        //释放
        sqlSession.close();
        return user;
    }

    public List<User> selectAll(){
        //SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //调用方法
        List<User> user = userMapper.selectAll();
        //释放
        sqlSession.close();
        return user;
    }

    public boolean add(User user){
        //SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取Mapper
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //判断存在
        User user1 = userMapper.selectByUsername(user.getUsername());
        if (user1 == null) {
            //可以注册
            //调用方法
            userMapper.add(user);
            sqlSession.commit();
        }
        //释放
        sqlSession.close();
        return user1 == null;

    }
}
