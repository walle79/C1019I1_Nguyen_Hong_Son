import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CardService } from './../../services/card.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-card-add',
  templateUrl: './card-add.component.html',
  styleUrls: ['./card-add.component.css']
})
export class CardAddComponent implements OnInit {

	public frsAddCard: FormGroup
  constructor(
  	public formBuilder: FormBuilder,
  	public cardService: CardService,
  	public router: Router
  	) { }

  ngOnInit(): void {
  	this.frsAddCard = this.formBuilder.group({
  		name: ['', Validators.required],
  		price: ['', Validators.required],
  		discount: ['', Validators.required],
  		amount: ['', Validators.required],
  		status: ['']
  	})
  }
  onAddCard(){
  	this.cardService.addNewCard(this.frsAddCard.value).subscribe(data =>{
  		this.router.navigate(['/'])
  	})
  }

}
