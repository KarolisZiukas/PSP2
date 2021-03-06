package com.example.psp2.domain.factory

import com.example.psp2.entities.employees.Cleaner
import com.example.psp2.entities.employees.Designer
import com.example.psp2.entities.employees.Employee
import com.example.psp2.entities.employees.Manager
import org.springframework.stereotype.Component

@Component
class EmployeesFactory : BaseFactory<Employee>() {

    override fun getModel(model: Employee): Employee {
        return when {
            model.position == "Designer" -> createModel(model, Designer())
            model.position == "Cleaner" -> createModel(model, Cleaner())
            else -> createModel(model, Manager())
        }
    }

    override fun createModel(model: Employee, type: Employee): Employee {
        val emp: Employee?
        emp = type
        emp.id = model.id
        emp.name = model.name
        emp.wage = model.wage
        emp.position = model.position
        emp.experience = model.experience
        return emp
    }
}
