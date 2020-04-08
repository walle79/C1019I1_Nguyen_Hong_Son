import { Component, OnInit, Inject } from '@angular/core';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { EmployeeService } from './../../../services/employee.service';
import { EmployeeListComponent } from './../employee-list/employee-list.component';

@Component({
  selector: 'app-employee-delete',
  templateUrl: './employee-delete.component.html',
  styleUrls: ['./employee-delete.component.css']
})
export class EmployeeDeleteComponent implements OnInit {
	public fullNameOfEmp;
	public idOfEmp;
	public employeelist;

    constructor(
    	public employeeService: EmployeeService,
    public dialogRef: MatDialogRef<EmployeeDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any) {}

  ngOnInit(): void {
  	this.fullNameOfEmp = this.data.name.fullName;
  	this.idOfEmp = this.data.name.id;
  }
  delEmp(){
  	this.employeeService.delEmpById(this.idOfEmp).subscribe(data => {
  		this.dialogRef.close();
  		// this.employeelist.splice(this.idOfEmp,1)
  	})
  }

}
