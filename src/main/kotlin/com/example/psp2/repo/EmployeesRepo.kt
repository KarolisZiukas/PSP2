package com.example.psp2.repo

import com.example.psp2.entities.employees.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeesRepo: JpaRepository<Employee, String>