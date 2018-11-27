package com.example.psp2.factory

import com.example.psp2.entities.employees.Designer
import com.example.psp2.entities.employees.Employee
import com.example.psp2.entities.employees.Manager
import org.springframework.stereotype.Component

@Component
class EmployeesFactory : BaseFactory<Employee>() {

    override fun getModel(position: Employee): Employee {
            var emp: Employee?
            if (position.position == "designer") {
                emp = Designer()
                emp.id = position.id
                emp.name = position.name
                emp.position = position.position
                emp.wage = position.wage
            } else {
                emp = Manager()
                emp.id = position.id
                emp.name = position.name
                emp.position = position.position
                emp.wage = position.wage
            }
            return emp
    }
}
