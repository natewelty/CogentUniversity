import { Component,EventEmitter } from '@angular/core';


@Component({
  selector: 'app-game-control',
  templateUrl: './game-control.component.html',
  styleUrls: ['./game-control.component.css']
})
export class GameControlComponent {

intervalID: any;
gameCounter= {
  gameCounterEE : new EventEmitter<number>(),
  i:0
}
start(){
  this.intervalID=setInterval(()=>{
    this.gameCounter.i++;
    this.gameCounter.gameCounterEE.emit(this.gameCounter.i);
  },1000);
}
stop(){
  clearInterval(this.intervalID)
}

}
