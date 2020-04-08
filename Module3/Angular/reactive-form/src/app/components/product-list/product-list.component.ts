import { Component, OnInit } from '@angular/core';
import { ProductService } from './../../services/product.service';
import { Product } from './../../models/products.class';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  public products : Product[];
  public name: string;
  public price:number;
  constructor(
  	public productService : ProductService,
    public routerService : Router,
    public activatedRoute : ActivatedRoute
  	) { }

   ngOnInit(){
     this.activatedRoute.queryParams.subscribe(data => {
       let name = data['name'];
       let price = data['price']
       this.products = this.productService.getAllProducts(name, price);
     })
    
  }
}
