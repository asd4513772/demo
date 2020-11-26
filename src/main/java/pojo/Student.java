package pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("studen")
public class Student {

    Integer id;   //主键
    String Name; //名字
    Double Chinese; //语文
    Double Math;  //数学
    Double English; //英语
    Double History; //地理


}
