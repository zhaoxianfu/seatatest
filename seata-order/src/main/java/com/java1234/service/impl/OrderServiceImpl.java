package com.java1234.service.impl;

import com.java1234.entity.Order;
import com.java1234.mapper.OrderMapper;
import com.java1234.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-14 11:02
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void createOrder(Order order) {
        orderMapper.createOrder(order);
    }
}
