package cn.shu.service.impl;

import cn.shu.dao.ITeacherDao;
import cn.shu.domain.Teacher;
import cn.shu.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements ITeacherService {
    @Autowired
    ITeacherDao teacherDao;
    @Override
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherDao.saveTeacher(teacher);
    }
}
