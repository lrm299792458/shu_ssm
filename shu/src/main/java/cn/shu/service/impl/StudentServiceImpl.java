package cn.shu.service.impl;

import cn.shu.dao.IStudentDao;
import cn.shu.domain.Student;
import cn.shu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    IStudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }
}
