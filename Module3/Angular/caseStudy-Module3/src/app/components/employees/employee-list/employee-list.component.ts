import { Component, OnInit } from '@angular/core';
import { EmployeeService } from './../../../services/employee.service';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { EmployeeDeleteComponent } from './../employee-delete/employee-delete.component';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  public term: string;
  p;
	public employees;

  constructor(
  	public employeeService: EmployeeService,
    public dialog: MatDialog
  	) { }

  ngOnInit(): void {
  	this.employeeService.getAllEmployees().subscribe(data => {
  		this.employees = data;
  		
  	})
  }
   openDialog(empId): void {
     this.employeeService.getEmpById(empId).subscribe(dataOfEmp => {
       const dialogRef = this.dialog.open(EmployeeDeleteComponent, {
      width: '500px',
      data: {name: dataOfEmp}
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
      this.ngOnInit();
    });
     })
    
  }

}
