package com.song.mapper;

import com.song.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    /**
     * 验证登陆
     * @param username
     * @param password
     * @return
     */
    @Select("select * from tb_user where username=#{username} and password=#{password}")
    User select(@Param("username") String username, @Param("password") String password);

    /**
     * 查询所有
     * @return
     */
    @Select("select * from tb_user")
    List<User> selectAll();

    /**
     * 根据用户名查询用户对象
     * @param username
     * @return
     */
    @Select("select * from tb_user where username=#{username}")
    User selectByUsername(String username);

    /**
     * 添加用户
     * @param user
     */
    @Select("insert into tb_user values (null,#{username},#{password})")
    void add(User user);

}
