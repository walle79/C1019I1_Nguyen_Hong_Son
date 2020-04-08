import { Component, OnInit, OnDestroy } from '@angular/core';
import { StudentService } from './../../services/student.service';
import { Subscription } from 'rxjs';
import { Student } from './../../models/student.class';

@Component({
  selector: 'app-students-list',
  templateUrl: './students-list.component.html',
  styleUrls: ['./students-list.component.css']
})
export class StudentsListComponent implements OnInit, OnDestroy {
	public subscription: Subscription;
	public students: Student[] = [];

  constructor(
  	public studentService : StudentService
  	) { }

  ngOnInit(): void {
  	this.subscription = this.studentService.getAllStudents().subscribe(data => {
    console.log(data);
  		this.students = data;
  	})
  }
  ngOnDestroy() {
  	if(this.subscription){
  	this.subscription.unsubscribe();
  }
  }
  onDeleteStudent(id: number){
    this.subscription = this.studentService.deleteStudent(id).subscribe(data => {
      this.updateAfterDelete(id);
    })
  }
  updateAfterDelete(id:number){
    for (var i = 0; i < this.students.length; i++) {
      if(this.students[i].id == id) {
        this.students.splice(i,1);
        break;
      }
    }
  }

}
