import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ServerComponent } from './server/server.component';
import { TestComponentComponent } from './test-component/test-component.component';
import { WarningAlertComponent } from './warning-alert/warning-alert.component';
import { SuccessAlertComponent } from './success-alert/success-alert.component';
import { ProductComponent } from './product/product.component';
import { FormsModule } from '@angular/forms';
import { GameControlComponent } from './game-control/game-control.component';
import { OddComponent } from './odd/odd.component';
import { EvenComponent } from './even/even.component';
import { BookComponent } from './book/book.component';
import { ProductService } from './ProductService';
import { LoginComponent } from './login/login.component';
import { PracticeFormComponent } from './practice-form/practice-form.component';
import { PracticetableComponent } from './practicetable/practicetable.component';


@NgModule({
  declarations: [
    AppComponent,ServerComponent, TestComponentComponent, WarningAlertComponent, SuccessAlertComponent, 
    ProductComponent, GameControlComponent, OddComponent, EvenComponent, BookComponent, LoginComponent, PracticeFormComponent,PracticetableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
