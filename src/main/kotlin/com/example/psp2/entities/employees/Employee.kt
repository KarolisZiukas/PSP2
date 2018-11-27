package com.example.psp2.entities.employees

import javax.persistence.DiscriminatorColumn
import javax.persistence.Entity
import javax.persistence.Id

@DiscriminatorColumn
@Entity
open class Employee {
    @Id
    open var id: String? = null
    open var wage: Double? = null
    open var name: String? = null
    open var position: String? = null
}
