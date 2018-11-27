package com.example.psp2.entities.employees

import javax.persistence.DiscriminatorColumn
import javax.persistence.Entity
import javax.persistence.Id

@DiscriminatorColumn
@Entity
open class Employee {
    @Id
    var id: String? = null
    var wage: Double? = null
    var name: String? = null
    var position: String? = null
}
