package com.example.controller;

import com.example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.pojo.Student;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    //分页查询，将数据按照分页显示在页面
    @RequestMapping("/selectAll")
    public List<Student> SelectAindll()
    {
        System.out.println("asdasdasdasdasdas");
        return studentService.selectlimit();
    }
    //按照ID查找单个数据
    @GetMapping("/selectById")

    public Student SlectById(Integer id){
        return studentService.selectById(id);
    }
    //按照ID删除数据
    @PostMapping("/deleteById")
    public void DeleteById(Integer id){
        studentService.deleteById(id);
    }
    //按照ID修改数据
    @PostMapping("/updataById")
    public void UpdateById(Integer id){
        studentService.updateById(id);
    }
    //新增数据
    @PostMapping("/inserter")
    public void Inserte(Student student){
        studentService.insertById(student);
    }
}
