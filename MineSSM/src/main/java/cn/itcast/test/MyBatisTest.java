package cn.itcast.test;

import cn.itcast.domain.Account;
import cn.itcast.mapper.IAccountMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;


/**
 * @author :LYM
 * @date :2019/5/17
 * mybatis框架的测试类
 */
public class MyBatisTest {

    @Test
    public void myTest() throws Exception {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/spring/application.xml");
        applicationContext.getBean("");



    }
}
