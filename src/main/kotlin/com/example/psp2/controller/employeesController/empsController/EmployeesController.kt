package com.example.psp2.controller.employeesController.empsController

import com.example.psp2.entities.employees.Employee
import com.example.psp2.service.PspService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RestController
class EmployeesController {

    @Autowired
    @Qualifier("managersService")
    lateinit var employeesService: PspService<Employee>

    @RequestMapping("/")
    fun test(): String {
        return "TESTAS"
    }

    @GetMapping("/employees")
    fun getEmployees(model: Model): List<Employee> {
        return employeesService.getAll()
    }

    @PostMapping("/employees/add")
    fun submitEmployee(@RequestBody employees: Employee): Employee {
        employeesService.import(employees)
        return employees
    }
}

