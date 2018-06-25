package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface PotluckRepository extends CrudRepository<Potluck,Long>{
    Iterable <Potluck> findAllByFoodContainingIgnoreCase(String search);
    Iterable <Potluck> findAllByNameContainingIgnoreCase(String search2);
}