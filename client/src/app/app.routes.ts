import { RouterModule, Routes } from '@angular/router';
import { ExercicioList } from './exercicio/list/exercicio.list'
import { ExercicioForm } from "./exercicio/form/exercicio.form";

const appRoutes: Routes = [
    { path: 'exercicios', component: ExercicioList },
    { path: 'exercicio', component: ExercicioForm },
    { path: '**', component: ExercicioList }
];

export const routing = RouterModule.forRoot(appRoutes);