import { Component, Input, OnInit } from "@angular/core";

@Component({
    selector:'appchild',
    templateUrl:'./child.component.html'
})
export class ChildComponent implements OnInit
{

    @Input()
    greetMessage:string="Gyanendra";
    constructor(){}
    ngOnInit(): void {
        
    }
}