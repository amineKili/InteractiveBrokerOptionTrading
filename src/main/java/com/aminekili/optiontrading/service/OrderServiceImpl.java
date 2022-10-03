package com.aminekili.optiontrading.service;

import com.aminekili.optiontrading.dto.OrderDTO;
import com.aminekili.optiontrading.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    // TODO: Autowire the OrderRepository
    // TODO: Autowire the InteractiveBrokerService

    @Override
    public void create(Order order) {

    }

    @Override
    public void execute(Order order) {

    }

    @Override
    public void execute(long id) {

    }

    @Override
    public void cancel(long id) {

    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public void cancelForStrategyInstance(long strategyInstanceId) {

    }

    @Override
    public List<OrderDTO> findAll() {
        return null;
    }

    @Override
    public OrderDTO findOne(Long id) {
        return null;
    }
}
