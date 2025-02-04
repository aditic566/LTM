import { Injectable } from "@angular/core";
import {
  HttpInterceptor,
  HttpRequest,
  HttpHandler,
  HttpEvent,
} from "@angular/common/http";
import { Observable } from "rxjs";
import { AuthService } from "./auth/services/auth.service";

@Injectable()
export class AuthInterceptor implements HttpInterceptor {
<<<<<<< HEAD
  constructor(private authService: AuthService) { }
  intercept(
    request: HttpRequest<any>,
    next: HttpHandler
  ): Observable<HttpEvent<any>> {

    const token = this.authService.getToken();

    if (request.url.includes("login") || request.url.includes("add-user")) {
      return next.handle(request);
    }

    if (token) {
      request = request.clone({
        setHeaders: {
          "Content-Type": "application/json; charset=utf-8",
          Accept: "application/json",
          Authorization: `Bearer ${token}`,
        },
      });
    }

    return next.handle(request);
  }
=======
  constructor(private authService:AuthService){}
  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    if(req.url.includes('/login') || req.url.includes('/register')){
      return next.handle(req);
    }
    const token=localStorage.getItem('token');
    req=req.clone({
      headers:req.headers.set('Authorization','bearer'+token)});
      return next.handle(req);
  }
  
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}
