package com.example.psp2

import com.example.psp2.service.carsService.FacadeCarService
import com.example.psp2.service.carsService.WorkingCarsFacadeServiceImpl
import com.example.psp2.service.employeesService.FacadeEmployeesService
import com.example.psp2.service.employeesService.SeniorEmployeesFacadeServiceImpl
import com.example.psp2.service.workplaceService.FacadeWPService
import com.example.psp2.service.workplaceService.FinishedPlaceServiceImpl
import org.springframework.context.annotation.Bean

//@Configuration
class AppConfigB {

    @Bean
    fun carService(): FacadeCarService {
        return WorkingCarsFacadeServiceImpl()
    }

    @Bean
    fun empService(): FacadeEmployeesService {
        return SeniorEmployeesFacadeServiceImpl()
    }

    @Bean
    fun workplaceService(): FacadeWPService {
        return FinishedPlaceServiceImpl()
    }
}