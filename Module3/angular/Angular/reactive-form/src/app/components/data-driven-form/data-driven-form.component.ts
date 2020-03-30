import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';

@Component({
  selector: 'app-data-driven-form',
  templateUrl: './data-driven-form.component.html',
  styleUrls: ['./data-driven-form.component.css']
})
export class DataDrivenFormComponent implements OnInit {
	public frmReg : FormGroup

  constructor(
  	// FormBuilder là 1 dj nên cần tiêm vào constructor
  	private _formBuilder : FormBuilder
  	) { }

  ngOnInit(): void {
  	this.createForm();
  }
  createForm() {
  	this.frmReg = this._formBuilder.group ({
  		username: ['', [
  			Validators.required,
  			Validators.minLength(5),
  			Validators.maxLength(20)
  		]],
  		password: ['', Validators.required],
  		fullname: ['', Validators.required],
  		email: ['', Validators.pattern('^[a-z][a-z0-9_\.]{5,32}@[a-z0-9]{2,}(\.[a-z0-9]{2,4}){1,2}$')],
  		phone: ['', Validators.required]
  	})
  	this.frmReg.valueChanges.subscribe(data => {
  		console.log(data)
  	})
  }
  onSubmitForm() {
  	console.log(this.frmReg)
  }
  onResetForm() {
  	this.frmReg.reset();
  }

}
