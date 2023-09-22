package com.example.angularjavatraining.services;

import com.example.angularjavatraining.models.Beer;

import java.util.List;

public interface BeerService {
  List<Beer> findAllBeer();
}
