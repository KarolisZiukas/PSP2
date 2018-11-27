package com.example.psp2.entities.employees.EmployeeCars

import javax.persistence.Id

open class Car {
    @Id
    var id: String? = null
    var make: String? = null
    var model: String? = null
}