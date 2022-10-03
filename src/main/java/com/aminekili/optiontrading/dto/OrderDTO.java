package com.aminekili.optiontrading.dto;

import com.aminekili.optiontrading.enumeration.Action;
import com.aminekili.optiontrading.enumeration.OptionType;
import com.aminekili.optiontrading.enumeration.OrderState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private String id;
    private long strategyId;
    private Action action;
    private OptionType optionType;
    private double delta;
    private int strikePrice;
    private OrderState state;
}
