package com.zsc.trade;

import com.zsc.trade.bean.User;
import com.zsc.trade.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TradeApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {

        User us = new User();
        us.setCall_number("123");
        us.setUsername("admin");
        us.setPassword("8888");

        userMapper.insertByUser(us);
        User us1 = new User();
        us1 = userMapper.getUserById(1);

        System.out.println(us1.getCall_number());

        us1.setCall_number("568");
        us1.setUsername("xiaoming");
        userMapper.insertByUser(us1);
        us1 = userMapper.getUserById(2);

        System.out.println(us1.getCall_number());

    }

}
