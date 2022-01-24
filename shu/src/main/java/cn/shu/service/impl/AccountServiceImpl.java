package cn.shu.service.impl;

import cn.shu.dao.IAccountDao;
import cn.shu.domain.Account;
import cn.shu.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
   private IAccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("查询所有信息");

        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account)
    {
        accountDao.saveAccount(account);
        System.out.println("保存信息");
    }

    @Override
    public Account findByNumandPwd(String num, String pwd) {

        return accountDao.findByNumandPwd(num,pwd);
    }

    @Override
    public Integer findTypeByNum(String num) {
        return accountDao.findTypeByNum(num);
    }


}
