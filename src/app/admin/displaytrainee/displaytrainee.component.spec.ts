import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplaytraineeComponent } from './displaytrainee.component';

describe('DisplaytraineeComponent', () => {
  let component: DisplaytraineeComponent;
  let fixture: ComponentFixture<DisplaytraineeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DisplaytraineeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DisplaytraineeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
