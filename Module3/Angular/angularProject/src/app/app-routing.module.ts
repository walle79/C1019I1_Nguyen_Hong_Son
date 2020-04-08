import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DictionaryListComponent } from './components/dictionary/dictionary-list/dictionary-list.component';
import { DictionaryAddComponent } from './components/dictionary/dictionary-add/dictionary-add.component';
import { DictionaryEditComponent } from './components/dictionary/dictionary-edit/dictionary-edit.component';
import { DictionaryDeleteComponent } from './components/dictionary/dictionary-delete/dictionary-delete.component';


const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
  declarations: [DictionaryListComponent, DictionaryAddComponent, DictionaryEditComponent, DictionaryDeleteComponent]
})
export class AppRoutingModule { }
