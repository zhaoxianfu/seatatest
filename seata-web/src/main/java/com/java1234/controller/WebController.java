package com.java1234.controller;

import com.java1234.entity.Order;
import com.java1234.entity.RequestLog;
import com.java1234.entity.Web;
import com.java1234.feign.AccountFeignService;
import com.java1234.feign.OrderFeignService;
import com.java1234.mapper.WebMapper;
import com.java1234.mapper.WebRequestLogMapper;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * web-rest接口
 *
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-15 16:32
 */
@RestController
public class WebController {

    @Autowired
    private OrderFeignService orderFeignService;

    @Autowired
    private AccountFeignService accountFeignService;

    @Autowired
    private WebMapper webMapper;

    @Autowired
    private WebRequestLogMapper webRequestLogMapper;

    /**
     * 下单 1，创建订单 2，账户扣钱
     */
    @PostMapping("/shopping")
    @GlobalTransactional
    public boolean shopping(Order order) {

        System.out.println("全局事务xid: " + RootContext.getXID());
        this.webMapper.createWeb(Web.builder().webNo("1").userId(22).count(22).amount(22).remark("dwqfe").build());
        this.webRequestLogMapper.createRequestLog(RequestLog.builder().remark(UUID.randomUUID().toString()).build());

        this.orderFeignService.createOrder(order); // 创建订单
        this.accountFeignService.decrease(order.getAmount(), order.getUserId()); // 账户扣钱

        if (1 == 1) {
            throw new RuntimeException("occur exception");
        }
        return true;
    }

}
