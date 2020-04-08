import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {

  constructor(
  	public activatedRoute : ActivatedRoute
  	) { }

  ngOnInit(): void {
  	this.handleParams();
  }
  handleParams(){
  	this.activatedRoute.parent.params.subscribe((params : Params) => {
  			console.log(params)
  		}
  		)
  }

}
