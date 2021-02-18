package com.kuldeep.lil.learningspring.data.repository;

import com.kuldeep.lil.learningspring.data.entity.Reservation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Long> {
    Iterable<Reservation> findReservationByResDate(Date date);
}
