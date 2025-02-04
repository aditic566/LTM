import { Supplier } from "./Supplier";
<<<<<<< HEAD

export class Warehouse {
    warehouseId: number;
    supplier: Supplier;
    warehouseName: string;
    location: string;
    capacity: number;

    constructor(
        warehouseId: number,
        supplier: Supplier,
        warehouseName: string,
        location: string,
        capacity: number
    ) {
        this.warehouseId = warehouseId;
        this.supplier = supplier;
        this.warehouseName = warehouseName;
        this.location = location;
        this.capacity = capacity;
    }
}

=======
 
export class Warehouse {
    public warehouseId: number;
    public supplier: Supplier;
    public warehouseName: string;
    public location: string;
    public capacity: number;
 
    constructor(warehouseId: number, supplierId: string, warehouseName: string, location: string, capacity: number) {
    }
 
    public displayInfo(): void {
        console.log(`Warehouse ID: ${this.warehouseId}`);
        console.log(`Supplier ID: ${this.supplier}`);
        console.log(`Capacity: ${this.capacity}`);
        // console.log(`Warehouse Name: ${this.warehouseName}`);
        // console.log(`Location: ${this.location}`);
    }
}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
