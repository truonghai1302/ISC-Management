import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class MajorService {

  private baseUrl = 'http://localhost:8080/api/v1/majors';

  constructor(private http: HttpClient) { }

  getMajor(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createMajor(major: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, major);
  }

  // updateMajort(id: number, value: any): Observable<Object> {
  //   return this.http.put(`${this.baseUrl}/${id}`,value);
  // }
  updateMajor(major: Object,id:number): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`,major)
  }

  deleteMajor(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getMajorList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
