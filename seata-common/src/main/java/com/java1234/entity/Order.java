package com.java1234.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 订单表实体
 *
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2021-07-13 10:26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Integer id; // 编号

    private String orderNo; // 订单号

    private Integer userId; // 用户编号

    private Integer count; // 购买数量

    private Integer amount; // 购买金额

    private String remark; // 备注

}
