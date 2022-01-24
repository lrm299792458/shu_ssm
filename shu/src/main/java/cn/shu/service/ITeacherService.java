package cn.shu.service;

import cn.shu.domain.Teacher;

import java.util.List;

public interface ITeacherService {

    public List<Teacher> findAll();

    public void saveTeacher(Teacher teacher);
}
