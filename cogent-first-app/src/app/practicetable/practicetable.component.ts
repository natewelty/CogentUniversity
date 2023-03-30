import { Component } from '@angular/core';

@Component({
  selector: 'app-practicetable',
  templateUrl: './practicetable.component.html',
  styleUrls: ['./practicetable.component.css']
})
export class PracticetableComponent {
  tableData = [new ProductData(1001, "Pen Drive", 1, "https://www.topicboy.com/wp-content/uploads/2018/05/Pen-Drive-6-1024x724.png"),
  new ProductData(1002, "T-Shirt", 4, "https://agnesb-agnesb-com-storage.omn.proximis.com/Imagestorage/imagesSynchro/600/800/8549751afbff06c38dcae58ee01a808bd850ca3c_2653J000_010_1.jpeg"),
  new ProductData(1003, "Tie", 1, "https://media.istockphoto.com/id/1146412896/photo/blue-silk-tie-on-white-background.jpg?s=612x612&w=is&k=20&c=35aA7s_gdhZTE_EFOLzKMgRZjsCsdJSKNyzjmVaDuHI=")];
  
  onClick(index:number){
    this.tableData[index].show=false;
  }

}
class ProductData {
  itemNo: number;
  itemName: string;
  itemPrice: number;
  itemImageSrc: string;
  show: boolean;


  constructor(itemNo: number, itemName: string, itemPrice: number, itemImageSrc: string) {
    this.itemNo = itemNo;
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.itemImageSrc = itemImageSrc;
    this.show = true;
  }
}
