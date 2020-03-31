import {Component, OnInit} from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { products } from '../products';
import {CartService} from "../cart.service";

@Component({
    selector: 'app-product-details',
    templateUrl: './product-details.component.html',
    styleUrls: ['./product-details.component.css']
})
export class ProductDetailsComponent implements OnInit {

    product;

    ngOnInit() {
        this.route.paramMap.subscribe(params => {
            this.product = products[+params.get('productId')];
        });
    }



    constructor(
        private route: ActivatedRoute,
        private cartService : CartService
    ) { }


    addToCart(product) {
        window.alert('Your Product has been added to the cart!');
        this.cartService.addToCard(product);
    }


}