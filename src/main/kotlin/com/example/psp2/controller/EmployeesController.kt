package com.example.psp2.controller

import com.example.psp2.entities.employees.Employee
import com.example.psp2.service.EmployeesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class EmployeesController {

    @Autowired
    @Qualifier("managersService")
    lateinit var employeesService: EmployeesService

    @RequestMapping("/")
    fun test(): String {
        return "TESTAS"
    }

    @GetMapping("/employees")
    fun getEmployees(model: Model): String{
        model.addAttribute("employees", Employee())
        return "index"
    }

    @PostMapping("/employees")
    fun submitEmployee(@ModelAttribute employees: Employee): String {
        return "result"
    }

    @GetMapping("/employees/import")
    fun importData(){
        employeesService.importData()
    }
}

