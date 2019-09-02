import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CourseService {

  private baseUrl = 'http://localhost:8080/api/v1/courses';

  constructor(private http: HttpClient) { }

  getCourse(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createCourse(course: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, course);
  }

  // updateCourse(id: number, value: any): Observable<Object> {
  //   return this.http.put(`${this.baseUrl}/${id}`,value);
  // }
  updateCourse(course: Object,id:number): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`,course)
  }

  deleteCourse(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getCourseList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}

