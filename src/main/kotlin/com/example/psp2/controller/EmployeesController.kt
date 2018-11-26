package com.example.psp2.controller

import com.example.psp2.entities.Employee
import com.example.psp2.service.EmployeesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.*

@RestController
class EmployeesController {

    @Autowired
    @Qualifier("managersService")
    lateinit var employeesService: EmployeesService

    @RequestMapping("/")
    fun test(): String {
        return "TESTAS"
    }

    @GetMapping("/employees")
    fun getEmployees(): List<Employee> {
        return employeesService.getAllEmployees()
    }

    @GetMapping("/employees/import")
    fun importData(){
        employeesService.importData()
    }
}

