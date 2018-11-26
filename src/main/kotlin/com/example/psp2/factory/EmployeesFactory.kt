package com.example.psp2.factory

import com.example.psp2.entities.Designer
import com.example.psp2.entities.Employee
import com.example.psp2.entities.Manager
import org.springframework.stereotype.Component
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

class EmployeesFactory : BaseFactory() {

//    override fun <T : Any?> getModel(position: String): T {
//            var emp: Employee?
//            if (position == "manager") {
//                emp = Designer()
//                emp.id = "2"
//                emp.name = "James"
//                emp.position = "designer"
//                emp.wage = 2.5
//            } else {
//                emp = Manager()
//                emp.id = "3"
//                emp.name = "James"
//                emp.position = "manager"
//                emp.wage = 2.5
//            }
//            return emp as T
//    }
}
