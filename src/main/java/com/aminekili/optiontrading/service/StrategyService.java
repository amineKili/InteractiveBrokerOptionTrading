package com.aminekili.optiontrading.service;

import com.aminekili.optiontrading.dto.StrategyDTO;
import com.aminekili.optiontrading.entity.Strategy;

import java.util.List;

public interface StrategyService {
    void create(Strategy strategy);

    void execute(Strategy strategy);

    void execute(long id);

    void cancel(long id);

    void update(Strategy strategy);

    void delete(long id);

    List<StrategyDTO> findAll();

    StrategyDTO findOne(Long id);
}
