package com.java1234.feign;

import com.java1234.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 订单接口feign远程调用
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-16 10:55
 */
@FeignClient("seata-order")
public interface OrderFeignService {

    /**
     * 创建订单
     * @param order
     * @return
     */
    @PostMapping("/seata/createOrder")
    Boolean createOrder(@RequestBody Order order);

}
