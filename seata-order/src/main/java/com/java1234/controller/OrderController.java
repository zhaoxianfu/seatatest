package com.java1234.controller;

import com.java1234.entity.Order;
import com.java1234.entity.RequestLog;
import com.java1234.mapper.OrderRequestLogMapper;
import com.java1234.service.OrderService;
import io.seata.core.context.RootContext;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-14 11:13
 */
@RestController
@RequestMapping("/seata")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderRequestLogMapper orderRequestLogMapper;

    /**
     * 创建订单
     */
    @PostMapping("/createOrder")
    public Boolean createOrder(@RequestBody Order order) {
        System.out.println("全局事务xid: " + RootContext.getXID());

        order.setOrderNo(UUID.randomUUID().toString());  // 生成订单ID
        this.orderService.createOrder(order);

        this.orderRequestLogMapper.createRequestLog(RequestLog.builder().remark(UUID.randomUUID().toString()).build());

        return true;

    }
}
