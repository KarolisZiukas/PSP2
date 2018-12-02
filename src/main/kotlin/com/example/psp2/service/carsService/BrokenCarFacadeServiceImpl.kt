package com.example.psp2.service.carsService

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.factory.CarsFactory
import com.example.psp2.repo.CarsRepo
import org.springframework.beans.factory.annotation.Autowired

class BrokenCarFacadeServiceImpl: FacadeCarService {

    @Autowired
    lateinit var carService: CarService

    @Autowired
    lateinit var carsRepo: CarsRepo

    @Autowired
    lateinit var carsFactory: CarsFactory

    override fun getAll(): List<Car> {
        return carService.getByCondition(carsRepo.findAll(), true)
    }

    override fun import(model: Car) {
        carsRepo.save(carsFactory.getModel(model))
    }

    override fun getByType(type: String): List<Car> {
        return carService.getByType(getAll(), type)
    }
}