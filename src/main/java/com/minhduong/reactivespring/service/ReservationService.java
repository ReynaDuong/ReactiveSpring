package com.minhduong.reactivespring.service;

import com.minhduong.reactivespring.model.Reservation;
import reactor.core.publisher.Mono;

public interface ReservationService {

    Mono<Reservation> getReservation(String id);

    Mono<Reservation> createReservation(Mono<Reservation> reservationMono);

    Mono<Reservation> updateReservationPrice(String id, Mono<Reservation> reservationMono);

    Mono<Boolean> deleteReservation(String id);
}
