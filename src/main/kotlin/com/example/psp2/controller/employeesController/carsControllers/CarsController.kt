package com.example.psp2.controller.employeesController.carsControllers

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.service.PspService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.*

@RestController
class CarsController {

    @Autowired
    @Qualifier("vanService")
    lateinit var carsService: PspService<Car>

    @GetMapping("/cars/get")
    fun getAll(): List<Car> {
        return carsService.getAll()
    }

    @PostMapping("/cars/add")
    fun add(@RequestBody model: Car): Car {
        carsService.import(model)
        return model
    }

}