package com.example.reto4.Controller;

import com.example.reto4.Model.Car;
import com.example.reto4.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")  //acepte todas las peticiones entrantes
@RequestMapping("/api/Car")
public class CarController {
    @Autowired
    private CarService carService;
    @GetMapping("/all")  //
    public List<Car> getAll(){
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCar(@PathVariable int id){
        return carService.getCar(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Car Save(@RequestBody Car car){
        return carService.save(car);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Car update(@RequestBody  Car car){
        return carService.update(car);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable int id){
        return carService.delete(id);
    }



}
