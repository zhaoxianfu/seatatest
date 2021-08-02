package com.java1234.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * RequestLog
 *
 * @Description :
 * @Author : XianFu Zhao
 * @Date : 2021/8/2 23:28
 * @Version : 1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestLog {

    private Integer id; // 编号

    private String remark; // 备注
}
