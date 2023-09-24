package com.example.angularjavatraining.services;

import com.example.angularjavatraining.models.Beer;
import com.example.angularjavatraining.repositories.BeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerServiceImp implements BeerService{
  private BeerRepository beerRepository;
  @Autowired
  public BeerServiceImp (BeerRepository beerRepository){
    this.beerRepository = beerRepository;
  }
  public List<Beer> findAllBeer(){
    return beerRepository.findAll();
  }

  public void save(Beer beer){
    beerRepository.save(beer);
  }
}
