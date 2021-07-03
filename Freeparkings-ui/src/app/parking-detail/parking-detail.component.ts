import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ParkingInfo } from '../parkingInfo';
import { ParkingService } from '../services/parking.service';

@Component({
  selector: 'app-parking-detail',
  templateUrl: './parking-detail.component.html',
  styleUrls: ['./parking-detail.component.css']
})
export class ParkingDetailComponent implements OnInit {

  parking: ParkingInfo;
  isloaded: boolean = false;

  constructor(private route: ActivatedRoute, private parkingService: ParkingService ) { }

  ngOnInit(): void {
    const parkingId = parseInt(this.route.snapshot.paramMap.get('id'));
    this.parkingService.getParking(parkingId).subscribe(
      response => {
        this.parking = response ;
        this.isloaded = true;
      }
    );
  }

}
