import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http' ;
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CardService {
	public API = 'http://localhost:3000/cards'

  constructor(
  	public http: HttpClient
  	) { }
  getAllCards(): Observable<any> {
  	return this.http.get(this.API)
  }
  addNewCard(card): Observable<any> {
  	return this.http.post(this.API, card)
  }
  getCardById(cardId): Observable<any> {
  return this.http.get(this.API + '/' + cardId)
}
  editCard(card, cardId): Observable<any>{
  return this.http.put(this.API + '/' + cardId, card)
}
delCardById(cardId): Observable<any> {
  return this.http.delete(this.API + '/' + cardId)
}
}
