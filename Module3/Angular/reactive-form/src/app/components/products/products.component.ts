import { Component, OnInit } from '@angular/core';
import { ProductService } from './../../services/product.service';
import { Product } from './../../models/products.class';
import { Router, ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {
	constructor(){};
  ngOnInit(){}
  // onSearch(){
  //   this.routerService.navigate(['products'],{queryParams : 
  //     {name : this.name? this.name : '', price : this.price? this.price : ''}})
  // }

}
