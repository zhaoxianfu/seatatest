package com.java1234.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户账户表
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-13 10:36
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private Integer id; // 编号

    private Integer userId; // 用户编号

    private Integer balance; // 账户余额

    private String remark; // 备注
}
