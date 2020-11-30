package com.example.controller;

import com.example.Service.StudentService;
import org.apache.ibatis.annotations.Param;
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
    @GetMapping("/selectAll")
    @ResponseBody
    public List<Student> SelectAindll(Integer x)
    {
        x=(x-1)*3;
        return studentService.selectlimit(x);
    }
    //按照ID查找单个数据
    @GetMapping("/selectById")
    public Student SlectById(@Param("id") Integer id){
       return studentService.selectById(id);
    }
    //按照ID删除数据
    @GetMapping("/deleteById")
    public void DeleteById(@Param("id") int id){
        studentService.deleteById(id);
    }
    //按照ID修改数据
    /*@GetMapping("/updataById/{id}")//注解  restful风格的地址有{}  注解是PathVariable restful风格 地址 http://localhost/student/updataById/2
    public void UpdateById(@PathVariable("id") Integer id){
        studentService.updateById(id);
    }*/

    @PostMapping("update")
    public void Update( @RequestBody Student student){
        studentService.update(student);
    }

    //新增数据
    @PostMapping("/inserter")  //post请求类型 一般是 json的  用 @ RequestBody
    public void Inserte( @RequestBody Student student){
        studentService.insert(student);
    }
}
