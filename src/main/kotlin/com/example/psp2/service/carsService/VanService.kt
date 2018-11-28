package com.example.psp2.service.carsService

import com.example.psp2.entities.employees.EmployeeCars.Car
import com.example.psp2.entities.employees.EmployeeCars.Van
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier(value = "vanService")
class VanService : BaseCarsService() {

    override fun getSpecific(): List<Car> {
        val vans = mutableListOf<Van>()
        for (item in carsRepo.findAll()) {
            if (item is Van) {
                vans.add(item)
            }
        }
        return vans
    }
}