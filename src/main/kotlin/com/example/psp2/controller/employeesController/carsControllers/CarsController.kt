package com.example.psp2.controller.employeesController.carsControllers

import com.example.psp2.AppConfigA
import com.example.psp2.entities.employees.Employee
import com.example.psp2.entities.employees.EmployeeCars.Car
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class CarsController {

   @Autowired
   lateinit var appConfig: AppConfigA

    @GetMapping("/cars/get")
    fun getAll(): List<Car> {
        return appConfig.carService().getAll()
    }

    @PostMapping("/cars/add")
    fun add(@RequestBody model: Car): Car {
        appConfig.carService().import(model)
        return model
    }

    @GetMapping("cars/{type}")
    fun getType(@PathVariable type: String): List<Car> {
        return appConfig.carService().getByType(type)
    }

    //Emp

    @GetMapping("/emp/get")
    fun getAllEmployees(): List<Employee> {
        return appConfig.empService().getAll()
    }

    @PostMapping("/emp/add")
    fun addEmployee(@RequestBody model: Employee): Employee {
        appConfig.empService().import(model)
        return model
    }

    @GetMapping("emp/{position}")
    fun getByPosition(@PathVariable position: String): List<Employee> {
        return appConfig.empService().getByPosition(position)
    }

}