package cn.shu.test;

import cn.shu.dao.IAccountDao;
import cn.shu.dao.IAdminDao;
import cn.shu.dao.IStudentDao;
import cn.shu.dao.ITeacherDao;
import cn.shu.domain.Account;
import cn.shu.domain.Admin;
import cn.shu.domain.Student;
import cn.shu.domain.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestMybatis {
    @Autowired
    IAccountDao dao1;
    @Autowired
    IStudentDao dao;
    @Autowired
    ITeacherDao dao2;
    @Autowired
    IAdminDao dao3;

    @Test
    public void run2() throws Exception {

        Student student = new Student();
        student.setSid("117509");
        student.setName("zca");

//        for (Teacher teacher : dao2.findAll()) {
//            System.out.println(teacher);
//        }
//
//        for (Admin admin : dao3.findAll()) {
//            System.out.println(admin);
//        }
//
//
//        for (Student student1 : dao.findAll()) {
//            System.out.println(student1);
//        }

        System.out.println(dao1.findTypeByNum("root"));

    }
}
