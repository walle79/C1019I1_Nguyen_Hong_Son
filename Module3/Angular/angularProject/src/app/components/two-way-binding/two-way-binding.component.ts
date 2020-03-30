import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way-binding',
  templateUrl: './two-way-binding.component.html',
  styleUrls: ['./two-way-binding.component.css']
})
export class TwoWayBindingComponent implements OnInit {
	public name : string = "";
	public gender : number = 0; // 0 vn 1 fr 2 us 
  constructor() { }

  ngOnInit(): void {
  }

}
