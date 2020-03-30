import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
	public number1 : number;
	public number2 : number;
	public operator = "+";
	public output: number;
  constructor() { }

  ngOnInit(): void {
  }
  onFirstChange(value){
  	this.number1 = Number(value)
  }
  onSecondChange(value){
  	this.number2 = Number(value)
  }
  onSelectChange(value){
  	this.operator = value
  }
  cal() {
  	switch (this.operator) {
  		case "+":
  			this.output = this.number1 + this.number2;
  			break;
  		case "-":
  			this.output = this.number1 - this.number2;
  			break;
  		case "*":
  			this.output = this.number1 * this.number2;
  			break;
  		case "/":
  			this.output = this.number1 / this.number2;
  			break;
  	}
  }
  

}
