import { Component } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {
  product = {
    title:"Bat",
    price:500
  }
  buttonHeight = 100;
  buttonWidth = 100;
  addProduct(){
    alert("Product Created")
  }
  firstName = "Cogent";
  lastName = "Infotech";
}
