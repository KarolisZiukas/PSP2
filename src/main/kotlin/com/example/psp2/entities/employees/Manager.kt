package com.example.psp2.entities.employees

import javax.persistence.Entity

@Entity
class Manager : Employee() {
    override val position: String? = "Manager"
}
