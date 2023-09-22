package com.example.angularjavatraining.controllers;

import com.example.angularjavatraining.models.Beer;
import com.example.angularjavatraining.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BeerController {

  private BeerService beerService;
  @Autowired
  public BeerController(BeerService beerService){
    this.beerService = beerService;
  }

  @GetMapping("/beers")
  public List<Beer> getAllBeers (){
    return beerService.findAllBeer();
  }
}
