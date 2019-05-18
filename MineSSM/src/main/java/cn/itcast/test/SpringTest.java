package cn.itcast.test;


import cn.itcast.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring框架的测试类
 * @author :LYM
 * @date :2019/5/17
 */
public class SpringTest {

    @Test
    public void OneTest(){
        //获取容器
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        IAccountService contextBean = (IAccountService) applicationContext.getBean("accountServiceImpl");
        contextBean.findAll();
    }
}
