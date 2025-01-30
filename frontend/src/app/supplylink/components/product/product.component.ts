import { Component, OnInit } from "@angular/core";
import { FormBuilder, Validators } from "@angular/forms";
import { Product } from "../../types/Product";

@Component({
    selector: 'app-product',
    templateUrl: './product.component.html',
    styleUrls: ['./product.component.scss']
  })
export class ProductComponent implements OnInit{
    productForm:any;
    productNew:Product;
    product:any;
    submitted:boolean=false;
    constructor(private fb:FormBuilder){}

    ngOnInit(): void {
        this.productForm=this.fb.group({
            productId:[''], 
            warehouseId:['',[Validators.required,Validators.min(1)]],
            productName:['',Validators.required],
            productDescription:[''], 
            quantity:['',[Validators.required,Validators.min(0)]],
            price:['',[Validators.required,Validators.min(1)]]
        })
        this.productNew=new Product(1,"2","xyz","xyz",10,10);
    }

    onSubmit():void{
        if(this.productForm.valid){
            this.submitted=true;
            this.product=this.productForm.value;
        }
    }
}
