package com.java1234.service;

import com.java1234.entity.Order;

/**
 * 订单service接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-14 11:00
 */
public interface OrderService {

    /**
     * 创建订单
     * @param order
     */
    void createOrder(Order order);

}
