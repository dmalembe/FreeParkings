import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { MaterialModule } from '../material.module';
import { ParkingsComponent } from './parkings/parkings.component';
import { HomeComponent } from './home/home.component';
import { AppRoutingModule } from './app-routing.module';
import { ParkingDetailComponent } from './parking-detail/parking-detail.component'
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    ParkingsComponent,
    HomeComponent,
    ParkingDetailComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    MaterialModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
