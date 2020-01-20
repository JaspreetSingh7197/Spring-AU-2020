import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MyServeService {
  [x: string]: any;
  arr=[];
  get()
  {
    return this.arr;
  }
  set(strg)
  {
     // console.log(strg);
      this.arr.push(strg);
  }

  constructor() {}
}
