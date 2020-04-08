import { Injectable } from '@angular/core';
import { Product } from './../models/products.class';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
	public products : Product[] = [
		{
			id: 1,
			name: "Iphone 7",
			price: 10000000,
			status: false
		},
		{
			id: 2,
			name: "Samsung s2",
			price: 2000000,
			status: true
		},
		{
			id: 3,
			name: "Nokia 3",
			price: 3000000,
			status: false
		}
	]

  constructor() { }

  getAllProducts(name?: string, price?: number){
  	let result : Product[] = this.products;
  	if(name) {
  		result = this.products.filter(x => {
  			return x.name.toLowerCase().indexOf(name.toLowerCase()) != -1;
  		})
  	}
  	if(price) {
  		result = this.products.filter(x => {
  			return x.price == price;
  		})
  	}
  	return result;
  }
  getProductById(id:number){
  	let res = null;
  	for (var i = 0; i < this.products.length; i++) {
  		if(this.products[i].id == id) {
  			res = this.products[i];
  			break;
  		}
  	}
  	return res;
  }
}
