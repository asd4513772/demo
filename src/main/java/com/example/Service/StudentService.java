package com.example.Service;

import org.springframework.stereotype.Service;
import com.example.pojo.Student;

import java.util.List;
@Service
public interface StudentService {

    //List<Student> selectlimit(Integer x);

    List<Student> selectlimit();

    Student selectById(Integer id);

    void deleteById(Integer id);

    void updateById(Integer id);

    void insertById(Student student);




}
