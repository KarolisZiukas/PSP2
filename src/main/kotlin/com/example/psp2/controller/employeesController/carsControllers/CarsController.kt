package com.example.psp2.controller.employeesController.carsControllers

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.service.carsService.VanService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.*

@RestController
class CarsController {

    @Autowired
    @Qualifier("vanService")
    lateinit var carsService: VanService

    @GetMapping("/cars/get")
    fun getAll(): List<Car> {
        return carsService.getAll()
    }

    @PostMapping("/cars/add")
    fun add(@RequestBody model: Car): Car {
        carsService.import(model)
        return model
    }

    @PutMapping("/cars/{id}")
    fun updateEmployee(@RequestBody car: Car) {
        carsService.update(car)
    }

}