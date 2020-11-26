package com.example.Service.impl;

import com.example.Service.StudentService;
import com.example.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceimpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> selectlimit() {
        return studentDao.selectlimit(0);
    }

    @Override
    public Student selectById(Integer id) {
        return studentDao.selectById(id);
    }

    @Override
    public void deleteById(Integer id) {
        studentDao.deleteById(id);
    }

    @Override
    public void updateById(Integer id) {
        studentDao.updateById(id);
    }

    @Override
    public void insertById(Student student) {
        studentDao.insertById(student);
    }


}
