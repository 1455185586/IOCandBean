package com.example.demo;

import com.example.demo.IOcBean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IocTest {
    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void IocTest(){
        User user=(User) applicationContext.getBean("user1");//实例化user，通过上下文获取user对象user1
        System.out.println(user);//输出打印User数据
    }
}
