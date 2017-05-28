import { Observable } from 'rxjs';

export interface BaseServiceInterface {

    save(e: any): Observable<any>;
    update(e: any): Observable<any>;
    delete(id: string): Observable<any>;
    findById(id: string): Observable<any>;
    findAll(limit: number, offset: number): Observable<any[]>;
}