import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Beer } from './beer';

@Injectable({
  providedIn: 'root'
})
export class BeerService {

  private baseUrl = "http://localhost:8080/api/beers"

  constructor(private http: HttpClient) { }

  getBeers(): Observable<Beer[]>{
    return this.http.get<Beer[]>(`${this.baseUrl}`);
  }

  
}
