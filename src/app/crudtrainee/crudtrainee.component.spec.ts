import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrudtraineeComponent } from './crudtrainee.component';

describe('CrudtraineeComponent', () => {
  let component: CrudtraineeComponent;
  let fixture: ComponentFixture<CrudtraineeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CrudtraineeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CrudtraineeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
