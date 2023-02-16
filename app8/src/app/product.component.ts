import { Component, OnInit } from "@angular/core";

@Component({
    selector:'app-product',
    templateUrl:'./product.component.html'
})
export class ProductComponent
{

  displayCounter(count: any)   {
     console.log(count);
  }


}
