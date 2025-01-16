 
import { Component } from '@angular/core';
import { Warehouse } from '../../types/Warehouse';
 
@Component({
  selector: 'app-warehousesample',
  standalone: true,
  imports: [],
  templateUrl: './warehousesample.component.html',
  styleUrls: ['./warehousesample.component.css']
})
export class WarehouseSampleComponent {
  warehouse: Warehouse = new Warehouse(1, "1234", "Warehouse1", "Hyderabad", 19);
 
}