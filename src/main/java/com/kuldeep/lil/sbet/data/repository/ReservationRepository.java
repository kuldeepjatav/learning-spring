package com.kuldeep.lil.sbet.data.repository;

import com.kuldeep.lil.sbet.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {
    Iterable<Reservation> findReservationByResDate(Date date);
}
