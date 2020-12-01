package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
        //分页查询
        List<Student> selectlimit(@Param("page")  Integer page, @Param("pagenNnmber") Integer pagenNnmber);

        Student selectById(@Param("id") Integer id);

        int deleteById(@Param("id") int id);

        int update(Student student);

        int insert(Student student);

}
