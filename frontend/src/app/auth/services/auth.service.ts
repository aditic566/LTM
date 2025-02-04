import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { environment } from "../../../environments/environment";
import { Observable } from "rxjs";
import { Supplier } from "../../supplylink/types/Supplier";

@Injectable({
  providedIn: "root",
})
export class AuthService {
  private loginUrl = `${environment.apiUrl}`;

<<<<<<< HEAD

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*'
    })
  };

=======
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
  constructor(private http: HttpClient) { }

  login(user: Partial<Supplier>): Observable<{ [key: string]: string }> {
    return this.http.post<{ token: string }>(
      `${this.loginUrl}/user/login`,
<<<<<<< HEAD
      user,
      this.httpOptions
=======
      user
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
    );
  }

  getToken() {
    return localStorage.getItem("token");
  }
  getRole() {
    return localStorage.getItem("role");
  }


  createUser(user: Supplier): Observable<Supplier> {
    return this.http.post<Supplier>(`${this.loginUrl}/user/register`, user);
  }
<<<<<<< HEAD
}
=======
}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
