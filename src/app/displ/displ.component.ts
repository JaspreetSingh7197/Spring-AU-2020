import { Component, OnInit } from '@angular/core';
import { MyServeService } from '../my-serve.service';

@Component({
  selector: 'app-displ',
  templateUrl: './displ.component.html',
  styleUrls: ['./displ.component.scss']
})
export class DisplComponent implements OnInit {

  constructor(public MyServeService:MyServeService) { }
  arr=[];   
  ngOnInit() {
    this.arr=this.MyServeService.get();
  }

}
