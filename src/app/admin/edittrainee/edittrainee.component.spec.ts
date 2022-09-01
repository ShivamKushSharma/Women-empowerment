import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EdittraineeComponent } from './edittrainee.component';

describe('EdittraineeComponent', () => {
  let component: EdittraineeComponent;
  let fixture: ComponentFixture<EdittraineeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EdittraineeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EdittraineeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
