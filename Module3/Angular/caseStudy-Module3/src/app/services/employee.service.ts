import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
	public API = 'http://localhost:3000/employees'

  constructor(
  	public http: HttpClient
  	) { }
getAllEmployees(): Observable<any>{
	return this.http.get(this.API);
}
addNewEmp(employee): Observable<any>{
	return this.http.post(this.API,employee);
}
getEmpById(empId): Observable<any> {
	return this.http.get(this.API + '/' + empId)
}
delEmpById(empId): Observable<any> {
	return this.http.delete(this.API + '/' + empId)
}
editEmp(emp, empId): Observable<any>{
	return this.http.put(this.API + '/' + empId, emp)
}

}
