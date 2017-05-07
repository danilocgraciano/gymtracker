import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { routing } from './app.routes';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { ExercicioComponent } from './exercicio/exercicio.component';
import { ExercicioList } from './exercicio/list/exercicio.list';
import { ExercicioForm } from "./exercicio/form/exercicio.form";

@NgModule({
  imports: [BrowserModule, routing, FormsModule, ReactiveFormsModule],
  declarations: [AppComponent, ExercicioList, ExercicioForm, ExercicioComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
