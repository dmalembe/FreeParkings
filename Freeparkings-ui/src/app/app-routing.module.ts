import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ParkingDetailComponent } from './parking-detail/parking-detail.component';
import { ParkingsComponent } from './parkings/parkings.component';

const routes: Routes = [
  { path: 'home', component: HomeComponent},
  { path: 'parkings', component: ParkingsComponent},
  { path: 'parking/:id', component: ParkingDetailComponent},
  { path: '', redirectTo: '/home', pathMatch: 'full' }
]

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [ RouterModule ]
})
export class AppRoutingModule { }
