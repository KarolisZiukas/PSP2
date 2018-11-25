package com.example.psp2.controller

import com.example.psp2.entities.Employee
import com.example.psp2.service.EmployeesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
open class EmployeesController {

    @Autowired
    lateinit var employeesService: EmployeesService

    @RequestMapping("/")
    fun test(): String {
        employeesService.getSpecificEmployees()
        employeesService.addEmployee(Employee("1", "James", 3.4, "DESIGNER"))
        return "TESTAS"
    }


}