package com.java1234.mapper;

import com.java1234.entity.Order;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-13 10:43
 */
public interface OrderMapper {

    /**
     * 创建订单
     * @param order
     */
    void createOrder(Order order);


}
