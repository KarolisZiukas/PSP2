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
                emp.id = "2"
                emp.name = "James"
                emp.position = "designer"
                emp.wage = 2.5
            } else {
                emp = Manager()
                emp.id = "3"
                emp.name = "James"
                emp.position = "manager"
                emp.wage = 2.5
            }
            return emp
    }
}
