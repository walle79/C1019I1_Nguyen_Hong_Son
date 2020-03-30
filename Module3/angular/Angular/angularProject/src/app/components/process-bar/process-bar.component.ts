import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-process-bar',
  templateUrl: './process-bar.component.html',
  styleUrls: ['./process-bar.component.css']
})
export class ProcessBarComponent implements OnInit {
	@Input() backgroundColor= '#333';
	@Input() processBar= 'f1f1f1';
	@Input() width = 50;

  constructor() { }

  ngOnInit(): void {
  }

}
