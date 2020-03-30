import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-component-to-view',
  templateUrl: './component-to-view.component.html',
  styleUrls: ['./component-to-view.component.css']
})
export class ComponentToViewComponent implements OnInit {
	public name : string = "Sơn";
	public age : number = 25;
	public user : object = {
		name : "Hồng Sơn",
		age : 25
	};
	  public imgLink : string = 'https://lh3.googleusercontent.com/proxy/uEfxir47SdmoVFD-z9iSVeYDG6hzv0FjzAL41ZB4xXaR6sCNSr5rvbbED23mnNwWArwapugfRD7nBongiGFCMmBfuXobyy38Y7xthadps34EIK6d220ILrEbZLwQjj5bRkflDWUP7eKuXGnc5zixcRlgzfsC-_zHATVkbg';
	  public link : string = "https://facebook.com";

  constructor() { }

  ngOnInit() {
  }
  showInfo(){
  	return `name: ${this.user['name']}`;
  }

}
