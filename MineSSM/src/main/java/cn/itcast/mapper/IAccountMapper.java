package cn.itcast.mapper;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 持久层接口
 * @author :LYM
 * @date :2019/5/17
 */
@Transactional
public interface IAccountMapper {


    /**
     * 查询所有接口
     * @return :Account封装类
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 存储用户信息
     * @param account
     */
    @Insert("insert into account (name,money) values (#{name},#{money})")
    void saveAccount(Account account);


}
