package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * 业务层接口
 * @author :LYM
 * @date :2019/5/17
 */
public interface IAccountService {

    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();

    /**
     *  存储
     */
    void saveAccount(Account account);
}
