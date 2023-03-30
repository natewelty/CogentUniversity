import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PracticetableComponent } from './practicetable.component';

describe('PracticetableComponent', () => {
  let component: PracticetableComponent;
  let fixture: ComponentFixture<PracticetableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PracticetableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PracticetableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
