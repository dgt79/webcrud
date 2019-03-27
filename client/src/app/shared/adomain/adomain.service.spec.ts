import { TestBed } from '@angular/core/testing';

import { AdomainService } from './adomain.service';

describe('AdomainService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: AdomainService = TestBed.get(AdomainService);
    expect(service).toBeTruthy();
  });
});
