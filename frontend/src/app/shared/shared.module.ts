import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
<<<<<<< HEAD
import { NavBarComponent } from './navbar/navbar.component';
=======
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
import { AuthModule } from '../auth/auth.module';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
<<<<<<< HEAD
    NavBarComponent 
=======
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
  ],
  imports: [
    CommonModule,
    AuthModule,
    RouterModule
  ],
  exports: [
<<<<<<< HEAD
    NavBarComponent
=======
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
  ]
})
export class SharedModule {}