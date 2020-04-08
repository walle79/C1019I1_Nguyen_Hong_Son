import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ReactiveFormComponent } from './components/reactive-form/reactive-form.component';
import { ReactiveFormsModule} from '@angular/forms';
import { RouterModule, Routes} from '@angular/router';
import { AboutComponent } from './components/about/about.component';
import { ContactComponent } from './components/contact/contact.component';
import { DataDrivenFormComponent } from './components/data-driven-form/data-driven-form.component';
import { HomeComponent } from './components/home/home.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { ProductsComponent } from './components/products/products.component';
import { appRoutes } from './app.routes';

// service
import { ProductService } from './services/product.service';
import { ProductDetailComponent } from './components/product-detail/product-detail.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { ProductEditComponent } from './components/product-edit/product-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    ReactiveFormComponent,
    DataDrivenFormComponent,
    AboutComponent,
    ContactComponent,
    HomeComponent,
    NotFoundComponent,
    ProductsComponent,
    ProductDetailComponent,
    ProductListComponent,
    ProductEditComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [
    ProductService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
