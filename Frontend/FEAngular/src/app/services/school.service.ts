import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class SchoolService {

  private baseUrl = 'http://localhost:8080/api/v1/schools';

  constructor(private http: HttpClient) { }

  getSchool(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createSchool(school: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, school);
  }

  // updateSchool(id: number, value: any): Observable<Object> {
  //   return this.http.put(`${this.baseUrl}/${id}`,value);
  // }
  updateSchool(school: Object,id:number): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`,school)
  }

  deleteSchool(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getSchoolList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
