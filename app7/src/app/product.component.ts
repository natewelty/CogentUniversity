import { Component, OnInit } from "@angular/core";

@Component({
    selector:'app-product',
    templateUrl:'./product.component.html'
})
export class ProductComponent implements OnInit
{
  message="I am parent";
  childmessage="I am passed from parent to child";
    ngOnInit(): void {
        
    }
}