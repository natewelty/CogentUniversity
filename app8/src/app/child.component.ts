import { Component, Input, Output,EventEmitter } from "@angular/core";

@Component({
    selector:'appchild',
    templateUrl:'./child.component.html'
})
export class ChildComponent
{

    @Output()  
    valueChange = new EventEmitter();
    counter = 0;
    valueChanged()   {
       this.counter = this.counter + 1;
       this.valueChange.emit(this.counter);
    }
    
 
}