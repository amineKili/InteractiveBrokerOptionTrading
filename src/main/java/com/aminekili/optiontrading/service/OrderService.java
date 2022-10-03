package com.aminekili.optiontrading.service;

import com.aminekili.optiontrading.dto.OrderDTO;
import com.aminekili.optiontrading.entity.Order;

import java.util.List;

public interface OrderService {
    void create(Order order);

    void execute(Order order);

    void execute(long id);

    void cancel(long id);

    void update(Order order);

    void delete(long id);

    void cancelForStrategyInstance(long strategyInstanceId);

    List<OrderDTO> findAll();

    OrderDTO findOne(Long id);
}
