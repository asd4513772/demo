package com.example.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.example.Service.StudentService;
import com.example.pojo.Response;
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
    @Autowired
    private Response r;

   /* private Response Format(Integer code, String msg, Object data) {
        Response r = new Response();
        r.code = code;
        r.msg = msg;
        r.data = data;
        return r;
    }*/

    //分页查询，将数据按照分页显示在页面
    @GetMapping("/selectAll")
    @ResponseBody
    public Response SelectAindll(Integer page)
    {
        try {
            return new Response(1,"成功",studentService.selectlimit((page-1)*5));
        } catch (Exception e) {
            e.printStackTrace();
            return new Response(0,e.getMessage());
        }
    }

/*    @GetMapping("/selectAll")
    @ResponseBody
    public Response SelectAindll(Integer page,Integer pagenNnmber)
    {
        try {
           studentService.selectlimit(page,pagenNnmber);
           r.code=1;
           r.msg="成功";
           r.data=studentService.selectlimit();
           return r;

        } catch (Exception e) {
            r.code=0;
            r.msg="失败";
            r.data=e.getMessage();
            return  r;
        }
    }*/


    //按照ID查找单个数据
    @GetMapping("/selectById")
    public Response SlectById(@Param("id") Integer id){
        try {
            r.data= studentService.selectById(id);
            r.code=1;
            r.msg="成功";
            return r;
        } catch (Exception e) {
            e.printStackTrace();
            // r.data= studentService.selectlimit(page,pagenNnmber);
            r.code=0;
            r.msg="失败";
            return r;
        }
    }
    //按照ID删除数据
    @GetMapping("/deleteById")
    public Response DeleteById(@Param("id") int id){
        try {
            studentService.deleteById(id);
            r.code=1;
            r.msg="成功";
            return r;
        } catch (Exception e) {
            e.printStackTrace();
            r.code=0;
            r.msg="失败";
            return  r;
        }

    }
    //按照ID修改数据
    /*@GetMapping("/updataById/{id}")//注解  restful风格的地址有{}  注解是PathVariable restful风格 地址 http://localhost/student/updataById/2
    public void UpdateById(@PathVariable("id") Integer id){
        studentService.updateById(id);
    }*/

    @PostMapping("update")
    public Response Update( @RequestBody Student student){
        try {
            studentService.update(student);
            r.code=1;
            r.msg="成功";
            return r;
        } catch (Exception e) {
            e.printStackTrace();
            r.code=0;
            r.msg="失败";
            return  r;
        }


    }

    //新增数据
    @PostMapping("/inserter")  //post请求类型 一般是 json的  用 @ RequestBody
    public Response Inserte(@RequestBody Student student){

        try {
            studentService.insert(student);
            r.code=1;
            r.msg="成功";
            return r;
        } catch (Exception e) {
            e.printStackTrace();
            r.code=0;
            r.msg="失败";
            return  r;
        }

    }

    @PostMapping("post")
    public Response post(Student student){
        try {
            studentService.insert(student);
            //return new Response(1,"成功",student);
            r.code=1;
            r.msg="成功";
            return r;
        } catch (Exception e) {
            return  new Response(0,e.getMessage());
        }
    }

}
