package com.wonders.xlab.test.controller;

import com.wonders.xlab.test.entity.primary.User;
import com.wonders.xlab.test.entity.secondary.Order;
import com.wonders.xlab.test.repository.primary.UserRepository;
import com.wonders.xlab.test.repository.secondary.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangqiang on 15/10/20.
 */
@Controller
public class MyController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public
    @ResponseBody
    void hello() {

        User user = userRepository.findOne(1l);
        System.out.println("user = " + user);

        Order order = orderRepository.findOne(1l);
        System.out.println("order = " + order);
    }

}
