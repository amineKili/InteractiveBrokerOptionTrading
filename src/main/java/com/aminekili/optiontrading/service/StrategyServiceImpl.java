package com.aminekili.optiontrading.service;

import com.aminekili.optiontrading.dto.StrategyDTO;
import com.aminekili.optiontrading.entity.Strategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StrategyServiceImpl implements StrategyService {

    //TODO: autowire OrderService
    //TODO: autowire InteractiveBrokerService

    @Override
    public void create(Strategy strategy) {

    }

    @Override
    public void execute(Strategy strategy) {

    }

    @Override
    public void execute(long id) {

    }

    @Override
    public void cancel(long id) {

    }

    @Override
    public void update(Strategy strategy) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<StrategyDTO> findAll() {
        return null;
    }

    @Override
    public StrategyDTO findOne(Long id) {
        return null;
    }
}
