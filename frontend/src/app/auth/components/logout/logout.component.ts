<<<<<<< HEAD
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
=======
import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
>>>>>>> 8351afc1423865327955609d48f17be0b494154f

@Component({
    selector: 'app-logout',
    templateUrl: './logout.component.html',
    styleUrls: ['./logout.component.scss']
})
<<<<<<< HEAD
export class LogoutComponent implements OnInit {

    constructor(private router: Router) { }

    ngOnInit(): void {
    }

    logout(): void {
        localStorage.removeItem('token')
        this.router.navigate(["/auth"]);
    }

}
=======

export class Logout implements OnInit{
    constructor(private router:Router){}
    ngOnInit(): void {
        
    }

    logout():void{
        localStorage.removeItem('token');
        this.router.navigate(['/auth']);
    }
}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
