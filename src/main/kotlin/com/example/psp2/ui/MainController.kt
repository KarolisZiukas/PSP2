package com.example.psp2.ui

import com.example.psp2.AppConfigA
import com.example.psp2.entities.employees.Employee
import com.example.psp2.entities.EmployeeCars.Car
import com.example.psp2.entities.Workplaces.Workplace
import com.example.psp2.service.carsService.FacadeCarService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class MainController {

   @Autowired
   lateinit var appConfig: AppConfigA

    @Autowired
    lateinit var carService: FacadeCarService

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

    @GetMapping("/places/get")
    fun getAllPlaces(): List<Workplace> {
        return appConfig.workplaceService().getAll()
    }

    @PostMapping("/places/add")
    fun addPlace(@RequestBody model: Workplace): Workplace {
        appConfig.workplaceService().import(model)
        return model
    }

    @GetMapping("palces/{city}")
    fun getByCity(@PathVariable city: String): List<Workplace> {
        return appConfig.workplaceService().getByCity(city)
    }

}