import { Component } from '@angular/core';

@Component({
  selector: 'app-practice-form',
  templateUrl: './practice-form.component.html',
  styleUrls: ['./practice-form.component.css']
})
export class PracticeFormComponent {
  firstName?:String;
  lastName?:String;

  onClick(){
    alert(this.firstName +" " + this.lastName);
  }
}
