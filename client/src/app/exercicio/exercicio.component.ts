import { Component, Input } from '@angular/core';

@Component({
    selector: 'exercicio',
    templateUrl: './exercicio.component.html'
})
export class ExercicioComponent {

    id: string = '';
    @Input() nome: string = '';
}