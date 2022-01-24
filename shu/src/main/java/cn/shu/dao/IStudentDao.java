package cn.shu.dao;

import cn.shu.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentDao {
    @Select("select * from student")
    public List<Student> findAll();

    @Insert("insert into student (sid,name,age,sex,grade,xy,phone,mail,address," +
            "idnum,rw,tw,fyd,state) values(#{sid},#{name},#{age},#{sex}," +
            "#{grade},#{xy},#{phone},#{mail},#{address},#{idnum},#{rw},#{tw},#{fyd},#{state})")
    public void saveStudent(Student student);
}
