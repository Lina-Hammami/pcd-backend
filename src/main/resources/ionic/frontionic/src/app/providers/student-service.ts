import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable()
export class ApplicationService {
  public API = 'http://localhost:8080';
  public STUDENTS_API = this.API + '/all/students';

  constructor(public http: HttpClient) {
  }

  getStudents(): Observable<any> {
    return this.http.get(this.API + '/students');
  }
}