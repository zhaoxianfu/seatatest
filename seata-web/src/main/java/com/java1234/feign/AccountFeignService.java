package com.java1234.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 账号接口feign远程调用
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-16 10:55
 */
@FeignClient("seata-account")
public interface AccountFeignService {

    /**
     * 账号扣钱
     * @param amount
     * @param userId
     * @return
     */
    @PostMapping("/account/decrease")
    Boolean decrease(@RequestParam("amount")Integer amount, @RequestParam("userId")Integer userId);

}
