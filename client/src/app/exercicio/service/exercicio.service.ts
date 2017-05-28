import { Http, Headers, Response } from '@angular/http';
import { BaseServiceInterface } from "../../base/base.service.interface";
import { ExercicioComponent } from "../exercicio.component";
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable()
export class ExercicioService implements BaseServiceInterface {

    http: Http;
    headers: Headers;
    url: string;

    constructor(http: Http) {
        this.http = http;
        this.url = 'http://localhost:8080/GymTracker/api/exercicios';

        this.headers = new Headers();
        this.headers.append('Content-type', 'application/json');
    }

    save(e: ExercicioComponent): Observable<ExercicioComponent> {
        return this.http.post(this.url, JSON.stringify(e), { headers: this.headers }).map(res => res.json());
    }

    update(e: ExercicioComponent): Observable<ExercicioComponent> {
        return this.http.put(this.url + "/" + e.id, JSON.stringify(e), { headers: this.headers }).map(res => res.json());
    }

    delete(id: string): Observable<Response> {
        return this.http.delete(this.url + "/" + id, { headers: this.headers });
    }

    findById(id: string): Observable<ExercicioComponent> {
        return this.http.get(this.url + "/" + id, { headers: this.headers }).map(res => res.json());
    }

    findAll(limit: number, offset: number): Observable<ExercicioComponent[]> {
        return this.http.get(this.url, { headers: this.headers }).map(res => res.json());
    }

}