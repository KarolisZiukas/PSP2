package com.example.psp2.entities.employees.EmployeeCars

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import javax.persistence.DiscriminatorColumn
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Inheritance

@DiscriminatorColumn
@Entity
@Inheritance
@JsonDeserialize()
abstract class Car {
    @Id
    var id: String? = null
    var make: String? = null
    var model: String? = null
    var isBroken: Boolean? = null
    var type: String? = null
}