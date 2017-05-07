import { Component } from '@angular/core';

@Component({
    selector: 'exercicio-list',
    templateUrl: './exercicio.list.html'
})
export class ExercicioList {

    exercicios: Object[] = [];

    constructor() {
        this.exercicios = [
            "Leg Press 45",
            "Banco Extensor",
            "Leg Press 180",
            "Mesa Flexora deitada",
            "Panturrilha Sentado + Drop Set",
            "Desenvolvimento com Halteres",
            "Elevação lateral",
            "Elevação Frontal com Halteres",
            "Remada Alta com Barra",
            "Encolhimento com Halteres",
            "Infra na Paralela"];
    }

}