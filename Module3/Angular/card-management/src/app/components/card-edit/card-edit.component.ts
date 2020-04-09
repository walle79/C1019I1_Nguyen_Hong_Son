import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { CardService } from './../../services/card.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-card-edit',
  templateUrl: './card-edit.component.html',
  styleUrls: ['./card-edit.component.css']
})
export class CardEditComponent implements OnInit {
	public cardId;

  public frsEditCard: FormGroup
  constructor(
  	public formBuilder: FormBuilder,
  	public cardService: CardService,
  	public router: Router,
  	public activatedRoute: ActivatedRoute
  	) { }

  ngOnInit(): void {
  	this.frsEditCard = this.formBuilder.group({
  		name: ['', Validators.required],
  		price: ['', Validators.required],
  		discount: ['', Validators.required],
  		amount: ['', Validators.required],
  		status: ['']
  	})
  	this.activatedRoute.params.subscribe(data => {
  		this.cardId = data.id;
  		this.cardService.getCardById(this.cardId).subscribe(data => {
  			this.frsEditCard.patchValue(data);
  		})
  	})
  }
  onEditCard(){
  	this.cardService.editCard(this.frsEditCard.value, this.cardId).subscribe(data => {
  		this.router.navigate(['/'])
  	})
  }

}
