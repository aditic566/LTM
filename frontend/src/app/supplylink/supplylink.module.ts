import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";

import { SupplyLinkRoutingModule } from "./supplylink-routing.module";
import { ReactiveFormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
<<<<<<< HEAD
import { RouterModule } from "@angular/router";
import { ProductComponent } from "./components/product/product.component";
import { SupplierComponent } from "./components/supplier/supplier.component";
import { WarehouseComponent } from "./components/warehouse/warehouse.component";
import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { SharedModule } from "../shared/shared.module";
import { SupplierEditComponent } from "./components/supplieredit/supplieredit.component";
import { WarehouseEditComponent } from "./components/warehouseedit/warehouseedit.component";
=======
import { SupplierComponent } from "./components/supplier/supplier.component";
import { WarehouseComponent } from "./components/warehouse/warehouse.component";
import { RouterModule } from "@angular/router";
import { ProductComponent } from "./components/product/product.component";
>>>>>>> 8351afc1423865327955609d48f17be0b494154f

@NgModule({
  declarations: [
    ProductComponent,
    SupplierComponent,
<<<<<<< HEAD
    WarehouseComponent,
    DashboardComponent,
    SupplierEditComponent,
    WarehouseEditComponent
=======
    WarehouseComponent
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
  ],
  imports: [
    CommonModule,
    SupplyLinkRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
<<<<<<< HEAD
    RouterModule,
    SharedModule
  ],
  exports: [

  ]
})
export class SupplyLinkModule { }
=======
    RouterModule
  ],
  exports: [
    
  ]
})
export class SupplyLinkModule {}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
