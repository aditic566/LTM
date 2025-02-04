import { Component } from '@angular/core';
<<<<<<< HEAD
import { Supplier } from '../../types/Supplier';

@Component({
  selector: 'app-suppliersample',
  standalone: true,
  imports: [],
  templateUrl: './suppliersample.component.html',
  styleUrls: ['./suppliersample.component.css'] 
})
export class SupplierSampleComponent {
  supplier:Supplier = new Supplier(1, "John Wane", "johnwane@gmail.com", "9876543210", "texas", "johnwane", "July@101", "USER");
=======
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Supplier } from '../../types/Supplier';
import { of } from 'rxjs';
 
@Component({
  selector: 'app-suppliersample',
  standalone: true,
  imports: [], // Add necessary imports
  templateUrl: './suppliersample.component.html',
  styleUrls: ['./suppliersample.component.css']
})
export class SupplierSampleComponent {
  // Component logic goes here
  supplier : Supplier = new Supplier(1, "John Wane", "johnwane@gmail.com", "9876543210", "texas", "johnewane", "July@101", "USER");
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}