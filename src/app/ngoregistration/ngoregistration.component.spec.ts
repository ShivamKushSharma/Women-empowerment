import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgoregistrationComponent } from './ngoregistration.component';

describe('NgoregistrationComponent', () => {
  let component: NgoregistrationComponent;
  let fixture: ComponentFixture<NgoregistrationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgoregistrationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgoregistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
