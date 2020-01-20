import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DisplComponent } from './displ/displ.component';
import { MyFormComponent } from './my-form/my-form.component';

const routes: Routes = [{
  path:'display' ,component:DisplComponent},
  {path:"home",component:MyFormComponent},
  {path:"",redirectTo:"home",pathMatch:"full"},
  {path:"**",component:MyFormComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
