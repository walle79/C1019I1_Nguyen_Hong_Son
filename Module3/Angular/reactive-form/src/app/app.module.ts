import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormComponent } from './components/reactive-form/reactive-form.component';
import { ReactiveFormsModule} from '@angular/forms';
import { MovieListComponent } from './components/movie-list/movie-list.component';
import { MovieAddEditComponent } from './components/movie-add-edit/movie-add-edit.component';
import { RouterModule, Routes} from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';

// service
import { MovieService } from './services/movie.service';
import { DataDrivenFormComponent } from './components/data-driven-form/data-driven-form.component';
import { HomeComponent } from './components/home/home.component';
import { NotFoundComponent } from './components/not-found/not-found.component';

const appRoutes : Routes = [
    {
      path: '',
      redirectTo: '/index',
      pathMatch: 'full'
    },
    {
      path: 'index',
      component: HomeComponent
    },
    {
      path: 'about',
      component: AboutComponent
    },
    {
      path: 'contact',
      component: ContactComponent
    },
    {
      path: '**',
      component: NotFoundComponent
    }
]

@NgModule({
  declarations: [
    AppComponent,
    ReactiveFormComponent,
    MovieListComponent,
    MovieAddEditComponent,
    DataDrivenFormComponent,
    AboutComponent,
    ContactComponent,
    HomeComponent,
    NotFoundComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
    MovieService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
