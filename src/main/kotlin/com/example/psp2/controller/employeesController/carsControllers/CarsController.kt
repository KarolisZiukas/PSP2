package com.example.psp2.controller.employeesController.carsControllers

import com.example.psp2.entities.employees.Employee
import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.service.carsService.FacadeCarService
import com.example.psp2.service.employeesService.EmployeeService
import com.example.psp2.service.employeesService.FacadeEmployeesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.*

@RestController
class CarsController {

    @Autowired
    lateinit var carsService: FacadeCarService

    @Autowired
    lateinit var employeeService: FacadeEmployeesService

    @GetMapping("/cars/get")
    fun getAll(): List<Car> {
        return carsService.getAll()
    }

    @PostMapping("/cars/add")
    fun add(@RequestBody model: Car): Car {
        carsService.import(model)
        return model
    }

    @GetMapping("cars/{type}")
    fun getType(@PathVariable type: String): List<Car> {
        return carsService.getByType(type)
    }

    //Emp

    @GetMapping("/emp/get")
    fun getAllEmployees(): List<Employee> {
        return employeeService.getAll()
    }

    @PostMapping("/emp/add")
    fun addEmployee(@RequestBody model: Employee): Employee {
        employeeService.import(model)
        return model
    }

    @GetMapping("emp/{experience}")
    fun getByExperience(@PathVariable experience: String): List<Car> {
        return carsService.getByType(experience)
    }

}