export class Supplier {
 
    supllierId: number
    supplierName: string
    email: string
    phone: string
    address: string
    username:string
    password:string
    role?: string
 
    constructor(supplierId: number, supplierName: string, email:string, phone:string, address:string, username:string, password: string, role?:string ){
        this.supllierId = supplierId
        this.supplierName = supplierName
        this.email = email
        this.phone = phone
        this.address = address
        this.username= username
        this.password = password
        this.role = role
    }
    displayInfo() {
        console.log(`Supplier ID: ${this.supllierId}`)
        console.log(`Supplier name: ${this.supplierName}`)
        console.log(`email: ${this.email}`)
   
    }
   
}