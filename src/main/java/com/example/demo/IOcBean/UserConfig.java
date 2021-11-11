package com.example.demo.IOcBean;


import com.example.demo.IOcBean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 *
 * 测试类在Test里面
 */

@Configuration
public class UserConfig {

    @Bean("user1")//将他的返回值设置成一个bean
    public User user(){
        User user=new User();
        user.setId(1);
        user.setName("李兴振");
        return user;
    }


}
