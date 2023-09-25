import { Component, OnInit } from '@angular/core';
import { BeerService } from '../beer.service';
import { Beer } from '../beer';

@Component({
  selector: 'app-beer',
  templateUrl: './beer.component.html',
  styleUrls: ['./beer.component.css']
})
export class BeerComponent implements OnInit{

   beers: Beer[];
   p: number = 1;

  constructor(private beerService: BeerService){}

  ngOnInit(): void {
    this.beerService.getBeers().subscribe((data: Beer[]) => {
      console.log(data);
      this.beers = data;
      
    });
  }

  public onClick(beer: Beer){
    beer.clicked = !beer.clicked;
  }

}
