package com.example.psp2.repo

import com.example.psp2.entities.employees.EmployeeCars.Car
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarsRepo: JpaRepository<Car, String>