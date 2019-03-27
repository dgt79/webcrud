import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AdomainListComponent } from './adomain-list.component';

describe('AdomainListComponent', () => {
  let component: AdomainListComponent;
  let fixture: ComponentFixture<AdomainListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AdomainListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AdomainListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
