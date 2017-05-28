import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpModule } from '@angular/http';
import 'rxjs/add/operator/map';
import { routing } from './app.routes';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ExercicioComponent } from './exercicio/exercicio.component';
import { ExercicioList } from './exercicio/list/exercicio.list';
import { ExercicioForm } from "./exercicio/form/exercicio.form";
import { ExercicioService } from "./exercicio/service/exercicio.service";

@NgModule({
  imports: [BrowserModule, HttpModule, routing, FormsModule, ReactiveFormsModule],
  declarations: [AppComponent, ExercicioList, ExercicioForm, ExercicioComponent],
  providers :[ExercicioService],
  bootstrap: [AppComponent]
})
export class AppModule { }
