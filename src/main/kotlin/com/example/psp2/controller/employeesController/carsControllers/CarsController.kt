package com.example.psp2.controller.employeesController.carsControllers

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.service.carsService.CarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RestController
class CarsController {

    @Autowired
    @Qualifier("vanService")
    lateinit var carsService: CarService

    @GetMapping("/cars/get")
    fun getCars(model: Model): List<Car> {
        return carsService.getAllCars()
    }

    @PostMapping("/cars/add")
    fun submitEmployee(@RequestBody car: Car): Car {
        carsService.importCar(car)
        return car
    }
}