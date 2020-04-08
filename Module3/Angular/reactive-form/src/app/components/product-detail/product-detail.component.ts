import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Product } from './../../models/products.class';
import { ProductService } from './../../services/product.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {
	public product : Product;
  constructor(
  	public activatedRoute : ActivatedRoute,
  	public productService : ProductService,
    public routerService : Router
  	) { }

  ngOnInit(): void {
  	let id = this.activatedRoute.snapshot.params['id'];
  	this.product = this.productService.getProductById(id);
  	console.log(this.product);
  }
  onBackList(){
    this.routerService.navigate(['products']);
  }
  onEdit(){
    this.routerService.navigate([`product/${this.product.id}/edit`])
  }
  onDelete(){

  }

}
