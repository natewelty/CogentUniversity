import { Component } from '@angular/core';

@Component({
  selector: 'app-book',
  templateUrl:'book.component.html',
  
  styleUrls: ['./book.component.css']
})
export class BookComponent {
  toggleBooks(){
    if (this.showBooks){
      this.showBooks=false;
    }
    else{
      this.showBooks=true;
    }
  }
  showBooks:boolean=true;
  books:any[]=[
    {"id":1,"title":"This","pages":252, "price":23.25},
    {"id":2,"title":"That","pages":27, "price":25.25},
    {"id":3,"title":"There","pages":325, "price":27.25},
    {"id":4,"title":"Here","pages":251, "price":29.25},
    {"id":5,"title":"The Other","pages":725, "price":33.25}
    
  ];

}
