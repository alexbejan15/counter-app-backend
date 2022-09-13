package com.example.reactapi.repository;

import com.example.reactapi.model.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CounterRepository extends JpaRepository<Counter, Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE my_counter c set c.value = c.value - 1 WHERE c.id = :counterId")
    void decrementCounter(Integer counterId);

    @Transactional
    @Modifying
    @Query("UPDATE my_counter c set c.value = c.value + 1 WHERE c.id = :counterId")
    void incrementCounter(Integer counterId);

}
