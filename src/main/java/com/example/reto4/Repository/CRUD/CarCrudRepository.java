package com.example.reto4.Repository.CRUD;

import com.example.reto4.Model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarCrudRepository extends CrudRepository<Car, Integer> {
}
