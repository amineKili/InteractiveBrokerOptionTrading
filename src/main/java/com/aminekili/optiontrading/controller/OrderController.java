package com.aminekili.optiontrading.controller;


import com.aminekili.optiontrading.dto.OrderDTO;
import com.aminekili.optiontrading.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("/order")
    public List<OrderDTO> findAll() {
        return orderService.findAll();
    }

    @GetMapping("/order/{id}")
    public OrderDTO findOne(@PathVariable Long id) {
        return orderService.findOne(id);
    }

    @PostMapping("/order")
    public OrderDTO create(@RequestBody OrderDTO orderDTO) {
        return orderService.create(orderDTO);
    }

    @PutMapping("/order/{id}")
    public OrderDTO update(@PathVariable Long id, @RequestBody OrderDTO orderDTO){
        return orderService.update(id, orderDTO);
    }

    @DeleteMapping("/order/{id}")
    public OrderDTO cancel(@PathVariable Long id) {
        return orderService.cancel(id);
    }



}
