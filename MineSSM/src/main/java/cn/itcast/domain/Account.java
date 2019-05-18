package cn.itcast.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author :LYM
 * @data : 2019/5/17
 * 数据库数据封装类
 */
public class Account implements Serializable {

    /**
     * id: 主键
     * name：姓名
     * money：金额
     */
    private Integer id;
    private String name;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
