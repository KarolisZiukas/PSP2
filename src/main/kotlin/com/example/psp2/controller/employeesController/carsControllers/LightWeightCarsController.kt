package com.example.psp2.controller.employeesController.carsControllers

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.service.PspService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cars/lw")
class LightWeightCarsControlle {

    @Autowired
    @Qualifier("lightWeightCarService")
    lateinit var carsService: PspService<Car>


    @GetMapping("/getAll")
    fun getSpecific(): List<Car> {
        return carsService.getSpecific()
    }
}