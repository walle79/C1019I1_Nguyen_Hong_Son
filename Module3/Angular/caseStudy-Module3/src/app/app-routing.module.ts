import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { PageNotFoundComponent } from './components/page-not-found/page-not-found.component';
import { EmployeeListComponent } from './components/employees/employee-list/employee-list.component';
import { CommonModule } from '@angular/common';
import { MatDialogModule } from '@angular/material/dialog';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import { EmployeeAddComponent } from './components/employees/employee-add/employee-add.component';
import { EmployeeDeleteComponent } from './components/employees/employee-delete/employee-delete.component';
import { EmployeeEditComponent } from './components/employees/employee-edit/employee-edit.component';


const routes: Routes = [
	{
		path: '',
		component: HomeComponent
	},
	{
		path: 'employee-list',
		component: EmployeeListComponent
	},
	{
		path: 'employee-add',
		component: EmployeeAddComponent
	},
	{
		path: 'employee-edit/:id',
		component: EmployeeEditComponent
	},
	{
		path: '**',
		component: PageNotFoundComponent
	}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
   CommonModule,
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    MatDialogModule
    ], 
  exports: [RouterModule, MatDialogModule],
   entryComponents: [EmployeeDeleteComponent],
  declarations: [HomeComponent, PageNotFoundComponent, EmployeeListComponent, EmployeeAddComponent, EmployeeDeleteComponent, EmployeeEditComponent]
})
export class AppRoutingModule { }
