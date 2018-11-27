package com.example.psp2.service.carsService

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.factory.CarsFactory
import com.example.psp2.repo.CarsRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier(value = "baseService")
abstract class BaseCarsService: CarService {

    @Autowired
    lateinit var carsFactory: CarsFactory

    @Autowired
    lateinit var carsRepo: CarsRepo

    override fun getAllCars(): List<Car> {
        return carsRepo.findAll()
    }

    override fun importCar(car: Car) {
        carsRepo.save(carsFactory.getModel(car))
    }
}