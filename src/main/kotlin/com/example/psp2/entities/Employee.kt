package com.example.psp2.entities

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "employees")
data class Employee(
        @Id val id: String,
        val name: String,
        val wage: Double,
        val position: String
)