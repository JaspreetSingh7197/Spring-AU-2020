import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplComponent } from './displ.component';

describe('DisplComponent', () => {
  let component: DisplComponent;
  let fixture: ComponentFixture<DisplComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
