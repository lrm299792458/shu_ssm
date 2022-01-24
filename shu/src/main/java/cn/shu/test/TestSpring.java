package cn.shu.test;

import cn.shu.domain.Account;
import cn.shu.domain.Admin;
import cn.shu.domain.Student;
import cn.shu.domain.Teacher;
import cn.shu.service.IAccountService;
import cn.shu.service.IAdminService;
import cn.shu.service.IStudentService;
import cn.shu.service.ITeacherService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestSpring {
    @Autowired
    IAccountService as;
    @Autowired
    IAdminService adminService;
    @Autowired
    IStudentService studentService;
    @Autowired
    ITeacherService teacherService;
    @Test
    public  void run1()
    {

       /* for (Account account : as.findAll()) {
            System.out.println(account);
        }

        for (Admin admin : adminService.findAll()) {
            System.out.println(admin);
        }
        for (Student student : studentService.findAll()) {
            System.out.println(student);
        }
        for (Teacher teacher : teacherService.findAll()) {
            System.out.println(teacher);
        }*/

    }
}
