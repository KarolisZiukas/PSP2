package com.example.psp2.factory

import com.example.psp2.entities.employees.Designer
import com.example.psp2.entities.employees.Employee
import com.example.psp2.entities.employees.Manager
import org.springframework.stereotype.Component

@Component
class EmployeesFactory : BaseFactory<Employee>() {

    override fun getModel(model: Employee): Employee {
        return when {
            model.position == "designer" -> createModel(model, Designer())
            else -> createModel(model, Manager())
        }
    }

    override fun createModel(model: Employee, type: Employee): Employee {
        val emp: Employee?
        emp = type
        emp.id = model.id
        emp.name = model.name
        emp.wage = model.wage
        emp.experience = model.experience
        return emp
    }
}
