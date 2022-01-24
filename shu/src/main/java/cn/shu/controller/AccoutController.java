package cn.shu.controller;

import cn.shu.domain.Account;
import cn.shu.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account" )
public class AccoutController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层  查询所有");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/login")
    public String login(String num, String pwd)
    {
        System.out.println(num+""+pwd);
        if(accountService.findByNumandPwd(num,pwd)!=null) {
            System.out.println("num and pwd 正确");
            return "success";
        }
        else {
            System.out.println("num and pwd 不正确");
            return "wrong";
        }
    }

    @RequestMapping("/register")
    public String register(String num,String pwd,Integer type)
    {
        System.out.println("****************");
        System.out.println(num+""+pwd);
        Account account = new Account();
        account.setNum(num);
        account.setPwd(pwd);
        account.setType(type);

        accountService.saveAccount(account);

        return "success";

    }
    @RequestMapping("/resign")
    public String resign()
    {


        return "resign";

    }
}
