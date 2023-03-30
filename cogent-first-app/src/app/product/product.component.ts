import { Component, OnInit } from '@angular/core';
import { ProductService } from '../ProductService';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {
  ngOnInit(): void {
    this.product=this.service.getData();
  }
  constructor(private service:ProductService){

  }
  product:any;
  buttonHeight = 100;
  buttonWidth = 100;
  
  addProduct(){
    alert("Product Created")
  }
  firstName = "Cogent";
  lastName = "Infotech";
}
