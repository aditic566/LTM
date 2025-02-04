import { Component } from '@angular/core';
<<<<<<< HEAD
import { Supplier } from '../../types/Supplier'
=======
import { Supplier } from '../../types/Supplier';
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-supplierrarray',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './supplierarray.component.html',
  styleUrls: ['./supplierarray.component.css']
})
export class SupplierArrayComponent {
<<<<<<< HEAD
  supplierList: Supplier[] = [
    new Supplier(1, "Jessica Alba", "jessica@gmail.com", "7368289682", "california", "jessica", "July@12221", "USER"),
    new Supplier(1, "John Wane", "johnwane@gmail.com", "9876543210", "texas", "johnwane", "July@101", "USER"),
    new Supplier(1, "Kristan", "kristan@gmail.com", "9364812638", "NYC", "kristan", "Julll@101", "USER")
  ]
=======
  supplierList:Supplier[]=[
    new Supplier(1, "Jessica Alba", "jessica@gmail.com", "7368289682", "california", "jessica", "July@12221", "USER"),
    new Supplier(1, "John Wane", "johnwane@gmail.com", "9876543210", "texas", "johnwane", "July@101", "USER"),
    new Supplier(1, "Kristan", "kristan@gmail.com", "9364812638", "NYC", "kristan", "Julll@101", "USER")
  ];
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}
