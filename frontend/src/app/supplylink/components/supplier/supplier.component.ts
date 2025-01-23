import { Component, OnInit } from "@angular/core";
import { Supplier } from '../../types/Supplier';
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { of } from "rxjs";

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.scss']
})


export class SupplierComponent implements OnInit {
    supplierForm:FormGroup;
    submitted:boolean | undefined;
    supplierSuccess$:any;
    supplierError$:any;
    
    constructor(private fb:FormBuilder){}

    ngOnInit(): void {
        this.supplierForm=this.fb.group({
            name:['',[Validators.required]],
            email:['',[Validators.required]],
            username:['',[Validators.required]],
            password:['',[Validators.required]]
        });
    }

    onSubmit(){
        this.submitted=true;
        this.supplierSuccess$=of('');
        this.supplierError$=of('');
    }
}
