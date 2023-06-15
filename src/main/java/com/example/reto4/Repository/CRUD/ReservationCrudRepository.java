package com.example.reto4.Repository.CRUD;

import com.example.reto4.Model.Reservation;
import org.springframework.data.repository.CrudRepository;


public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
