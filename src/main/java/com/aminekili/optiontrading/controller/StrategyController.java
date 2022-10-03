package com.aminekili.optiontrading.controller;


import com.aminekili.optiontrading.dto.StrategyDTO;
import com.aminekili.optiontrading.service.StrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/strategy")
@RestController
public class StrategyController {

    @Autowired
    private StrategyService strategyService;

    @GetMapping("/strategy")
    public List<StrategyDTO> getAllStrategies() {
        return strategyService.findAll();
    }

    @GetMapping("/strategy/{id}")
    public StrategyDTO getStrategy(@PathVariable Long id) {
        return strategyService.findOne(id);
    }

    @PostMapping("/strategy")
    public StrategyDTO createStrategy(@RequestBody StrategyDTO strategyDTO) {
        return strategyService.create(strategyDTO);
    }

    @PutMapping("/strategy/{id}")
    public StrategyDTO updateStrategy(@PathVariable Long id, @RequestBody StrategyDTO strategyDTO) {
        return strategyService.update(id, strategyDTO);
    }

    @DeleteMapping("/strategy/{id}")
    public StrategyDTO cancelStrategy(@PathVariable Long id) {
        return strategyService.cancel(id);
    }


}
