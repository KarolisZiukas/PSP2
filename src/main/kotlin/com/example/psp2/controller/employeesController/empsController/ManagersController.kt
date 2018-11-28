package com.example.psp2.controller.employeesController.empsController

import com.example.psp2.entities.employees.Employee
import com.example.psp2.service.PspService
import com.example.psp2.service.employeesService.EmployeesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/employees/managers")
class ManagersController {

    @Autowired
    @Qualifier("managersService")
    lateinit var employeesService: PspService<Employee>

    @GetMapping("/getAll")
    fun getDesigners(): List<Employee> {
        return employeesService.getSpecific()
    }
}