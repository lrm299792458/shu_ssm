package cn.shu.dao;

import cn.shu.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account (num,pwd,type,state) values(#{num},#{pwd},#{type},#{state})")
    public void saveAccount(Account account);

    @Select("select * from account where num=#{num} and pwd=#{pwd}")
    public Account findByNumandPwd(@Param("num") String num, @Param("pwd") String pwd);

    //根据账号判断账号类型 返回1为学生账号  2为老师账号  3为管理员账号
    @Select("SELECT TYPE FROM account WHERE num=#{num} ")
    public Integer findTypeByNum(@Param("num") String num);
}
