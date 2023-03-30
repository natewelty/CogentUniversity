import { Component } from '@angular/core';
import { Login } from '../login';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  model:Login;
  constructor(){
    this.model =new Login('asdasd','asdasd','asdasd','asdasd')
  }

  onSubmit(loginForm:any){
    console.log(loginForm.value);
    console.log(loginForm.status);
  }
}
