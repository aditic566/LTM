<<<<<<< HEAD

import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Product } from '../../types/Product';
import { Warehouse } from '../../types/Warehouse';
import { Observable, of } from 'rxjs';
import { SupplyLinkService } from '../../services/supplylink.service';

@Component({
    selector: 'app-product',
    templateUrl: './product.component.html',
    styleUrls: ['./product.component.scss']
})
export class ProductComponent implements OnInit {
    productForm!: FormGroup;
    warehouses: Observable<Warehouse[]>;
    productError: Observable<string> = of('');
    productSuccess: Observable<string> = of('');
    isFormSubmitted: boolean = false;
    userId: number;

    constructor(
        private formBuilder: FormBuilder,
        private supplyLinkService: SupplyLinkService
    ) { }

    ngOnInit() {
        this.userId = Number(localStorage.getItem("user_id"));
        this.productForm = this.formBuilder.group({
            warehouse: ["", Validators.required],
            productDescription: ["", Validators.required],
            productName: [null, Validators.required],
            quantity: [null, [Validators.required, Validators.min(0)]],
            price: [null, [Validators.required, Validators.min(1)]],
        });
        this.warehouses = this.supplyLinkService.getWarehousesBySupplier(this.userId);
    }

    onSubmit() {
        this.isFormSubmitted = true;
        this.productSuccess = of('');
        this.productError = of('');

        if (this.productForm.invalid) {
            return;
        }
        this.supplyLinkService.addProduct(this.productForm.value).subscribe({
            next: (response) => {
                this.productSuccess = of("Product created successfully");
                this.productForm.reset();
                this.isFormSubmitted = false;
            },
            error: (error) => this.productError = of("Unable to create product")
        });
    }
}
=======
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { Observable, of } from "rxjs";
import { Component } from "@angular/core";

@Component ( {
    selector : "app-product",
    template : "./product.component.html",
    styleUrls : ["./product.component.scss"]
})

export class ProductComponent {

  productForm: FormGroup;
  productError$: Observable<string>;
  productSuccess$: Observable<string>;

  constructor(private fb: FormBuilder) {
    this.productError$ = of('');
    this.productSuccess$ = of('');
  }

  ngOnInit(): void {
    this.productForm = this.fb.group({
      warehouseId: ['', [Validators.required, Validators.min(1)]],
      productName: ['', Validators.required],
      productDescription: [''],
      quantity : [0, [Validators.required, Validators.min(0)]],
      price: [0, [Validators.required, Validators.min(1)]]
    });
  }

  onSubmit(): void {
    if (this.productForm.valid) {
      const newSupplier = this.productForm.value;
      console.log('New Product:', newSupplier);
      // Handle form submission, e.g., call a service to save the supplier
      this.productSuccess$ = of('Product added successfully!');
      this.productError$ = of('');
    } else {
      this.productError$ = of('Form is invalid. Please fix the errors and try again.');
      this.productSuccess$ = of('');
    }
  }

}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
