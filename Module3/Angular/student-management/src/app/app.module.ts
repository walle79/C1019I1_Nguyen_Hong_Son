import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule, Routes} from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './components/home/home.component';
import { StudentsComponent } from './components/students/students.component';
import { StudentsListComponent } from './components/students-list/students-list.component';
import { StudentAddComponent } from './components/student-add/student-add.component';
import { StudentEditComponent } from './components/student-edit/student-edit.component';

// service
import { StudentService } from './services/student.service';

const appRoutes : Routes = [
	{
		path: '',
		component: HomeComponent
	},
	{
		path: 'students',
		component: StudentsComponent,
		children: [
			{
				path: '',
				component: StudentsListComponent
			},
			{
				path: ':id/edit',
				component: StudentEditComponent
			},
			{
				path: 'add',
				component: StudentAddComponent
			}
		]
	}
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    StudentsComponent,
    StudentsListComponent,
    StudentAddComponent,
    StudentEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
  	StudentService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
