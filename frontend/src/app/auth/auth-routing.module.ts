import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
<<<<<<< HEAD
import { LoginComponent } from "./components/login/login.component";
import { UserComponent } from "./components/user/user.component";

const routes: Routes = [
  { path: "", component: LoginComponent },
  { path: "login", component: LoginComponent },
  { path: "add-user", component: UserComponent },
];
=======

const routes: Routes = [];
>>>>>>> 8351afc1423865327955609d48f17be0b494154f

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
<<<<<<< HEAD
export class AuthRoutingModule { }
=======
export class AuthRoutingModule {}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
