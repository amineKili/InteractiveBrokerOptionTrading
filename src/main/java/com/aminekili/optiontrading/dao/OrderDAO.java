package com.aminekili.optiontrading.dao;

import com.aminekili.optiontrading.enumeration.Action;
import com.aminekili.optiontrading.enumeration.OptionType;
import com.aminekili.optiontrading.enumeration.OrderState;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "order")
@Entity
public class OrderDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "strategy_id", nullable = false)
    private StrategyDAO strategy;

    private Action action;
    private OptionType optionType;
    private double delta;
    private int strikePrice;
    private OrderState state;
}
