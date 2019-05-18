package cn.itcast.controller;


import cn.itcast.domain.Account;
import cn.itcast.service.IAccountService;
import cn.itcast.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping(value = {"account",""})
public class AccountController {

    @Autowired
    private IAccountService iAccountService;

    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Account> list = iAccountService.findAll();
        System.out.println("asdasd");
        model.addAttribute("list",list);
        return "/success";
    }



}
