import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NGOsComponent } from './ngos.component';

describe('NGOsComponent', () => {
  let component: NGOsComponent;
  let fixture: ComponentFixture<NGOsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NGOsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NGOsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
