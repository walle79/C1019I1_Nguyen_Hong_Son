import { Component, OnInit } from '@angular/core';
import { CardService } from './../../services/card.service';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { CardDeleteComponent } from './../card-delete/card-delete.component';

@Component({
  selector: 'app-card-list',
  templateUrl: './card-list.component.html',
  styleUrls: ['./card-list.component.css']
})
export class CardListComponent implements OnInit {
  public term;
  public p;
	public cards;
  constructor(
  	public cardService: CardService,
    public dialog: MatDialog
  	) { }

  ngOnInit(): void {
  	this.cardService.getAllCards().subscribe(data => {
  		this.cards = data;
  	})
  }
  openDialog(cardId): void {
    this.cardService.getCardById(cardId).subscribe(dataOfCard => {
        const dialogRef = this.dialog.open(CardDeleteComponent, {
      width: '500px',
      data: {name: dataOfCard}
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
     this.ngOnInit();
    });
    })
    
  }

  

}
