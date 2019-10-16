package com.lgy.oms.service.business;

import com.lgy.common.core.domain.CommonResponse;
import com.lgy.oms.domain.dto.OrderDTO;

/**
 * @Description 取消订单服务接口
 * @Author LGy
 * @Date 2019/10/15
 */
public interface ICancelOrderService {

    /**
     * 取消订单
     *
     * @param orderDTO 订单传输对象
     * @return
     */
    CommonResponse<String> cancelOrder(OrderDTO orderDTO);
}
