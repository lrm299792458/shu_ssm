package cn.shu.service;

import cn.shu.domain.Student;

import java.util.List;

public interface IStudentService {

    public List<Student> findAll();

    public void saveStudent(Student student);
}
