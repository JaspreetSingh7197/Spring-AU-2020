import { Component, OnInit } from '@angular/core';
import { MyServeService } from './my-serve.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'myAssign';
  arr=[];
  constructor(public myserve:MyServeService){};
  ngOnInit()
  {
    this.arr=this.myserve.get();
    console.log(this.arr);
  }
}
