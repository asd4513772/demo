package dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import pojo.Student;

import java.util.List;

@Mapper
public interface StudentDao extends BaseMapper<Student> {
        //分页查询
        List<Student> selectlimit(Integer x);

        Integer deleteById(Integer x);

        void updateById(Integer id);

        Student insertById(Student student);


}
