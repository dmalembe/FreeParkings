import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ParkingInfo } from '../parkingInfo';

@Injectable({
  providedIn: 'root'
})
export class ParkingService {

  constructor(private HttpClient: HttpClient) { }

  getParkings(): Observable<ParkingInfo[]> {
    return this.HttpClient.get<ParkingInfo[]>("http://localhost:8080/parkings")
  }



}
