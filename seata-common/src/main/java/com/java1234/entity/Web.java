package com.java1234.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Web
 *
 * @Description :
 * @Author : XianFu Zhao
 * @Date : 2021/8/2 23:26
 * @Version : 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Web {

    private Integer id; // 编号

    private String webNo; // web号

    private Integer userId; // 用户编号

    private Integer count; // 购买数量

    private Integer amount; // 购买金额

    private String remark; // 备注
}
