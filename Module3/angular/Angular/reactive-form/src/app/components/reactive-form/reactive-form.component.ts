import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit {

  // public frmReg : FormGroup
 
  constructor(
  	// private _formBuilder : FormBuilder

  	) { }

  ngOnInit(): void {
  	// this.createForm();
  	}
  // }
  // createForm() {
  // 	this.frmReg = this._formBuilder.group({
  // 		email : ['', [
  // 			Validators.pattern('^[a-z][a-z0-9_\.]{5,32}@[a-z0-9]{2,}(\.[a-z0-9]{2,4}){1,2}$')
  // 		]],
  // 		password : ['', [
  // 			Validators.required
  // 		]],
  // 		age : ['', [
  // 			Validators.min(18)
  // 		]],
  // 		phone: ['', [
  // 			Validators.pattern('^{+84}d{9,10}$')
  // 		]]

  // 	});
  //   this.frmReg.valueChanges.subscribe(data => {
  //     console.log(data);
  //   })
  // }
  // onSubmitForm(){
  // 	console.log(this.frmReg)
  // }
  // onResetForm(){
  //   this.frmReg.reset();
  // }

  //  (function() {
  //   'use strict';
  //   window.addEventListener('load', function() {
  //     // Fetch all the forms we want to apply custom Bootstrap validation styles to
  //     var forms = document.getElementsByClassName('needs-validation');
  //     // Loop over them and prevent submission
  //     var validation = Array.prototype.filter.call(forms, function(form) {
  //       form.addEventListener('submit', function(event) {
  //         if (form.checkValidity() === false) {
  //           event.preventDefault();
  //           event.stopPropagation();
  //         }
  //         form.classList.add('was-validated');
  //       }, false);
  //     });
  //   }, false);
  // })();
   }
