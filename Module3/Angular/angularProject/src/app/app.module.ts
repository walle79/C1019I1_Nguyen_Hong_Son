import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SonComponent } from './components/son/son.component';
import { ComponentToViewComponent } from './components/component-to-view/component-to-view.component';
import { ViewToComponentComponent } from './components/view-to-component/view-to-component.component';
import { TwoWayBindingComponent } from './components/two-way-binding/two-way-binding.component';
import { FontSizeEditorComponent } from './components/font-size-editor/font-size-editor.component';
import { ShowPetsComponent } from './components/show-pets/show-pets.component';
import { CalculatorComponent } from './components/calculator/calculator.component';
import { ColorPickerComponent } from './components/color-picker/color-picker.component';
import { ProcessBarComponent } from './components/process-bar/process-bar.component';

@NgModule({
  declarations: [
    AppComponent,
    SonComponent,
    ComponentToViewComponent,
    ViewToComponentComponent,
    TwoWayBindingComponent,
    FontSizeEditorComponent,
    ShowPetsComponent,
    CalculatorComponent,
    ColorPickerComponent,
    ProcessBarComponent
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
