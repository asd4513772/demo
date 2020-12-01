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
    public List<Student> selectlimit(Integer page,Integer pagenNnmber) {
        return studentDao.selectlimit(page,pagenNnmber);
    }

    @Override
    public Student selectById(Integer id) {
        return studentDao.selectById(id);
    }

    @Override
    public void deleteById(int id) {
        studentDao.deleteById(id);
    }

    @Override
    public void update(Student student) {
         studentDao.update(student);
    }

    /*@Override
    public void updateById(Integer id) {
        Student stu=new Student(id,"李二",88.0,99.5,77.0,89.5);
        studentDao.updateById(stu);
    }*/

    @Override
    public void insert(Student student) {
        studentDao.insert(student);
    }


}
