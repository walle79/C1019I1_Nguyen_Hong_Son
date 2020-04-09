import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CardListComponent } from './components/card-list/card-list.component';
import { CardAddComponent } from './components/card-add/card-add.component';
import { CardEditComponent } from './components/card-edit/card-edit.component';
import { CardDeleteComponent } from './components/card-delete/card-delete.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { MatDialogModule } from '@angular/material/dialog';


const routes: Routes = [
	{
		path: '',
		component: CardListComponent
	},
	{
		path: 'card-add',
		component: CardAddComponent
	},
	{
		path: 'card-edit/:id',
		component: CardEditComponent
	},
	{
		path: 'card-delete',
		component: CardDeleteComponent
	},
	{
		path: '**',
		component: NotFoundComponent
	},
];

@NgModule({
  imports: [RouterModule.forRoot(routes), CommonModule,
   FormsModule, ReactiveFormsModule, NgxPaginationModule,
   Ng2SearchPipeModule, MatDialogModule],
  exports: [RouterModule, MatDialogModule],
  entryComponents: [CardDeleteComponent],
  declarations: [CardListComponent, CardAddComponent, CardEditComponent, CardDeleteComponent, NotFoundComponent]
})
export class AppRoutingModule { }
