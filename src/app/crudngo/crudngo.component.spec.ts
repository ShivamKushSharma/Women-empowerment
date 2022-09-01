import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CrudngoComponent } from './crudngo.component';

describe('CrudngoComponent', () => {
  let component: CrudngoComponent;
  let fixture: ComponentFixture<CrudngoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CrudngoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CrudngoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
