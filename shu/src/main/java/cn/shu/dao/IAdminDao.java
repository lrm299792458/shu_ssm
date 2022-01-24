package cn.shu.dao;

import cn.shu.domain.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAdminDao {
    @Select("select * from admin")
    public List<Admin> findAll();

    @Insert("insert into admin (aid,name,phone,mail,office," +
            "state) values(#{aid},#{name}," +
            "#{phone},#{mail},#{office},#{state})")
    public void saveAdmin(Admin admin);
}
