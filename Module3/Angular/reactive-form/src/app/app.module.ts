import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormComponent } from './components/reactive-form/reactive-form.component';
import { ReactiveFormsModule} from '@angular/forms';
import { MovieListComponent } from './components/movie-list/movie-list.component';
import { MovieAddEditComponent } from './components/movie-add-edit/movie-add-edit.component';

// service
import { MovieService } from './services/movie.service';
import { DataDrivenFormComponent } from './components/data-driven-form/data-driven-form.component';


@NgModule({
  declarations: [
    AppComponent,
    ReactiveFormComponent,
    MovieListComponent,
    MovieAddEditComponent,
    DataDrivenFormComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [
    MovieService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
