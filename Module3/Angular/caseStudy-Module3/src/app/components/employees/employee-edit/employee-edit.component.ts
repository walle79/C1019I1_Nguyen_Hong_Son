import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { EmployeeService } from './../../../services/employee.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {
	public empId;

	public formEditNewEmp: FormGroup
  constructor(
  	public formBuilder: FormBuilder,
  	public employeeService: EmployeeService,
  	public router: Router,
  	public activatedRoute: ActivatedRoute
  	) { }

  ngOnInit(): void {
  	this.formEditNewEmp = this.formBuilder.group({
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
  	this.activatedRoute.params.subscribe(data => {
  		this.empId = data.id;
  		this.employeeService.getEmpById(this.empId).subscribe(data => {
  			this.formEditNewEmp.patchValue(data);
  		})
  	})
  }
  onEditNewEmp(){
  	this.employeeService.editEmp(this.formEditNewEmp.value, this.empId).subscribe(data => {
  		this.router.navigate(['/employee-list'])
  	})
  }


}
