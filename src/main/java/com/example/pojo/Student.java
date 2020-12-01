package com.example.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@TableName("student")
@Data
public class Student {

    private   Integer id;   //主键
    private  String name; //名字
    private  Double chinese; //语文
    private  Double math;  //数学
    private  Double english; //英语
    private  Double history; //地理

    public Student(Integer id, String name, Double chinese, Double math, Double english, Double history) {
        this.id = id;
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
        this.history = history;
    }
}
