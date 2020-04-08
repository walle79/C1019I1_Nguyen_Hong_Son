import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { EmployeeService } from './../../../services/employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {
	public formAddNewEmp: FormGroup

  constructor(
  	public formBuilder: FormBuilder,
  	public employeeService: EmployeeService,
  	public router: Router
  	) { }

  ngOnInit(): void {
  	this.formAddNewEmp = this.formBuilder.group({
  		fullName: ['', [Validators.required]],
  		position: ['', [Validators.required]],
  		academy: ['', [Validators.required]],
  		part: ['', [Validators.required]],
  		birthday: ['', [Validators.required]],
  		id_number: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
  		salary: ['', [Validators.required, Validators.pattern('^[0-9]{1,}$')]],
  		email: ['', [Validators.required, Validators.email]],
  		phone_number: ['', [Validators.required]],
  		address: ['', [Validators.required]]
  	})
  }
  onAddNewEmp(){
  	this.employeeService.addNewEmp(this.formAddNewEmp.value).subscribe(data => {
  		this.router.navigate(['employee-list'])
  	})
  }

}
