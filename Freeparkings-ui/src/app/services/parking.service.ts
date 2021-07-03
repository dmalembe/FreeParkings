import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { ParkingInfo } from '../parkingInfo';
import { ParkingsComponent } from '../parkings/parkings.component';

@Injectable({
  providedIn: 'root'
})
export class ParkingService {

  constructor(private HttpClient: HttpClient) { }

  getParkings(): Observable<ParkingInfo[]> {
    return this.HttpClient.get<ParkingInfo[]>("http://localhost:8080/parkings")
  }

  getParking(id : number): Observable<ParkingInfo> {
    return this.HttpClient.get<ParkingInfo[]>("http://localhost:8080/parkings").pipe(
    map(parkings => parkings.find(parking => parking.id === id)) );
  }

}
