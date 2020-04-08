import { Component, OnInit, OnDestroy } from '@angular/core';
import { StudentService } from './../../services/student.service';
import { Subscription } from 'rxjs';
import { Student } from './../../models/student.class';
import { Router } from '@angular/router';

@Component({
  selector: 'app-student-add',
  templateUrl: './student-add.component.html',
  styleUrls: ['./student-add.component.css']
})
export class StudentAddComponent implements OnInit, OnDestroy {

	public student: Student;
	public subscription: Subscription;
  constructor(
  	public studentService : StudentService,
  	public routerService: Router
  	) { }

  ngOnInit() {
  	this.student = new Student();
  }

  onAddStudent(){
  	this.subscription = this.studentService.addStudent(this.student).subscribe(data => {
  		if(data && data.id){
  			this.routerService.navigate(['students'])
  		}
  	})
  }
  ngOnDestroy() {
  	if(this.subscription){
  	this.subscription.unsubscribe();
  }
  }

}
