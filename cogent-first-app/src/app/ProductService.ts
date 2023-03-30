import { Injectable } from "@angular/core";

@Injectable({
    providedIn: 'root'
})
export class ProductService{
    constructor(){

    }
    getData()
    {
        return{ title:"Dancing Shoes",
                price: 500
            }
    }
}