import { Component, OnInit } from '@angular/core';
import { ExercicioService } from "../service/exercicio.service";

@Component({
    selector: 'exercicio-list',
    templateUrl: './exercicio.list.html'
})
export class ExercicioList implements OnInit {

    exercicios: Object[] = [];

    constructor(private service: ExercicioService) { }

    ngOnInit(): void {
        this.service
            .findAll(null, null).subscribe(e => {
                this.exercicios = e;
            }, err => console.log(err));
    }

}