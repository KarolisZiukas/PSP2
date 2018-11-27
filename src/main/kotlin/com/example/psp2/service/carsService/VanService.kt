package com.example.psp2.service.carsService

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.entities.employees.EmployeeCars.Van
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier(value = "vanService")
class VanService: BaseCarsService(){

    override fun getSpecificCars(): List<Van> {
        val vans = mutableListOf<Van>()
        for (item in carsRepo.findAll()) {
            if(item is Van) {
                vans.add(item)
            }
        }
        return vans
    }
}