import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http' ;
import { Student } from './../models/student.class';
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class StudentService {

	public API : string = 'http://localhost:3000/students';

  constructor(
  	private http : HttpClient
  	) { }
  getAllStudents(): Observable<any> {
  	return this.http.get(this.API)
  }
  addStudent(student: Student) : Observable<any> {
  	return this.http.post(this.API, student)
  }
  deleteStudent(id:number): Observable<any> {
  	return this.http.delete(`${this.API}/${id}`)
  }
}
