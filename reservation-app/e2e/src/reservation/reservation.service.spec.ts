import { TestBed } from '@angular/core/testing';
import {ReservationService} from "../../../src/reservation/reservation.service";



describe('ReservationService', () => {
    beforeEach(() => TestBed.configureTestingModule({}));

    it('should be created', () => {
        const service: ReservationService = TestBed.get(ReservationService);
        expect(service).toBeTruthy();
    });
});
