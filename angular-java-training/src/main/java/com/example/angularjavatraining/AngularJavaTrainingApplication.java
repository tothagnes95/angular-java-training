package com.example.angularjavatraining;

import com.example.angularjavatraining.models.Beer;
import com.example.angularjavatraining.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngularJavaTrainingApplication implements CommandLineRunner {
  private BeerService beerService;
  @Autowired
  public AngularJavaTrainingApplication(BeerService beerService){
    this.beerService = beerService;
  }

  public static void main(String[] args) {
    SpringApplication.run(AngularJavaTrainingApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    beerService.save(new Beer("Rafa", "A Fehér Nyúl ikonikus savanyított söre, limoncello dobozba zárva"));
    beerService.save(new Beer("Turbid", "A Fehér Nyúl sztenderd NEIPA söre, krémes test, felhős kinézet, citrusos-trópusi gyümölcsös aroma"));
  }
}
