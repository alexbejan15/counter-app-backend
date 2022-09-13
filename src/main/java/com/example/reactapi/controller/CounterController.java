package com.example.reactapi.controller;

import com.example.reactapi.model.Counter;
import com.example.reactapi.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("counter")
public class CounterController {
    private final CounterService counterService;

    @PostMapping("increment/{counterId}")
    public Counter incrementCounter(@PathVariable Integer counterId) {
        return counterService.incrementCounter(counterId);
    }

    @PostMapping("decrement/{counterId}")
    public Counter decrementCounter(@PathVariable Integer counterId) {
        return counterService.decrementCounter(counterId);
    }

    @GetMapping("{counterId}")
    public Counter getCounterById(@PathVariable Integer counterId) {
        return counterService.getCounterById(counterId);
    }

    @PostMapping
    public Counter saveCounter(){
        return counterService.saveCounter();
    }
}
