package cn.itcast.service.impl;

import cn.itcast.domain.Account;
import cn.itcast.mapper.IAccountMapper;
import cn.itcast.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :LYM
 * @date :2019/5/17
 * 业务层实现类
 */
@Service
public class AccountServiceImpl implements IAccountService {


    /**
     * 持久层接口
     */
     @Autowired
     private IAccountMapper accountMapper;


    /**
     * 查询所有
     * @return
     */
    @Override
    public List<Account> findAll() {
        System.out.println("业务层的查询所有方法执行啦");

        return accountMapper.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层的存储方法执行了");
        accountMapper.saveAccount(account);
    }
}
