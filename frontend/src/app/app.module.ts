import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
<<<<<<< HEAD
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
=======
import { HttpClientModule } from '@angular/common/http';
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';  
import { AuthInterceptor } from './auth.interceptors';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
<<<<<<< HEAD
    AppRoutingModule
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: AuthInterceptor,
      multi: true,
    },
=======
    AppRoutingModule 
  ],
  providers: [
    AuthInterceptor
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
