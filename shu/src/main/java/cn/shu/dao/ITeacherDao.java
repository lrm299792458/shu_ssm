package cn.shu.dao;

import cn.shu.domain.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ITeacherDao {
    @Select("select * from teacher")
    public List<Teacher> findAll();

    @Insert("insert into teacher (tid,name,age,sex,phone,mail,office," +
            "duty,state) values(#{tid},#{name},#{age},#{sex}," +
            "#{phone},#{mail},#{office},#{duty},#{state})")
    public void saveTeacher(Teacher teacher);
}
