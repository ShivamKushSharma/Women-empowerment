import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditngoComponent } from './editngo.component';

describe('EditngoComponent', () => {
  let component: EditngoComponent;
  let fixture: ComponentFixture<EditngoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditngoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EditngoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
