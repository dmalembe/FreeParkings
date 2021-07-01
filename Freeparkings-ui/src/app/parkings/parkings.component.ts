import { Component, OnInit } from '@angular/core';
import { ParkingInfo } from '../parkingInfo';
import { ParkingService } from '../services/parking.service';

@Component({
  selector: 'app-parkings',
  templateUrl: './parkings.component.html',
  styleUrls: ['./parkings.component.css']
})
export class ParkingsComponent implements OnInit {
  
 

  parkings: ParkingInfo[];

  constructor(private ParkingService: ParkingService) { }

  ngOnInit(): void {
    this.ParkingService.getParkings().subscribe(
      Response=>{
        this.parkings= Response;
      }

    )
  }

  CalculStyleStatut(parking: ParkingInfo){
    if(parking.statut === "OUVERT"){
        return {color:'green'}
      } else if (parking.statut === "ABONNES"){
          return {color:'orange'}
      } else if(parking.statut === "FERME"){
          return {color:'red'}
      } else {
        return {'font-style': 'italic'}
      }
    }


}
