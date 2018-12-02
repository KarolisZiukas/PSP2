package com.example.psp2.entities.employees.EmployeeCars

import javax.persistence.DiscriminatorColumn
import javax.persistence.Entity
import javax.persistence.Id

@DiscriminatorColumn
@Entity
open class Car {
    @Id
    var id: String? = null
    var make: String? = null
    var model: String? = null
    var isBroken: Boolean? = null
    var type: String? = null
}