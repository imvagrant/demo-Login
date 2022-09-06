package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.bean.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectAll();

    List<Employee> selectOne();

    Employee selectById(int id);
}

