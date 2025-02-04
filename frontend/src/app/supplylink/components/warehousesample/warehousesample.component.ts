<<<<<<< HEAD
import { Component } from '@angular/core';
import { Warehouse } from '../../types/Warehouse';

=======
 
import { Component } from '@angular/core';
import { Warehouse } from '../../types/Warehouse';
 
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
@Component({
  selector: 'app-warehousesample',
  standalone: true,
  imports: [],
  templateUrl: './warehousesample.component.html',
  styleUrls: ['./warehousesample.component.css']
})
export class WarehouseSampleComponent {
<<<<<<< HEAD

}
=======
  warehouse: Warehouse = new Warehouse(1, "1234", "Warehouse1", "Hyderabad", 19);
 
}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
