import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
<<<<<<< HEAD
import { DashboardComponent } from "./components/dashboard/dashboard.component";
import { SupplierComponent } from "./components/supplier/supplier.component";
=======
import { SupplierComponent } from "./components/supplier/supplier.component";
import { DashboardComponent } from "./components/dashboard/dashboard.component";
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
import { WarehouseComponent } from "./components/warehouse/warehouse.component";
import { ProductComponent } from "./components/product/product.component";
import { SupplierEditComponent } from "./components/supplieredit/supplieredit.component";
import { WarehouseEditComponent } from "./components/warehouseedit/warehouseedit.component";

const routes: Routes = [
<<<<<<< HEAD
  { path: "", component: DashboardComponent },
  { path: "supplier", component: SupplierComponent },
  { path: "warehouse", component: WarehouseComponent },
  { path: "product", component: ProductComponent },
  { path: "supplier/edit", component: SupplierEditComponent },
  { path: "warehouse/edit", component: WarehouseEditComponent },
=======
  {path : '', redirectTo : '/dashboard', pathMatch : 'full'},
  {path : 'dashboard', component : DashboardComponent},
  {path : 'supplier', component : SupplierComponent},
  {path : 'warehouse', component : WarehouseComponent},
  {path : 'product', component : ProductComponent},
  {path : 'supplierEdit', component : SupplierEditComponent},
  {path : 'warehouseEdit', component : WarehouseEditComponent}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
<<<<<<< HEAD
export class SupplyLinkRoutingModule {}
=======
export class SupplyLinkRoutingModule {}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
