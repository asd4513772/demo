package Service;

import org.springframework.stereotype.Service;
import pojo.Student;

import java.util.List;
@Service
public interface StudentService {

    List<Student> selectlimit(Integer x);

    Student selectById(Integer id);

    void deleteById(Integer id);

    void updateById(Integer id);

    Student insertById(Student student);




}
