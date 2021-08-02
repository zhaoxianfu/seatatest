package com.java1234.controller;

import com.java1234.entity.RequestLog;
import com.java1234.mapper.AccountRequestLogMapper;
import com.java1234.service.AccountService;
import io.seata.core.context.RootContext;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账户Controller
 *
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-15 13:06
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountRequestLogMapper accountRequestLogMapper;

    /**
     * 给指定用户账户扣钱
     */
    @PostMapping("/decrease")
    public Boolean decrease(@RequestParam("amount") Integer amount, @RequestParam("userId") Integer userId) {
        System.out.println("全局事务xid: " + RootContext.getXID());
       /* if (userId == null || userId == 1) {
            throw new RuntimeException("模拟异常");
        }*/

        Map<String, Object> map = new HashMap<>();
        map.put("amount", amount);
        map.put("userId", userId);

        this.accountService.decrease(map);

        this.accountRequestLogMapper.createRequestLog(RequestLog.builder()
                .remark(UUID.randomUUID().toString())
                .build());
        return true;

    }

}
