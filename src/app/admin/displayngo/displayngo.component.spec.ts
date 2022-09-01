import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayngoComponent } from './displayngo.component';

describe('DisplayngoComponent', () => {
  let component: DisplayngoComponent;
  let fixture: ComponentFixture<DisplayngoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplayngoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplayngoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
