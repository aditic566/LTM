import { Component, OnInit } from "@angular/core";
import { FormBuilder, FormGroup, Validators } from "@angular/forms";

@Component({
    selector: 'app-warehouse',
    templateUrl: './warehouse.component.html',
    styleUrls: ['./warehouse.component.scss']
  })

export class WarehouseComponent implements OnInit{
    warehouseForm:any;
    
    constructor(private fb:FormBuilder){}

    ngOnInit():void{
        this.warehouseForm=this.fb.group({
            warehouseId:[''], 
            supplierId:['',[Validators.required,Validators.min(1)]],
            warehouseName:['',Validators.required],
            location:[''],
            capacity:['',[Validators.required,Validators.min(0)]]
        });
    }
    onSubmit():void{        
        throw new Error('Method not implemented.');
    }
}
