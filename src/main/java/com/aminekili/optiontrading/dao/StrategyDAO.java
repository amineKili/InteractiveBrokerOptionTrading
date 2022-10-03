package com.aminekili.optiontrading.dao;


import com.aminekili.optiontrading.enumeration.OrderType;
import com.aminekili.optiontrading.enumeration.PriceType;
import com.aminekili.optiontrading.enumeration.StrategyState;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "strategy")
@Entity
public class StrategyDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

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

    @OneToMany(mappedBy = "strategy")
    @ToString.Exclude
    private List<OrderDAO> orders;

    private StrategyState strategyState;

    private double entryPrice;
}
