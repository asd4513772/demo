package com.example.Service;

import org.springframework.stereotype.Service;
import com.example.pojo.Student;

import java.util.List;
@Service
public interface StudentService {


    List<Student> selectlimit(Integer page);

    Student selectById(Integer id);

    void deleteById(int id);

    void update(Student student);

    void insert(Student student);

}
