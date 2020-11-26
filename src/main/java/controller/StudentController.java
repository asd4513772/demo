package controller;

import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Student;

import java.util.List;

@Controller
@RequestMapping("Student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    //分页查询，将数据按照分页显示在页面
    @GetMapping("selectAll")
    @ResponseBody
    public List<Student> SelectAindll(Integer x){
        return studentService.selectlimit(x);
    }
    //按照ID查找单个数据
    @GetMapping("selectById")
    @ResponseBody
    public Student SlectById(Integer id){
        return studentService.selectById(id);
    }
    //按照ID删除数据
    @PostMapping("deleteById")
    public void DeleteById(Integer id){
        studentService.deleteById(id);
    }
    //按照ID修改数据
    @PostMapping("updataById")
    public void UpdateById(Integer id){
        studentService.updateById(id);
    }
    //新增数据
    @PostMapping("inserter")
    public Student Inserte(Student student){
        return studentService.insertById(student);
    }









}
