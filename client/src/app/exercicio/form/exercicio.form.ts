import { Component } from '@angular/core';
import { ExercicioComponent } from "../exercicio.component";
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
    selector: 'exercicio-form',
    templateUrl: './exercicio.form.html'
})
export class ExercicioForm {

    exercicio: ExercicioComponent = new ExercicioComponent();
    myForm: FormGroup;

    constructor(fb: FormBuilder) {
        this.myForm = fb.group({
            nome: ['', Validators.required]
        });
    }

}