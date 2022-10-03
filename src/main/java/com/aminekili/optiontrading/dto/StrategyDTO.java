package com.aminekili.optiontrading.dto;

import com.aminekili.optiontrading.enumeration.OrderType;
import com.aminekili.optiontrading.enumeration.PriceType;
import com.aminekili.optiontrading.enumeration.StrategyState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StrategyDTO {
    private String instrument;
    private int contractSize;
    private OrderType orderType;
    private PriceType priceType;
    private LocalDateTime entryDate;
    private int dayToExpire;
    private double delta;
    private int strikePrice;
    private double stopLossInUSD;
    private double takeProfitInUSD;
    private LocalDateTime exitDate;
    private List<Long> orderIds;
    private StrategyState strategyState;
}
