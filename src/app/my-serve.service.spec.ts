import { TestBed } from '@angular/core/testing';

import { MyServeService } from './my-serve.service';

describe('MyServeService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: MyServeService = TestBed.get(MyServeService);
    expect(service).toBeTruthy();
  });
});
