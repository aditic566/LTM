import { Component, OnInit } from '@angular/core';
<<<<<<< HEAD
import { Supplier } from '../../types/Supplier';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { of } from 'rxjs';
import { SupplyLinkService } from '../../services/supplylink.service';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.scss'],
})
export class SupplierComponent implements OnInit {
  successMessage: string | null = null;
  errorMessage: string | null = null;
  supplierForm!: FormGroup;
  supplier: Supplier | null = null;

  constructor(
    private formBuilder: FormBuilder,
    private supplyLinkService: SupplyLinkService
  ) {}

  ngOnInit(): void {
    this.supplierForm = this.formBuilder.group({
      supplierName: ["", [Validators.required]],
      email: ["", [Validators.required, Validators.email]],
      phone: [""],
      address: [""],
      username: ["", [Validators.required, this.noSpecialCharacters]],
      password: ["", [Validators.required, Validators.minLength(8)]],
      role: ["", [Validators.required]]
    });
  }

  private noSpecialCharacters(control: any): { [key: string]: boolean } | null {
    const SPECIAL_CHARACTERS_REGEX = /[!@#$%^&*()_+{}\[\]:;<>,.?~\\/-]/;
    if (SPECIAL_CHARACTERS_REGEX.test(control.value)) {
      return { specialCharacters: true };
    }
    return null;
  }

  onSubmit(): void {
    if (this.supplierForm.valid) {
      this.supplyLinkService.addSupplier(this.supplierForm.value).subscribe({
        next: (response) => {
          this.supplier = response;
          this.successMessage = 'Supplier created successfully';
          this.errorMessage = null;
          this.supplierForm.reset();
        },
        error: (error) => this.handleError(error)
      });
    } else {
      this.errorMessage = 'Please fill out all required fields correctly.';
      this.successMessage = null;
    }
  }

  private handleError(error: HttpErrorResponse): void {
    if (error.error instanceof ErrorEvent) {
      this.errorMessage = `Client-side error: ${error.error.message}`;
    } else {
      this.errorMessage = `Server-side error: ${error.status} ${error.message}`;
      if (error.status === 400) {
        this.errorMessage = 'Bad request. Please check your input.';
      }
    }
    this.successMessage = null;
    console.error('An error occurred:', this.errorMessage);
  }

=======
import { AbstractControl, FormBuilder, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { Observable, of } from 'rxjs';
 
@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.scss']
})
export class SupplierComponent implements OnInit {
  supplierForm: FormGroup;
  supplierError$: Observable<string>;
  supplierSuccess$: Observable<string>;
 
  constructor(private fb: FormBuilder) {
    this.supplierError$ = of('');
    this.supplierSuccess$ = of('');
  }
 
  ngOnInit(): void {
    this.supplierForm = this.fb.group({
      supplierName: ['', [Validators.required]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required]],
      address: [''],
      username: ['', [Validators.required, this.noSpecialCharacters]],
      password: ['', [Validators.required, Validators.minLength(8)]],
      role: ['', [Validators.required]]
    });
  }
 
  noSpecialCharacters (controls : AbstractControl) : ValidationErrors | null {
    const patternData = /^[a-zA-Z0-9]+$/;
    if(patternData.test(controls.value)){
      return {invalid : false};
    }
    return {invalid : true};
  }
 
  onSubmit(): void {
    if (this.supplierForm.valid) {
      const newSupplier = this.supplierForm.value;
      console.log('New Supplier:', newSupplier);
      // Handle form submission, e.g., call a service to save the supplier
      this.supplierSuccess$ = of('Supplier added successfully!');
      this.supplierError$ = of('');
    } else {
      this.supplierError$ = of('Form is invalid. Please fix the errors and try again.');
      this.supplierSuccess$ = of('');
    }
  }
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}
