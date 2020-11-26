package Serviceimpl;

import Service.StudentService;
import dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import pojo.Student;

import java.util.List;

public class StudentServiceimpl implements StudentService {
    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> selectlimit(Integer x) {
        return studentDao.selectlimit(x);
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
    public Student insertById(Student student) {
        return studentDao.insertById(student);
    }


}
