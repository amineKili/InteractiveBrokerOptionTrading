package com.aminekili.optiontrading.entity;

import com.aminekili.optiontrading.enumeration.Action;
import com.aminekili.optiontrading.enumeration.OptionType;
import com.aminekili.optiontrading.enumeration.OrderState;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String id;
    private Strategy strategy;
    private Action action;
    private OptionType optionType;
    private double delta;
    private int strikePrice;
    private OrderState state;
}
