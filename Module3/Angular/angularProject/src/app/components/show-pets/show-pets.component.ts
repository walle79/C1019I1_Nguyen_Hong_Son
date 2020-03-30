import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-show-pets',
  templateUrl: './show-pets.component.html',
  styleUrls: ['./show-pets.component.css']
})
export class ShowPetsComponent implements OnInit {
public name: string = "";
public img: string = "https://nguoinoitieng.tv/images/nnt/96/0/bbka.jpg";
  constructor() { }

  ngOnInit(): void {
  }


}
