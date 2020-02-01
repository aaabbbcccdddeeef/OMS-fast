package com.lgy.oms.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.lgy.common.annotation.Excel;
import com.lgy.common.core.domain.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 配货策略分仓覆盖区域规则表 oms_strategy_distribution_warehouse_area
 *
 * @author lgy
 * @date 2020-02-01
 */
 @Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("oms_strategy_distribution_warehouse_area")
public class StrategyDistributionWarehouseArea extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 策略编码 */
    @Excel(name = "策略编码")
    private String gco;

    /** 仓库编码 */
    @Excel(name = "仓库编码")
    private String warehouse;

    /** 优先级 */
    @Excel(name = "优先级")
    private Long priority;

    /** 收件人国家 */
    @Excel(name = "收件人国家")
    private String nation;

    /** 收件人省/州 */
    @Excel(name = "收件人省/州")
    private String province;

    /** 收件人市 */
    @Excel(name = "收件人市")
    private String city;

    /** 收件人区县 */
    @Excel(name = "收件人区县")
    private String district;

    /** 是否到达 */
    @Excel(name = "是否到达")
    private Integer arrive;

    /** 状态（0启用 1停用） */
    @Excel(name = "状态", readConverterExp = "0=启用,1=停用")
    private String status;

    /** 备注 */
    @Excel(name = "备注")
    private String remark;

}
