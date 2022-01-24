package cn.shu.service;

import cn.shu.domain.Account;

import java.util.List;

public interface IAccountService {

    public List<Account> findAll();

    public void saveAccount(Account account);

    public Account findByNumandPwd(String num,String pwd);

    public Integer findTypeByNum(String num);
}
