package com.example.psp2.controller.employeesController.empsController

import com.example.psp2.entities.employees.Employee
import com.example.psp2.service.EmployeesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.ui.Model
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
    fun getEmployees(model: Model): String {
        model.addAttribute("employees", Employee())
        return "index"
    }

    @PostMapping("/employees/add")
    fun submitEmployee(@RequestBody employees: Employee): Employee {
        employeesService.importData(employees)
        return employees
    }

//    @PostMapping("/employees/import")
//    fun importData(@RequestBody employees: Employee){
//        employeesService.importData(employees)
//    }
}

