import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { MyServeService } from '../my-serve.service';
@Component({
  selector: 'app-my-form',
  templateUrl: './my-form.component.html',
  styleUrls: ['./my-form.component.scss']
})
export class MyFormComponent implements OnInit {
  [x: string]: any;

  constructor(public MyServeService: MyServeService) { }
  profileForm= new FormGroup({ 
      usname: new FormControl(''),
      email: new FormControl(''),
      office_address: new FormGroup({
        area:new FormControl(''),
        city: new FormControl('')
      })
  });

  onSubmit()
  {
    console.log(this.profileForm.value);
    this.MyServeService.set(this.profileForm.value);
    this.profileForm.reset();
  }
  ngOnInit() {
  }

}
