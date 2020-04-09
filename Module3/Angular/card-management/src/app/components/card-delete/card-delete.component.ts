import { Component, OnInit, Inject } from '@angular/core';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { CardService } from './../../services/card.service';
import { CardListComponent } from './../card-list/card-list.component';


@Component({
  selector: 'app-card-delete',
  templateUrl: './card-delete.component.html',
  styleUrls: ['./card-delete.component.css']
})
export class CardDeleteComponent implements OnInit {
	public fullNameOfCard;
	public idOfCard;
	public cardlist;

  constructor(
    	public cardService: CardService,
    public dialogRef: MatDialogRef<CardDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any) {}

  ngOnInit(): void {
  	this.fullNameOfCard = this.data.name.name;
  	this.idOfCard = this.data.name.id;
  }
  delCard(){
  	this.cardService.delCardById(this.idOfCard).subscribe(data => {
  		this.dialogRef.close();
  		// this.employeelist.splice(this.idOfEmp,1)
  	})
  }

}
