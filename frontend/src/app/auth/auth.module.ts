import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { AuthRoutingModule } from "./auth-routing.module";
import { ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
<<<<<<< HEAD
import { RouterModule } from "@angular/router";
import { LoginComponent } from "./components/login/login.component";
import { LogoutComponent } from "./components/logout/logout.component";
import { UserComponent } from "./components/user/user.component";

@NgModule({
  declarations: [
    LoginComponent,
    LogoutComponent,
    UserComponent
  ],
=======

@NgModule({
  declarations: [],
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
  imports: [
    CommonModule,
    AuthRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
<<<<<<< HEAD
    RouterModule
  ],
  exports: [
    LogoutComponent
=======
  ],
  exports: [
    
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
  ]
})
export class AuthModule {}
